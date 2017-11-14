package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane root = new StackPane();
        Circle circle = new Circle(200,200,100);
        circle.setFill(Color.CORAL);
        root.getChildren().add(circle);
        Scene scene = new Scene(root,400,400);
        primaryStage.setTitle("Scene Graph Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
