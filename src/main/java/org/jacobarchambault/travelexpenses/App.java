package org.jacobarchambault.travelexpenses;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
	public static void main(final String[] args) {
		Application.launch(args);
	}

	// Fully covered expenses

	// Partially covered expenses
	NumberInput parking = new NumberInput();
	NumberInput taxi = new NumberInput();
	NumberInput lodging = new NumberInput();

	NumberInput milesDriven = new NumberInput();

	NumberInput tripDays = new NumberInput();
	NumberInput airFare = new NumberInput();
	NumberInput carRental = new NumberInput();
	NumberInput registration = new NumberInput();

	Label totalExpensesLabel = new Label();

	TextField outputLabel = new TextField();

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
														carRental)),
										new TitledPane(
												"Per diem expenses",
												new TextLabelGrid(
														new Label("Days on the trip: "),
														new Label("Airfare: "),
														new Label("Car Rental: "),
														new Label("Miles Driven: "),
														new Label("Parking fees: "),
														new Label("Taxi fees: "),
														new Label("Registration: "),
														new Label("Nightly lodging: "),
														tripDays,
														new TextField(),
														new TextField(),
														milesDriven,
														parking,
														taxi,
														registration,
														lodging)),
										new LabelGrid(
												new Label("Total expenses: "),
												new Label("Allowable expenses: "),
												new Label("Excess expenses: "),
												new Label("Saved expenses: "),
												totalExpensesLabel,
												new Label(),
												new Label(),
												new Label()),
										new HBox(
												new EventButton(
														"Calculate",
														e -> totalExpensesLabel
																.setText(
																		Double
																				.toString(
																						new Expenses(
																								new BasicExpense(
																										airFare),
																								new BasicExpense(
																										carRental),
																								new BasicExpense(
																										parking),
																								new BasicExpense(taxi),
																								new BasicExpense(
																										registration),
																								new DailyExpense(
																										tripDays,
																										lodging))
																												.add())))))));
		primaryStage.setTitle("Travel expenses");
		primaryStage.show();
	}

}