package fr.jbe.jfxspringboot.view.controller;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

@Controller
public class MainController {

	@FXML
	private TextField name;
	
	@FXML
	private Label displayName;
	
	@FXML
	private void initialize() {
		name.clear();
		displayName.setText("");
	}
	
	@FXML
	public void handleHello() {
		if (!name.getText().isEmpty()) {
			displayName.setText(name.getText());
		}
	}
	
}
