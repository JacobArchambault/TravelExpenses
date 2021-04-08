package org.jacobarchambault.travelexpenses;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

class EventButton extends Button {

	EventButton(final String text, final EventHandler<ActionEvent> value) {
		super(text);
		setOnAction(value);
	}
}