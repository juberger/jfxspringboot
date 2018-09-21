package fr.jbe.jfxspringboot.view;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import javafx.fxml.FXMLLoader;

@Component
public class AppFXMLLoader {

	@Autowired
	private ConfigurableApplicationContext context;

	public FXMLLoader getLoader(URL url) {
		FXMLLoader loader = new FXMLLoader(url);
		loader.setControllerFactory(context::getBean);
		return loader;
	}
	
	public FXMLLoader getLoader(String fxmlPath) {
		return getLoader(this.getClass().getResource(fxmlPath));
	}

}