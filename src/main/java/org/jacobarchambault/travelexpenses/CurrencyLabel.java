package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;

import javafx.scene.control.Label;

public class CurrencyLabel extends Label {

	void display(final double number) {
		setText(NumberFormat.getCurrencyInstance().format(number));
	}
}
