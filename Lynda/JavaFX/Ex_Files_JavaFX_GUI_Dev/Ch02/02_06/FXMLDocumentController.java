/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askme;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Peggy Fisher
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label label1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Random rand = new Random();
        int answer = rand.nextInt(5);
        switch(answer)
        {
            case 0: label.setText("It is certain");
            break;
            case 1: label.setText("Ask again later");
            break;
            case 2: label.setText("Outlook not so good");
            break;
            case 3: label.setText("Most likely");
            break;
            case 4: label.setText("Signs point to yes");
            break;
        }
                  
        
        label1.setText("Ask another question!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
