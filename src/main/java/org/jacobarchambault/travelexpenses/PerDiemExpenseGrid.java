package org.jacobarchambault.travelexpenses;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PerDiemExpenseGrid extends GridPane {

	PerDiemExpenseGrid(
			final Label l1,
			final Label l2,
			final Label l3,
			final Label l4,
			Label l5,
			Label l6,
			final TextField tf1,
			final TextField tf2,
			final TextField tf3,
			final TextField tf4,
			final TextField tf5,
			final TextField tf6) {
		add(l1, 0, 0);
		add(l2, 0, 1);
		add(l3, 0, 2);
		add(l4, 0, 3);
		add(l5, 0, 4);
		add(l6, 0, 5);
		add(tf1, 1, 0);
		add(tf2, 1, 1);
		add(tf3, 1, 2);
		add(tf4, 1, 3);
		add(tf5, 1, 4);
		add(tf6, 1, 5);
		setVgap(10);
		setCenterShape(true);
		setAlignment(Pos.CENTER);
	}
}