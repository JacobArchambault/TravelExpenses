package org.jacobarchambault.travelexpenses;

import java.text.NumberFormat;
import java.text.ParseException;

import org.jacobarchambault.travelexpenses.amounts.Allowances;
import org.jacobarchambault.travelexpenses.amounts.Expenses;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class LabelGrid extends GridPane {

	private Label label5;
	private Label label6;
	private Label label7;
	private Label label8;

	public LabelGrid(
			Label label,
			Label label2,
			Label label3,
			Label label4,
			Label label5,
			Label label6,
			Label label7,
			Label label8,
			Expenses expenses,
			Allowances allowances) {
		add(label, 0, 0);
		add(label2, 0, 1);
		add(label3, 0, 2);
		add(label4, 0, 3);
		add(label5, 1, 0);
		add(label6, 1, 1);
		add(label7, 1, 2);
		add(label8, 1, 3);
		setVgap(10);
		setCenterShape(true);
		setAlignment(Pos.CENTER);
		this.label5 = label5;
		this.label6 = label6;
		this.label7 = label7;
		this.label8 = label8;
	}

	void excessExpenses() {
		try {
			var totalExpenses = NumberFormat.getCurrencyInstance().parse(label5.getText()).intValue();
			var allowedExpenses = NumberFormat.getCurrencyInstance().parse(label6.getText()).intValue();
			label7
					.setText(
							NumberFormat
									.getCurrencyInstance()
									.format(totalExpenses > allowedExpenses ? totalExpenses - allowedExpenses : 0));

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
