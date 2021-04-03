package org.jacobarchambault.travelexpenses;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MainExpensesGrid extends GridPane {
	MainExpensesGrid(Label label, TextField textBox, Label label2, TextField textBox2) {
		add(label, 0, 0);
		add(label2, 0, 1);
		add(textBox, 1, 0);
		add(textBox2, 1, 1);
		setVgap(10);
		setCenterShape(true);
		setAlignment(Pos.CENTER);
	}

}
