/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stylechallenge;

import javafx.application.Application;
import static javafx.application.Application.STYLESHEET_CASPIAN;
import static javafx.application.Application.setUserAgentStylesheet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Peggy Fisher
 */
public class StyleChallenge extends Application {
    
    @Override
    public void start(Stage primaryStage) {
                
        BorderPane pane = new BorderPane();
        
        pane.setTop(hbox());
        pane.setCenter(pc());
        pane.setLeft(vbox());
        
        
        Scene scene = new Scene(pane, 700, 700);
        scene.getStylesheets().add("stylechallenge/challenge.css");
        primaryStage.setTitle("Style Challenge");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
   public static HBox hbox()
    {
        Button btn = new Button();
        btn.setText("Button1");
        Button btn2 = new Button();
        btn2.setText("Button2");
        Button btn3 = new Button();
        btn3.setText("Button3");
        btn.setPrefSize(100, 20);
        btn2.setPrefSize(100,20);
        btn3.setPrefSize(100,20);
        
        HBox hbox = new HBox();
        hbox.getStyleClass().add("hbox");
        hbox.getChildren().addAll(btn, btn2, btn3);
  
        return hbox;
    }
    public static VBox vbox()
    {
        Label lbl = new Label("Label1");
        Label lbl2 = new Label("Label2");
        VBox vbox = new VBox();
        vbox.getStyleClass().addAll("vbox");
        vbox.getChildren().addAll(lbl, lbl2);
        return vbox;
    }
    public static PieChart pc()
    {
        ObservableList<PieChart.Data> pieData = 
                FXCollections.observableArrayList(
                new PieChart.Data("Rent", 500),
                        new PieChart.Data("Electric",125), 
                        new PieChart.Data("Groceries", 235), 
                        new PieChart.Data("Entertainment", 200),
                        new PieChart.Data("Cell Phone", 80));
        
        PieChart budget = new PieChart(pieData);
        budget.setTitle("Monthly Expenses");
        return budget;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
