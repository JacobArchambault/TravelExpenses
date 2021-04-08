package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;

import org.jacobarchambault.travelexpenses.amounts.Amount;
import org.jacobarchambault.travelexpenses.displays.Display;

import javafx.scene.control.Label;

public class SavedLabel extends Label implements Display<Double> {

	private final Amount milesDriven;

	public SavedLabel(final Amount milesDriven) {
		this.milesDriven = milesDriven;
	}

	public void show(final Double amount) {
		setText(NumberFormat.getCurrencyInstance().format(amount + milesDriven.total() * .4));
	}

}
