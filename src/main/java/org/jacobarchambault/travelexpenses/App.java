package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;
import java.util.List;

import org.jacobarchambault.travelexpenses.amounts.BasicExpense;
import org.jacobarchambault.travelexpenses.amounts.Expenses;
import org.jacobarchambault.travelexpenses.amounts.NumberInput;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
	public static void main(final String[] args) {
		Application.launch(args);
	}

	// Fully covered expenses
	NumberInput airFare = new NumberInput();
	NumberInput tripDays = new NumberInput();
	Label allowedLabel = new Label();

	NumberInput carRental = new NumberInput();
	Label excessLabel = new Label();
	NumberInput registration = new NumberInput();
	Expenses expenses = new Expenses(
			List.of(new BasicExpense(airFare), new BasicExpense(carRental), new BasicExpense(registration)));
	Label totalExpenses = new Label();
	NumberInput milesDriven = new NumberInput();
	Label savedLabel = new Label();
	LabelGrid labelGrid = new LabelGrid(
			new Label("Total expenses: "),
			new Label("Allowable expenses: "),
			new Label("Excess expenses: "),
			new Label("Saved expenses: "),
			totalExpenses,
			allowedLabel,
			excessLabel,
			savedLabel);
	NumberInput lodging = new NumberInput();

	// Per diem expenses
	NumberInput meals = new NumberInput();

	NumberInput parking = new NumberInput();
	NumberInput taxi = new NumberInput();
	Expenses perDiemExpenses = new Expenses(
			List
					.of(
							new BasicExpense(meals),
							new BasicExpense(parking),
							new BasicExpense(taxi),
							new BasicExpense(lodging)));

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
												new MainExpensesGrid(
														new Label("Airfare: "),
														airFare,
														new Label("Car Rental: "),
														carRental,
														new Label("Registration: "),
														registration)),
										new TitledPane(
												"Per diem expenses",
												new PerDiemExpenseGrid(
														new Label("Days on the trip: "),
														tripDays,
														new Label("Meals (up to $47 per day): "),
														meals,
														new Label("Total parking fees (up to $20 per day): "),
														parking,
														new Label("Total taxi fees (up to $40 per day): "),
														taxi,
														new Label("Nightly lodging (up to $195 per day): "),
														lodging)),
										new TitledPane(
												"Gas mileage reimbursement",
												new HBox(
														new Label("Total miles driven: ($.40 reimbursed per mile): "),
														milesDriven)),
										labelGrid,
										new HBox(new EventButton("Calculate", e -> {
											final var basicAmount = expenses.total();
											final var mealsTotal = meals.total();
											final var parkingTotal = parking.total();
											final var taxiTotal = taxi.total();
											final var lodgingTotal = lodging.total();
											final var tripDaysTotal = tripDays.total();
											final var allowedMeals = tripDaysTotal * 47;
											final var allowedParking = tripDaysTotal * 20;
											final var allowedTaxi = tripDaysTotal * 40;
											final var allowedLodging = tripDaysTotal * 195;
											final var totalAmount = basicAmount + mealsTotal + parkingTotal + taxiTotal
													+ lodgingTotal;
											final var excess = excess(mealsTotal, allowedMeals)
													+ excess(parkingTotal, allowedParking)
													+ excess(taxiTotal, allowedTaxi)
													+ excess(lodgingTotal, allowedLodging);
											totalExpenses
													.setText(NumberFormat.getCurrencyInstance().format(totalAmount));
											allowedLabel
													.setText(
															NumberFormat
																	.getCurrencyInstance()
																	.format(
																			basicAmount + allowedMeals + allowedParking
																					+ allowedTaxi + allowedLodging));
											excessLabel.setText(NumberFormat.getCurrencyInstance().format(excess));
											savedLabel
													.setText(
															NumberFormat
																	.getCurrencyInstance()
																	.format(
																			totalAmount - excess
																					+ milesDriven.total() * .4));
										})))));
		primaryStage.setTitle("Travel expenses");
		primaryStage.show();
	}

	private double excess(final double total, final double allowed) {
		return total > allowed ? total - allowed : 0;
	}

}