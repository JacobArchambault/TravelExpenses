package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;

import org.jacobarchambault.travelexpenses.amounts.Amount;

import javafx.scene.control.Label;

public class AmountLabel extends Label {

	Amount expenses;

	AmountLabel(final Amount expenses) {
		this.expenses = expenses;
	}

	void display() {
		setText(NumberFormat.getCurrencyInstance().format(expenses.total()));
	}

}
