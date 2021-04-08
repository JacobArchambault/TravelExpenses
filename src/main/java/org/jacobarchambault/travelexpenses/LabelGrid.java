package org.jacobarchambault.travelexpenses;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class LabelGrid extends GridPane {

	public LabelGrid(
			final Label label,
			final Label label2,
			final Label label3,
			final Label label4,
			final Label label5,
			final Label label6,
			final Label label7,
			final Label label8) {
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
