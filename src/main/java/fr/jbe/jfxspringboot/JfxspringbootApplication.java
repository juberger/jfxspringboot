package fr.jbe.jfxspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import fr.jbe.jfxspringboot.view.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

@SpringBootApplication
public class JfxspringbootApplication extends Application {
	
	private ConfigurableApplicationContext context;

	public static void main(String[] args) {
		launch(JfxspringbootApplication.class ,args);
	}
	
	@Override
	public void init() throws Exception {
		context = SpringApplication.run(JfxspringbootApplication.class);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello guys !");
		
		MainView mainView = context.getBean(MainView.class);
		primaryStage.setScene(mainView.createScene());
		primaryStage.show();
	}
}
