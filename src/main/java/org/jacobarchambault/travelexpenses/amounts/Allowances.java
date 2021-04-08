package org.jacobarchambault.travelexpenses.amounts;

import java.util.List;

public class Allowances implements Amount {

	List<Amount> basicExpenses;
	DailyAllowances dailyAllowances;

	public Allowances(final List<Amount> basicExpenses, final DailyAllowances dailyAllowances) {
		this.basicExpenses = basicExpenses;
		this.dailyAllowances = dailyAllowances;
	}

	public double total() {
		var allowed = dailyAllowances.total();
		for (final Amount e : basicExpenses) {
			allowed += e.total();
		}
		return allowed;

	}

}
