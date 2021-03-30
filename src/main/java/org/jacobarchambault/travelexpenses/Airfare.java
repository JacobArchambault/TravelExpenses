package org.jacobarchambault.travelexpenses;

import javafx.scene.control.TextField;

public class Airfare {

	static double amount(TextField source) {
		return Double.parseDouble(source.getText());
	}
	
	void display(double amount) {
	}
}
