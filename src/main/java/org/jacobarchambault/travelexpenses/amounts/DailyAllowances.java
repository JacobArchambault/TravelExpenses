package org.jacobarchambault.travelexpenses.amounts;

import java.util.List;

public class DailyAllowances implements Amount {

	List<Integer> maxAllowedList;
	NumberInput tripDays;

	public DailyAllowances(final NumberInput tripDays, final List<Integer> maxAllowedList) {
		this.tripDays = tripDays;
		this.maxAllowedList = maxAllowedList;
	}

	@Override
	public double total() {
		final var days = days();
		var allowed = 0;
		for (final int i : maxAllowedList) {
			allowed += i * days;
		}
		return allowed;
	}

	private int days() {
		int days;
		try {
			days = Integer.parseInt(tripDays.getText());
		} catch (final Exception ex) {
			days = 0;
		}
		return days;
	}

}
