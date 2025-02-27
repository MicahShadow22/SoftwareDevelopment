import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.EventHandler;
import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;



public class Seconds extends Application {
    private static final String MEDIA_URL =
    "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
    @Override
    public void start(Stage primaryStage){
        Media media = new Media(MEDIA_URL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        Pane pane = new Pane();
        TextField tf = new TextField();
        Text text = new Text();
        pane.getChildren().add(tf);

    Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
        int someNumber = Integer.parseInt(tf.getText());
        someNumber = someNumber - 1;
        String ster1 = Integer.toString(someNumber);
        tf.setText(ster1);
        if (someNumber == 0){
            // play media here
            mediaPlayer.play();
        }
    }));
    animation.setCycleCount(Animation.INDEFINITE);

    tf.setOnAction(e -> {
        animation.play();
        
    });
    
    

    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("Exercise 16-21");
    primaryStage.setScene(scene);
    primaryStage.show();

    }
    public void nextStep(Animation animation) {
        animation.pause();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
    

    
}