package org.jacobarchambault.travelexpenses.amounts;

import javafx.scene.control.TextField;

public class NumberInput extends TextField implements Amount {

	public NumberInput() {
		textProperty().addListener((final var observable, final var oldValue, final var newValue) -> {
			if (!newValue.matches("\\d*")) {
				setText(newValue.replaceAll("[^\\d]", ""));
			}
		});
	}

	public double total() {
		try {
			return Double.parseDouble(this.getText());
		} catch (Exception ex) {
			return 0;
		}
	}
}