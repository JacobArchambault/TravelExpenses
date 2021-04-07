package org.jacobarchambault.travelexpenses;

import java.util.List;

public class Expenses implements Amount {
	List<List<Amount>> expenses;

	Expenses(List<List<Amount>> list) {
		this.expenses = list;
	}

	public int total() {
		int sum = 0;
		for (var list : expenses) {
			for (var expense : list) {
				sum += expense.total();
			}
		}
		return sum;
	}
}
