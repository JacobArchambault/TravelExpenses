package org.jacobarchambault.travelexpenses;

import javafx.scene.control.TextField;

public class BasicExpense {

	TextField tf;

	BasicExpense(TextField tf) {
		this.tf = tf;
	}

	double amount() {
		return Double.parseDouble(tf.getText());
	}

}
