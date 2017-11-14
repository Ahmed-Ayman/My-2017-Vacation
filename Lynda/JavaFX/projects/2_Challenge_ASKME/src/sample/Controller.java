package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    private String[] messages ;
    {
        messages = new String[10];
        messages[0] = "Hello There!";
        messages[1] = "Never click me again!";
        messages[2] = "Guess what!!";
        messages[3] = "I love ya";

    }
    @FXML
    private JFXButton ask_me;

    @FXML
    private Label message;

    @FXML
    void askMeClickListener(ActionEvent event) {
        int random = (int) (Math.floor(Math.random() * 3) + 0);
        message.setText(messages[random]);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
