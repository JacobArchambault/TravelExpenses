package org.jacobarchambault.travelexpenses;

import javafx.scene.control.TextField;

public class DailyExpense implements Expense {

	TextField daysField;
	TextField dailyAmountField;

	DailyExpense(TextField daysField, TextField dailyAmountField) {
		this.daysField = daysField;
		this.dailyAmountField = dailyAmountField;
	}

	@Override
	public double amount() {
		return Double.parseDouble(daysField.getText()) * Double.parseDouble(dailyAmountField.getText());
	}

}
