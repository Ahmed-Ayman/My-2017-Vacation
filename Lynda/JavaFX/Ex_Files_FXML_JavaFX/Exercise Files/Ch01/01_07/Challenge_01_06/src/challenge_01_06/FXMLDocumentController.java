/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge_01_06;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Producer
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    final ToggleGroup group;
    
    @FXML
    private RadioButton morning =new RadioButton("Morning");
    @FXML
    private RadioButton afternoon =new RadioButton("Afternoon");
    @FXML
    private RadioButton evening =new RadioButton("Evening");
    
    boolean rbMorning = false, rbAfternoon=false, rbEvening=false;

    public FXMLDocumentController() {
        this.group = new ToggleGroup();
    }
 
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
 
        if(rbMorning == true)
           label.setText("Good Morning!");
        else if(rbAfternoon == true)
            label.setText("Good Afternoon");
        else if(rbEvening==true)
            label.setText("Good Evening");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        morning.setToggleGroup(group);
        morning.setUserData("Morning");
        afternoon.setToggleGroup(group);
        afternoon.setUserData("Afternoon");
        evening.setToggleGroup(group);
        evening.setUserData("Evening");
        
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ov,
            Toggle old_toggle, Toggle new_toggle) {
            if (group.getSelectedToggle() != null) {
                if(group.getSelectedToggle().getUserData().toString().equalsIgnoreCase("Morning"))
                {
                    rbMorning = true; rbAfternoon = false; rbEvening = false;
                }
                else if(group.getSelectedToggle().getUserData().toString().equalsIgnoreCase("Afternoon"))
                {
                    rbAfternoon = true;rbMorning = false; rbEvening = false;
                }
                else if(group.getSelectedToggle().getUserData().toString().equalsIgnoreCase("Evening"))
                {
                    rbEvening = true; rbMorning = false; rbAfternoon = false;
                }
            }
        }
        });
      
 }
}
    


