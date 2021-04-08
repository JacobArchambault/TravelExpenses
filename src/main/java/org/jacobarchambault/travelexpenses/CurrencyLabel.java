package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;

import javafx.scene.control.Label;

public class CurrencyLabel extends Label {

	void display(double number) {
		this.setText(NumberFormat.getCurrencyInstance().format(number));
	}
}
