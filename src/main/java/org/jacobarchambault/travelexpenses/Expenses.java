package org.jacobarchambault.travelexpenses;

import java.util.List;

public class Expenses {
	List<List<Expense>> expenses;

	Expenses(List<List<Expense>> list) {
		this.expenses = list;
	}

	double add() {
		double sum = 0;
		for (var list : expenses) {
			for (var expense : list) {
				sum += expense.amount();
			}
		}
		return sum;
	}
}
