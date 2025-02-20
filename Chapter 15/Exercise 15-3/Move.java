import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;


public class Move extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
       Circle circle = new Circle();
       circle.setCenterX(100);
       circle.setCenterY(100);
       circle.setRadius(50);
       circle.setStroke(Color.BLACK);
       circle.setFill(Color.WHITE);


       Pane pane = new Pane();
       pane.getChildren().add(circle);

       Button btLeft = new Button("Left");
       Button btRight = new Button("Right");
       Button btUp = new Button("Up");
       Button btDown =  new Button("Down");
       HBox hBox = new HBox(btLeft, btRight, btUp, btDown);
       hBox.setSpacing(10);
       hBox.setAlignment(Pos.CENTER);

       BorderPane borderPane = new BorderPane(pane);
       borderPane.setBottom(hBox);


       Scene scene = new Scene(borderPane,200 ,200);
       primaryStage.setTitle("Exercise15_03");
       primaryStage.setScene(scene);
       primaryStage.show();

       btLeft.setOnAction((ActionEvent e) -> {
        circle.setCenterX(circle.getCenterX() > 50 ? circle.getCenterX() - 5 : 50);
       });

       btRight.setOnAction(e -> 
         circle.setCenterX(circle.getCenterX() < pane.getWidth() - 50 ? circle.getCenterX() + 5 : pane.getWidth() - 50));

       btUp.setOnAction((ActionEvent e) -> {
        circle.setCenterY(circle.getCenterY() > 50 ? circle.getCenterY() - 5 : 50);
       });

       btDown.setOnAction((e) -> {
        circle.setCenterY(circle.getCenterY() < pane.getHeight() - 50 ? circle.getCenterY() + 5 : pane.getHeight() - 50);
       });

       





    }


    
}
