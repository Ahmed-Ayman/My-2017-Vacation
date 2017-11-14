/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uichallenge;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Peggy Fisher
 */
public class UIChallenge extends Application {
    
    Label message;
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);

        // File menu - new, save, print, and exit
        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem printMenuItem = new MenuItem("Print");
        MenuItem exitMenuItem = new MenuItem("Exit");
        
        exitMenuItem.setOnAction(actionEvent->Platform.exit());
   
        menuBar.getMenus().addAll(fileMenu);

        //add the new menuitems to the fileMenu
        fileMenu.getItems().addAll(newMenuItem, saveMenuItem,printMenuItem,
        new SeparatorMenuItem(), exitMenuItem);
        
        
        message = new Label("");
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        
        
        btn1.setText("JavaFX");
        btn2.setText("Greeting");
        btn3.setText("Mystery");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                message.setText("Welcome to JavaFX!!! ");
                message.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
                message.setTextFill(Color.FIREBRICK);
            }
        });
        btn2.setOnAction((ActionEvent e)-> {
            message.setText("Hello World!");
            message.setFont(Font.font("Comic Sans ms", FontWeight.BOLD, 30));
            message.setTextFill(Color.DARKSLATEGREY);
        });
        btn3.setOnAction((ActionEvent e)-> {
            message.setText("Have a great day");
            message.setFont(Font.font("Jokerman", FontWeight.BOLD, 30));
            message.setTextFill(Color.FUCHSIA);
        });
        
        root.setCenter(message);
        
        VBox buttons = new VBox();
        buttons.setSpacing(10);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(btn1, btn2, btn3);
        
        root.setLeft(buttons);
        root.setTop(menuBar);
        
        Scene scene = new Scene(root, 400, 250);
        
        primaryStage.setTitle("UI Challenge");
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
