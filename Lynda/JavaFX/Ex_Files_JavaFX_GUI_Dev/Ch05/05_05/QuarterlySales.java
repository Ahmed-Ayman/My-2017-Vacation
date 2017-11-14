/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarterlysales;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Peggy Fisher
 */
public class QuarterlySales extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     
        CategoryAxis hAxis = new CategoryAxis();
        hAxis.setLabel("SalesPerson");
        
        NumberAxis vAxis = new NumberAxis();
        vAxis.setLabel("New Car Sales");
        
        BarChart<String, Number> bcSales = new BarChart<>(hAxis, vAxis);
        bcSales.setTitle("1st Quarter Sales Report");
        
        XYChart.Series<String,Number> jan = new XYChart.Series<>();
        XYChart.Series<String,Number> feb = new XYChart.Series<>();
        XYChart.Series<String,Number> mar = new XYChart.Series<>();
        
        jan.setName("January");
        feb.setName("February");
        mar.setName("March");
        
        jan.getData().add(new XYChart.Data<String, Number>("Mary",120000));
        jan.getData().add(new XYChart.Data<String, Number>("Tom",100000));
        
        feb.getData().add(new XYChart.Data<String, Number>("Mary",90000));
        feb.getData().add(new XYChart.Data<String, Number>("Tom",50000));
        
        mar.getData().add(new XYChart.Data<String, Number>("Mary",55000));
        mar.getData().add(new XYChart.Data<String, Number>("Tom",130000));
        
        bcSales.getData().add(jan);
        bcSales.getData().add(feb);
        bcSales.getData().add(mar);
        
        FlowPane root = new FlowPane();
        root.getChildren().add(bcSales);
        
        Scene scene = new Scene(root, 600, 500);
        
        primaryStage.setTitle("Quarterly Sales");
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
