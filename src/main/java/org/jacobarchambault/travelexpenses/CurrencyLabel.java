package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;

import org.jacobarchambault.travelexpenses.displays.Display;

import javafx.scene.control.Label;

public class CurrencyLabel extends Label implements Display<Double>{

	public void show(final Double number) {
		setText(NumberFormat.getCurrencyInstance().format(number));
	}
}
