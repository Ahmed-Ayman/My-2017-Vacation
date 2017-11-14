/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Peggy Fisher
 */
public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Scene scene = new Scene(grid, 300, 275);
        
        Text scenetitle = new Text("Please Login: ");
        scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
        Label userName = new Label("User Name:");
        TextField userTextField = new TextField();
        Label pw = new Label("Password: ");
        PasswordField pwBox = new PasswordField();
        
        grid.add(scenetitle,0,0,2,1);
        grid.add(userName,0,1);
        grid.add(userTextField, 1,1);
        grid.add(pw,0,2);
        grid.add(pwBox,1,2);
        
        grid.setGridLinesVisible(false);
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1,4);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);
        
        btn.setOnAction(event ->
        {
            actiontarget.setFill(Color.TURQUOISE);
            actiontarget.setText("Sign in button pressed");
            
        });
        scene.getStylesheets().
                add(Login.class.getResource("Login.css").toExternalForm());
        primaryStage.setTitle("JavaFX Login Form");
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
