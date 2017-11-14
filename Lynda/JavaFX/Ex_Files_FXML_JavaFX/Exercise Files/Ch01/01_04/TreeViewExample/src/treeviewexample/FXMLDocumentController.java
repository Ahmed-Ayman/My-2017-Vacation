/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeviewexample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Producer
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private final Node rootIcon = new ImageView(new Image(getClass().getResourceAsStream("folder_16.png")));
    
    @FXML 
    TreeItem<String> rootItem;
    
    @FXML
    TreeView<String> tree;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rootItem = new TreeItem<>("Inbox",rootIcon);
        rootItem.setExpanded(true);
        for(int i = 1; i<6;i++)
        {
            TreeItem<String> item = new TreeItem<>("Message "+i);
            rootItem.getChildren().add(item);
        }
        tree.setRoot(rootItem);
    }    
    
}
