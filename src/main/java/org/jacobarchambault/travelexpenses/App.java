package org.jacobarchambault.travelexpenses;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
	public static void main(final String[] args) {
		Application.launch(args);
	}

	TextField tripDays = new TextField();
	TextField airFare = new TextField();
	TextField carRental = new TextField();
	Label outputLabel = new Label();

	TextField milesDriven = new TextField();

	@Override
	public void start(final Stage primaryStage) throws Exception {
		primaryStage
				.setScene(
						new Scene(
								new MasterVBox(
										10,
										new Insets(10),
										new TextLabelGrid(
												new Label("Days on the trip: "),
												new Label("Airfare: "),
												new Label("Car Rental: "),
												new Label("Miles Driven: "),
												tripDays,
												airFare,
												carRental,
												milesDriven),
										new LabelGrid(
												new Label("Total expenses: "),
												new Label("Allowable expenses: "),
												new Label("Excess expenses: "),
												new Label("Saved expenses: "),
												new Label(),
												new Label(),
												new Label(),
												new Label()),
										new HBox(
												new EventButton(
														"Format 6",
														e -> outputLabel
																.setText(
																		airFare.getText() + ", "
																				+ tripDays.getText()))))));
		primaryStage.show();
	}

}