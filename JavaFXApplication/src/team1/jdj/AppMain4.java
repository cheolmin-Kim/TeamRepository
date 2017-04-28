package team1.jdj;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain4 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("창제목");
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		System.exit(0);
	}

	@Override
	public void init() throws Exception {
		super.init(); //To change body of generated methods, choose Tools | Templates.
	}



	

	public static void main(String[] args) {
		launch(args);
	}
}
