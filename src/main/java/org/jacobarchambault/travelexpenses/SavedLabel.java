package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;

import org.jacobarchambault.travelexpenses.amounts.Amount;
import org.jacobarchambault.travelexpenses.amounts.NumberInput;

import javafx.scene.control.Label;

public class SavedLabel extends Label {

	private Amount milesDriven;

	public SavedLabel(Amount milesDriven) {
		this.milesDriven = milesDriven;
	}

	void displaySaved(final double totalAmount, final double excess) {
		this.setText(NumberFormat.getCurrencyInstance().format(totalAmount - excess + milesDriven.total() * .4));
	}

}
