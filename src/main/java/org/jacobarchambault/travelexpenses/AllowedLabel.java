package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;
import java.util.List;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AllowedLabel extends Label {
// 47, 20 40, 195
	TextField daysInput;
	List<Integer> array;

	AllowedLabel(TextField daysInput, List<Integer> array) {
		this.daysInput = daysInput;
		this.array = array;
	}

	void display() {
		try {
			var days = Integer.parseInt(daysInput.getText());
			int allowed = 0;
			for (int i : array) {
				allowed += (i * days);
			}
			this.setText(NumberFormat.getCurrencyInstance().format(allowed));

		} catch (Exception ex) {
			this.setText(NumberFormat.getCurrencyInstance().format(0));
		}
	}
}
