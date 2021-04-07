package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;
import java.util.List;

public class Allowances {

	List<Expense> basicExpenses;
	DailyAllowances dailyAllowances;

	public Allowances(List<Expense> basicExpenses, DailyAllowances dailyAllowances) {
		this.basicExpenses = basicExpenses;
		this.dailyAllowances = dailyAllowances;
	}

	int total() {
		int allowed = dailyAllowances.total();
		for (Expense e : basicExpenses) {
			allowed += e.amount();
		}
		return allowed;

	}

}
