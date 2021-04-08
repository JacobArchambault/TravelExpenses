package org.jacobarchambault.travelexpenses.amounts;

import java.util.List;

public class Expenses implements Amount {
	private final List<Amount> list;

	public Expenses(final List<Amount> list) {
		this.list = list;
	}

	@Override
	public double total() {
		var sum = 0;
		for (final var expense : list) {
			sum += expense.total();
		}
		return sum;
	}
}
