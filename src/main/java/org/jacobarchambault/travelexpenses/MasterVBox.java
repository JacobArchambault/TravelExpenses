package org.jacobarchambault.travelexpenses;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

class MasterVBox extends VBox {
	MasterVBox(
			final int spacing,
			final Insets insets,
			final Node... children) {
		super(
				spacing,
				children);
		setPadding(
				insets);
	}

}