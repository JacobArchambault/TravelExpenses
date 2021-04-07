package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;
import java.util.List;

public class Allowances implements Amount {

	List<Amount> basicExpenses;
	DailyAllowances dailyAllowances;

	public Allowances(List<Amount> basicExpenses, DailyAllowances dailyAllowances) {
		this.basicExpenses = basicExpenses;
		this.dailyAllowances = dailyAllowances;
	}

	public int total() {
		int allowed = dailyAllowances.total();
		for (Amount e : basicExpenses) {
			allowed += e.total();
		}
		return allowed;

	}

}
