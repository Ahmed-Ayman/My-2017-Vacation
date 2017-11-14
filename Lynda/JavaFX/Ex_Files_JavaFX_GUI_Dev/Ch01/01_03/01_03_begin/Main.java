/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_03_begin;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Peggy Fisher
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //sample program with only one root node
        Group root = new Group();
        Scene scene = new Scene(root,400,400,Color.BLACK);

        
        primaryStage.setTitle("JavaFX Scene Graph Example");
        primaryStage.setScene(scene);
        primaryStage.show();
             
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
