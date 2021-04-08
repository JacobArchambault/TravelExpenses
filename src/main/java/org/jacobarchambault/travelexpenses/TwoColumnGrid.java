package org.jacobarchambault.travelexpenses;

import javafx.geometry.Pos;
import javafx.scene.control.Control;
import javafx.scene.layout.GridPane;

public class TwoColumnGrid extends GridPane {

	TwoColumnGrid(final Control[] controls) {
		for (var i = 0; i < controls.length; i++) {
			add(controls[i], i % 2, i / 2);
		}
		setVgap(10);
		setCenterShape(true);
		setAlignment(Pos.CENTER);

	}
}
