package org.jacobarchambault.travelexpenses.amounts;

import javafx.scene.control.TextField;

public class BasicExpense implements Amount {

	TextField tf;

	public BasicExpense(TextField tf) {
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
