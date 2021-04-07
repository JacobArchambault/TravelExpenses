package org.jacobarchambault.travelexpenses.amounts;

import java.util.List;

public class Expenses implements Amount {
	List<Amount> expenses;

	public Expenses(List<Amount> list) {
		this.expenses = list;
	}

	public int total() {
		int sum = 0;
		for (var expense : expenses) {
			sum += expense.total();
		}
		return sum;
	}
}
