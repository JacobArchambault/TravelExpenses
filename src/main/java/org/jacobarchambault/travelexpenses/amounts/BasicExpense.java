package org.jacobarchambault.travelexpenses.amounts;

import javafx.scene.control.TextField;

public class BasicExpense implements Amount {

	TextField tf;

	public BasicExpense(final TextField tf) {
		this.tf = tf;
	}

	@Override
	public double total() {
		try {
			return Integer.parseInt(tf.getText());
		} catch (final Exception ex) {
			return 0;
		}
	}

}
