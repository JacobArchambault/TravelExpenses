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

	TextField fnTextField = new TextField();
	TextField lnTextField = new TextField();
	TextField mnTextField = new TextField();
	Label outputLabel = new Label();

	TextField tTextField = new TextField();

	@Override
	public void start(final Stage primaryStage) throws Exception {
		primaryStage
				.setScene(
						new Scene(
								new MasterVBox(
										10,
										new Insets(10),
										new TextLabelGrid(
												new Label("First Name: "),
												new Label("Middle Name: "),
												new Label("Last Name: "),
												new Label("Title: "),
												fnTextField,
												mnTextField,
												lnTextField,
												tTextField),
										new HBox(
												10,
												new EventButton(
														"Format 1",
														e -> outputLabel
																.setText(
																		tTextField.getText() + " "
																				+ fnTextField.getText() + " "
																				+ mnTextField.getText() + " "
																				+ lnTextField.getText())),
												new EventButton(
														"Format 2",
														e -> outputLabel
																.setText(
																		fnTextField.getText() + " "
																				+ mnTextField.getText() + " "
																				+ lnTextField.getText())),
												new EventButton(
														"Format 3",
														e -> outputLabel
																.setText(
																		fnTextField.getText() + " "
																				+ lnTextField.getText())),
												new EventButton(
														"Format 4",
														e -> outputLabel
																.setText(
																		lnTextField.getText() + ", "
																				+ fnTextField.getText() + " "
																				+ mnTextField.getText() + ", "
																				+ tTextField.getText())),
												new EventButton(
														"Format 5",
														e -> outputLabel
																.setText(
																		lnTextField.getText() + ", "
																				+ fnTextField.getText() + " "
																				+ mnTextField.getText())),
												new EventButton(
														"Format 6",
														e -> outputLabel
																.setText(
																		lnTextField.getText() + ", "
																				+ fnTextField.getText()))),
										new HBox(outputLabel))));
		primaryStage.show();
	}

}