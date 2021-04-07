package org.jacobarchambault.travelexpenses;

import java.util.List;

public class Expenses {
	List<Expense> expenses;

	Expenses(List<Expense> expenses) {
		this.expenses = expenses;
	}

	double add() {
		double sum = 0;
		for (var expense : expenses) {
			sum += expense.amount();
		}
		return sum;
	}
}
