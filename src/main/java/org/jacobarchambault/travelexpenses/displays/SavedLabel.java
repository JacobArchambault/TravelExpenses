package org.jacobarchambault.travelexpenses.displays;

import java.text.NumberFormat;

import org.jacobarchambault.travelexpenses.amounts.Amount;

import javafx.scene.control.Label;

public class SavedLabel extends Label implements Display<Double> {

	private final Amount milesDriven;

	public SavedLabel(final Amount milesDriven) {
		this.milesDriven = milesDriven;
	}

	@Override
	public void show(final Double amount) {
		setText(NumberFormat.getCurrencyInstance().format(amount + milesDriven.total() * .4));
	}

}
