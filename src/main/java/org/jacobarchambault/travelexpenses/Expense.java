package org.jacobarchambault.travelexpenses;

import javafx.scene.control.TextField;

public class Expense {

	TextField tf;

	Expense(TextField tf) {
		this.tf = tf;
	}

	double amount() {
		return Double.parseDouble(tf.getText());
	}

}
