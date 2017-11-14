/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stylesheets;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Peggy Fisher
 */
public class StyleSheets extends Application {
    Label lblOutput;
    @Override
    public void start(Stage primaryStage) {
        Label lbl = new Label("Press the button to see a message");
        lblOutput = new Label(null);
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               lblOutput.setText("Hello World!");
            }
        });
      //  setUserAgentStylesheet(STYLESHEET_CASPIAN);
      
        lblOutput.setId("textstyle");
      
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        root.setOrientation(Orientation.VERTICAL);
        root.getChildren().addAll(lbl, btn, lblOutput);
        
        Scene scene = new Scene(root, 300, 250);
        
        scene.getStylesheets().add("stylesheets/styles.css");
        
        primaryStage.setTitle("Hello World!");
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
