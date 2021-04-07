package org.jacobarchambault.travelexpenses.amounts;

import java.util.List;

public class DailyAllowances implements Amount{

	NumberInput tripDays;
	List<Integer> maxAllowedList;

	public DailyAllowances(NumberInput tripDays, List<Integer> maxAllowedList) {
		this.tripDays = tripDays;
		this.maxAllowedList = maxAllowedList;
	}

	public int total() {
		int days = days();
		int allowed = 0;
		for (int i : maxAllowedList) {
			allowed += (i * days);
		}
		return allowed;
	}

	private int days() {
		int days;
		try {
			days = Integer.parseInt(tripDays.getText());
		} catch (Exception ex) {
			days = 0;
		}
		return days;
	}

}
