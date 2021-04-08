package org.jacobarchambault.travelexpenses;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MainExpensesGrid extends GridPane {
	MainExpensesGrid(
			final Label label,
			final TextField textBox,
			final Label label2,
			final TextField textBox2,
			final Label label3,
			final TextField textBox3) {
		add(label, 0, 0);
		add(textBox, 1, 0);
		add(label2, 0, 1);
		add(textBox2, 1, 1);
		add(label3, 0, 2);
		add(textBox3, 1, 2);
		setVgap(10);
		setCenterShape(true);
		setAlignment(Pos.CENTER);
	}

}
