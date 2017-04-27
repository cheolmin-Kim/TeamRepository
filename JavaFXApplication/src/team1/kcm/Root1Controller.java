package team1.kcm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class Root1Controller implements Initializable {

	@FXML
	private StackPane sstackPane;
	@FXML
	private ImageView background;
	@FXML
	private HBox menu;
	
	private static int count = -1;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		menu.setTranslateY(200);
		
		background.setOnMouseClicked(event -> {
			count = count * (-1);
			if (count == 1) {
				open();
			} else {
				close();
			}
		});
		
	}


	private void open() {
		System.out.println("open");
		//sstackPane.getChildren().add(menu);
		
		KeyValue keyValue = new KeyValue(menu.translateYProperty(), 0);
	KeyFrame keyFrame = new KeyFrame(Duration.millis(1000), keyValue);
	Timeline timeline = new Timeline();
	timeline.getKeyFrames().add(keyFrame);
	timeline.play();
	}

	private void close() {
		System.out.println("close");
		KeyValue keyValue = new KeyValue(menu.translateYProperty(),200);
       // KeyFrame keyFrame = new KeyFrame(Duration.millis(1000),
       //         (event) -> {
         //           sstackPane.getChildren().remove(menu);
          //      },
        //        keyValue);
				KeyFrame keyFrame = new KeyFrame(Duration.millis(1000),keyValue);
        Timeline timeline = new Timeline();
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();

	}	
	
}
