package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;

import javafx.scene.control.Label;

public class AmountLabel extends Label {

	Amount expenses;

	AmountLabel(Amount expenses) {
		this.expenses = expenses;
	}

	void display() {
		this.setText(NumberFormat.getCurrencyInstance().format(expenses.total()));
	}

}
