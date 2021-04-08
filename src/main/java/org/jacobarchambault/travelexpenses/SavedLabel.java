package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;

import org.jacobarchambault.travelexpenses.amounts.Amount;
import javafx.scene.control.Label;

public class SavedLabel extends Label {

	private final Amount milesDriven;

	public SavedLabel(final Amount milesDriven) {
		this.milesDriven = milesDriven;
	}

	void display(final double totalAmount, final double excess) {
		setText(NumberFormat.getCurrencyInstance().format(totalAmount - excess + milesDriven.total() * .4));
	}

}
