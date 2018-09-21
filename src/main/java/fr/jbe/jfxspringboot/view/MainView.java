package fr.jbe.jfxspringboot.view;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

@Component
public class MainView {

	@Autowired
	AppFXMLLoader appFXMLLoader;
	
	public Scene createScene() {
		Scene scene = null;
		try {
			FXMLLoader loader = appFXMLLoader.getLoader(MainView.class.getResource("fxml/MainLayout.fxml"));
			BorderPane borderPane = loader.load();
			scene = new Scene(borderPane);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return scene;
	}
	
}