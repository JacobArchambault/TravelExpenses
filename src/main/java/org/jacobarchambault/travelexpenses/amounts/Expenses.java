package org.jacobarchambault.travelexpenses.amounts;

import java.util.List;

public class Expenses implements Amount {
	List<Amount> list;

	public Expenses(List<Amount> list) {
		this.list = list;
	}

	public double total() {
		int sum = 0;
		for (var expense : list) {
			sum += expense.total();
		}
		return sum;
	}
}
