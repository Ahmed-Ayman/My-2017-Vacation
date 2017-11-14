package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{

    @FXML
    Text actiontarget;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        //you can call the ids directly
        actiontarget.setText("thanks for singing in!");
    }

}
