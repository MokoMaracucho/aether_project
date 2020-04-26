package aether_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.stage.Stage;

@SpringBootApplication
public class AetherProjectApplication extends Application {    
	
	private ConfigurableApplicationContext springContext;
	
    public static void main(String[] args) {
    	
    }

	@Override
	public void start(Stage primaryStage) throws Exception {

	}

	public void init() throws Exception {
		springContext = SpringApplication.run(AetherProjectApplication.class);
	}

	public void stop() throws Exception {
		springContext.close();
	}
}
