/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Producer
 */
public class FXMLDocumentController implements Initializable{
        @FXML
	private TextField inputText;

	@FXML
	private TextArea outputText;

	@FXML
	private URL location;
   
	@FXML
	private ResourceBundle resources;

	// Add a public no-args constructor
	public FXMLDocumentController()
	{
	}

	@FXML
        @Override
	public void initialize(URL location, ResourceBundle resources)
	{
            
	}

	@FXML
	private void printOutput()
	{
            //This method is called when we use a controller for our action
            //event handler. Notice how we can access both outputText
            //and inputText in this method as a result of the 
            //@FXML annotation
		outputText.setText(inputText.getText());
	}   
    
}
