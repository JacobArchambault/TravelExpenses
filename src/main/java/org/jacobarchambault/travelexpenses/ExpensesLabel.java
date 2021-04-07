package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;

import javafx.scene.control.Label;

public class ExpensesLabel extends Label {

	Expenses expenses;

	ExpensesLabel(Expenses expenses) {
		this.expenses = expenses;
	}

	void display() {
		this.setText(NumberFormat.getCurrencyInstance().format(expenses.add()));
	}

}
