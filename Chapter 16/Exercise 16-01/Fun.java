import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.Scene;


public class Fun extends Application{
    @Override
    public void start(Stage primaryStage){
        Text text = new Text();
        BorderPane borderPane = new BorderPane();
    
    HBox paneForRadioButtons = new HBox(20);
    paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
    paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: green");

    RadioButton rbRed = new RadioButton("Red");
    RadioButton rbYellow = new RadioButton("Yellow");
    RadioButton rbBlack = new RadioButton("Black");
    RadioButton rbOrange = new RadioButton("Orange");
    RadioButton rbGreen = new RadioButton("Green");
    paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
    borderPane.setTop(paneForRadioButtons);

    ToggleGroup group = new ToggleGroup();
    rbRed.setToggleGroup(group);
    rbYellow.setToggleGroup(group);
    rbBlack.setToggleGroup(group);
    rbOrange.setToggleGroup(group);
    rbGreen.setToggleGroup(group);
    Pane newPane = new Pane();

    Label test1 = new Label("Programming is fun");
    newPane.getChildren().add(test1);
    borderPane.setCenter(newPane);
    test1.setTextFill(Color.BLACK);

    rbRed.setOnAction(e -> {
        if(rbRed.isSelected()){
            test1.setTextFill(Color.RED);
        }
    });

    rbYellow.setOnAction(e -> {
        if(rbYellow.isSelected()){
            test1.setTextFill(Color.YELLOW);
        }
    });

    rbBlack.setOnAction(e -> {
        if(rbBlack.isSelected()){
            test1.setTextFill(Color.BLACK);
        }
    });

    rbOrange.setOnAction(e -> {
        if(rbOrange.isSelected()){
            test1.setTextFill(Color.ORANGE);
        }
    });

    rbGreen.setOnAction(e -> {
        if(rbGreen.isSelected()){
            test1.setTextFill(Color.GREEN);
        }
    });

    Button btLeft = new Button("Left");
    Button btRight = new Button("Right");
    HBox hBox = new HBox(btLeft, btRight);
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);


    borderPane.setBottom(hBox);

    Scene scene = new Scene(borderPane, 370, 200);
    primaryStage.setTitle("Exercise 16-1");
    primaryStage.setScene(scene);
    primaryStage.show();

    btLeft.setOnAction(e -> {
        test1.setLayoutX(test1.getLayoutX() > 50 ? test1.getLayoutX() - 5 : 1);
       });


    btRight.setOnAction(e -> {
       test1.setLayoutX(test1.getLayoutX() < borderPane.getWidth() - 120 ? test1.getLayoutX() + 8 : borderPane.getWidth() - 110);   
    });


    
}
   public static void main(String[] args) {
    launch(args);
   }

}