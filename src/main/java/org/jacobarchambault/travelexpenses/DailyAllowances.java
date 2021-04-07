package org.jacobarchambault.travelexpenses;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DailyAllowances {

	NumberInput tripDays;
	List<Integer> maxAllowedList;

	public DailyAllowances(NumberInput tripDays, List<Integer> maxAllowedList) {
		this.tripDays = tripDays;
		this.maxAllowedList = maxAllowedList;
	}

	int total() {
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
