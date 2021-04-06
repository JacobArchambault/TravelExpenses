package org.jacobarchambault.travelexpenses;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MainExpensesGrid extends GridPane {
	MainExpensesGrid(
			Label label,
			TextField textBox,
			Label label2,
			TextField textBox2,
			Label label3,
			TextField textBox3,
			EventButton eventButton,
			Label subtotal) {
		add(label, 0, 0);
		add(textBox, 1, 0);
		add(label2, 0, 1);
		add(textBox2, 1, 1);
		add(label3, 0, 2);
		add(textBox3, 1, 2);
		add(eventButton, 0, 3);
		add(subtotal, 1, 3);
		setVgap(10);
		setCenterShape(true);
		setAlignment(Pos.CENTER);
	}

}
