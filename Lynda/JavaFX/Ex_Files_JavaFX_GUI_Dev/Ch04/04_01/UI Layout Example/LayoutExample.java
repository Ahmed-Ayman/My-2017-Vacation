/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutexample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Peggy Fisher
 */
public class LayoutExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
              
        BorderPane root = new BorderPane();
        root.setTop(addHBox());
        root.setLeft(addVBox());
        root.setCenter(addGridPane());
        root.setBottom(addFooter());
        
        Scene scene = new Scene(root, 800, 800);
        
        primaryStage.setTitle("UI Layouts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public HBox addHBox() {
        
    HBox hbox = new HBox();
    hbox.setPadding(new Insets(15, 12, 15, 12));
    hbox.setSpacing(10);
    hbox.setStyle("-fx-background-color: #336699;");

    Button buttonCurrent = new Button("Home");
    buttonCurrent.setPrefSize(100, 20);

    Button buttonProjected = new Button("Exit");
    buttonProjected.setPrefSize(100, 20);
    hbox.getChildren().addAll(buttonCurrent, buttonProjected);

    return hbox;
}
    public HBox addFooter(){
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #336699");
        Text copyright = new Text("Copyright 2016");
        copyright.setFill(Color.WHITE);
        copyright.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        hbox.getChildren().add(copyright);
        return hbox;
    }
    
    public VBox addVBox() {
    VBox vbox = new VBox();
    vbox.setPadding(new Insets(10));
    vbox.setSpacing(8);

    Text title = new Text("Departments");
    title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
    vbox.getChildren().add(title);

    Hyperlink options[] = new Hyperlink[] {
        new Hyperlink("Operations"),
        new Hyperlink("Customer Service"),
        new Hyperlink("Marketing"),
        new Hyperlink("Sales")};

    for (int i=0; i<4; i++) {
        VBox.setMargin(options[i], new Insets(0, 0, 0, 8));
        vbox.getChildren().add(options[i]);
    }

    return vbox;
}
    
    public GridPane addGridPane() {
    GridPane grid = new GridPane();
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(0, 10, 0, 10));

    // Category in column 2, row 1
    Text category = new Text("Operations:");
    category.setFont(Font.font("Arial", FontWeight.BOLD, 20));
    grid.add(category, 1, 0); 

    // Title in column 3, row 1
    Text chartTitle = new Text("Customer Service");   
    chartTitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));
    grid.add(chartTitle, 2, 0);

    
    ImageView imageHouse = new ImageView(
       new Image(LayoutExample.class.getResourceAsStream("home.gif")));
    grid.add(imageHouse, 0, 0, 1, 2); 

    

    return grid;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
