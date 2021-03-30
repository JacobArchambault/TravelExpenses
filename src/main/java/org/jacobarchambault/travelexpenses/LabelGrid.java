package org.jacobarchambault.travelexpenses;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class LabelGrid extends GridPane {

	public LabelGrid(
			Label label,
			Label label2,
			Label label3,
			Label label4,
			Label label5,
			Label label6,
			Label label7,
			Label label8) {
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
	}

}
