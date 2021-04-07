package org.jacobarchambault.travelexpenses;

import javafx.scene.control.TextField;

public class BasicExpense implements Amount {

	TextField tf;

	BasicExpense(TextField tf) {
		this.tf = tf;
	}

	public int total() {
		try {
			return Integer.parseInt(tf.getText());
		} catch (Exception ex) {
			return 0;
		}
	}

}
