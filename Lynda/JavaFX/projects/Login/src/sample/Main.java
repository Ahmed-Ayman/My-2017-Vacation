package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    /**
     *  ---------------------------------
     *  Please Login
     *  ---------------------------------
     * User Name |  `enter the username`
     * Password  |  `enter the password`
     *
     *                    SIGNIN
     *
     * -----------------------------------
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setGridLinesVisible(false);
        Scene scene = new Scene(gridPane,300 ,275);
        //elements
        Text sceneTitle = new Text("Please Login");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
        //labels
        Label userName = new Label("UserName");
        TextField userNameTextField = new TextField();
        Label password = new Label("Password");
        PasswordField passwordField = new PasswordField();
        //check
        gridPane.add(sceneTitle,0,0,2,1);
        gridPane.add(userName,0,1);
        gridPane.add(userNameTextField,1,1);
        gridPane.add(password,0,2);
        gridPane.add(passwordField,1,2);
        //sign in
        Button signIn = new Button("Sign in");
        HBox signBox = new HBox(10);
        signBox.setAlignment(Pos.BOTTOM_RIGHT);
        signBox.getChildren().add(signIn);
        gridPane.add(signBox,1,4);

        final  Text actionTarget = new Text();
        gridPane.add(actionTarget,1,6);
        signIn.setOnAction(event -> {
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Thank you!");
        });

        scene.getStylesheets().add(Main.class.getResource("login.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
