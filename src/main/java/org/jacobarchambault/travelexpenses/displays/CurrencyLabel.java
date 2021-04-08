package org.jacobarchambault.travelexpenses.displays;

import java.text.NumberFormat;

import javafx.scene.control.Label;

public class CurrencyLabel extends Label implements Display<Double> {

	@Override
	public void show(final Double number) {
		setText(NumberFormat.getCurrencyInstance().format(number));
	}
}
