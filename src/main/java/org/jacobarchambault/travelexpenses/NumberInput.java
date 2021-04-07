package org.jacobarchambault.travelexpenses;

import javafx.scene.control.TextField;

class NumberInput extends TextField {

	NumberInput() {
		textProperty().addListener((final var observable, final var oldValue, final var newValue) -> {
			if (!newValue.matches("\\d*")) {
				setText(newValue.replaceAll("[^\\d]", ""));
			}
		});
	}

	double value() {
		return Double.parseDouble(this.getText());
	}
}