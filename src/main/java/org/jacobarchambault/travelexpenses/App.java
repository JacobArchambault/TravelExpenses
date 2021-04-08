package org.jacobarchambault.travelexpenses;

import java.util.List;

import org.jacobarchambault.travelexpenses.amounts.BasicExpense;
import org.jacobarchambault.travelexpenses.amounts.Expenses;
import org.jacobarchambault.travelexpenses.amounts.NumberInput;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
	public static void main(final String[] args) {
		Application.launch(args);
	}

	NumberInput airFare = new NumberInput();
	CurrencyLabel allowedLabel = new CurrencyLabel();
	NumberInput carRental = new NumberInput();
	CurrencyLabel excessLabel = new CurrencyLabel();
	NumberInput registration = new NumberInput();
	Expenses expenses = new Expenses(
			List.of(new BasicExpense(airFare), new BasicExpense(carRental), new BasicExpense(registration)));
	NumberInput lodging = new NumberInput();
	NumberInput meals = new NumberInput();
	NumberInput milesDriven = new NumberInput();
	NumberInput parking = new NumberInput();
	SavedLabel savedLabel = new SavedLabel(milesDriven);
	NumberInput taxi = new NumberInput();
	CurrencyLabel totalExpenses = new CurrencyLabel();
	NumberInput tripDays = new NumberInput();

	@Override
	public void start(final Stage primaryStage) throws Exception {
		primaryStage
				.setScene(
						new Scene(
								new MasterVBox(
										10,
										new Insets(10),
										new TitledPane(
												"One-time expenses: ",
												new TwoColumnGrid(
														new Control[] { new Label("Airfare: "), airFare,
																new Label("Car Rental: "), carRental,
																new Label("Registration: "), registration })),
										new TitledPane(
												"Per diem expenses",
												new TwoColumnGrid(
														new Control[] { new Label("Days on the trip: "), tripDays,
																new Label("Meals (up to $47 per day): "), meals,
																new Label("Total parking fees (up to $20 per day): "),
																parking,
																new Label("Total taxi fees (up to $40 per day): "),
																taxi,
																new Label("Nightly lodging (up to $195 per day): "),
																lodging })),
										new TitledPane(
												"Gas mileage reimbursement",
												new HBox(
														new Label("Total miles driven: ($.40 reimbursed per mile): "),
														milesDriven)),
										new TwoColumnGrid(
												new Control[] { new Label("Total expenses: "), totalExpenses,
														new Label("Allowable expenses: "), allowedLabel,
														new Label("Excess expenses: "), excessLabel,
														new Label("Saved expenses: "), savedLabel }),
										new HBox(new EventButton("Calculate", e -> displayAll())))));
		primaryStage.setTitle("Travel expenses");
		primaryStage.show();
	}

	private void displayAll() {
		final var basicAmount = expenses.total();
		final var mealsTotal = meals.total();
		final var parkingTotal = parking.total();
		final var taxiTotal = taxi.total();
		final var lodgingTotal = lodging.total();
		final var totalAmount = basicAmount + mealsTotal + parkingTotal + taxiTotal + lodgingTotal;
		totalExpenses.display(totalAmount);
		final var tripDaysTotal = tripDays.total();
		final var allowedMeals = tripDaysTotal * 47;
		final var allowedParking = tripDaysTotal * 20;
		final var allowedTaxi = tripDaysTotal * 40;
		final var allowedLodging = tripDaysTotal * 195;
		allowedLabel.display(basicAmount + allowedMeals + allowedParking + allowedTaxi + allowedLodging);
		final var excess = excess(mealsTotal, allowedMeals) + excess(parkingTotal, allowedParking)
				+ excess(taxiTotal, allowedTaxi) + excess(lodgingTotal, allowedLodging);
		excessLabel.display(excess);
		savedLabel.display(totalAmount, excess);
	}

	private double excess(final double total, final double allowed) {
		return total > allowed ? total - allowed : 0;
	}

}