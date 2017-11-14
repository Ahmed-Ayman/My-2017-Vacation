/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlobjectexample;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Producer
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label nameLbl;
    
     @FXML
    private TextArea outputText;
     
       @FXML
    private TextField inputText;
       
    private final String[] messages;
    public FXMLDocumentController() {
        this.messages = new String[]{"Today is going to be a great day", 
            "It might rain today", "You are awesome!", 
            "Programming is fun, don't you agree?", "Have a great day!"};
    }
    
    @FXML
    private void printOutput(ActionEvent event) {
        Random rand = new Random();
        int num = rand.nextInt(5);
        outputText.setText(inputText.getText()+", "+messages[num]);
        
    }
    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
        
    
}
