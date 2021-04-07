package org.jacobarchambault.travelexpenses;

import java.util.List;

import org.jacobarchambault.travelexpenses.amounts.Allowances;
import org.jacobarchambault.travelexpenses.amounts.Amount;
import org.jacobarchambault.travelexpenses.amounts.BasicExpense;
import org.jacobarchambault.travelexpenses.amounts.DailyAllowances;
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
	NumberInput carRental = new NumberInput();
	NumberInput registration = new NumberInput();

	NumberInput tripDays = new NumberInput();
	// Per diem expenses
	NumberInput meals = new NumberInput();
	NumberInput parking = new NumberInput();
	NumberInput taxi = new NumberInput();
	NumberInput lodging = new NumberInput();

	NumberInput milesDriven = new NumberInput();

	Label mainExpenseOutput = new Label("$0.00");

	List<Amount> basicExpenses = List
			.of(new BasicExpense(airFare), new BasicExpense(carRental), new BasicExpense(registration));
	Expenses expenses = new Expenses(
			List
					.of(
							basicExpenses,
							List
									.of(
											new BasicExpense(meals),
											new BasicExpense(parking),
											new BasicExpense(taxi),
											new BasicExpense(lodging))));
	Allowances allowances = new Allowances(basicExpenses, new DailyAllowances(tripDays, List.of(47, 20, 40, 195)));
	AmountLabel totalExpenses = new AmountLabel(expenses);
	AmountLabel allowedLabel = new AmountLabel(allowances);
	LabelGrid labelGrid = new LabelGrid(
			new Label("Total expenses: "),
			new Label("Allowable expenses: "),
			new Label("Excess expenses: "),
			new Label("Saved expenses: "),
			totalExpenses,
			allowedLabel,
			new Label(),
			new Label(), expenses, allowances);

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
											totalExpenses.display();
											allowedLabel.display();
											labelGrid.excessExpenses();
										})))));
		primaryStage.setTitle("Travel expenses");
		primaryStage.show();
	}

}