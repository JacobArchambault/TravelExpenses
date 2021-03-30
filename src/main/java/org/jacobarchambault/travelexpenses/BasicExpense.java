package org.jacobarchambault.travelexpenses;

import javafx.scene.control.TextField;

public class BasicExpense implements Expense{

	TextField tf;

	BasicExpense(TextField tf) {
		this.tf = tf;
	}

	public double amount() {
		return Double.parseDouble(tf.getText());
	}

}
