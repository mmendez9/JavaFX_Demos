package p10;

/*
 * Created by mmendez9 on 4/21/2016.
 */
// How to create a tab pane.
// Add a grid layout to a tab

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TabPaneDemo2 extends Application {


    @Override
    public void start(Stage stage) {

        // Setup a tab pane, disallowing tab closing
        TabPane tp = new TabPane();
        tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

        // Create a tab for rectangles
        Tab rectangle_tab = new Tab("Rectangle");

        // Create a tab for circles
        Tab circle_tab = new Tab("Circle");

        // Define a grid for rectangles
        GridPane rectangle_grid = new GridPane();
        rectangle_grid.setPadding(new Insets(20, 20, 20, 20));
        rectangle_grid.setHgap(10);
        rectangle_grid.setVgap(10);

        // Define the text fields

        // Length
        TextField tfLength = new TextField();

        // Width
        TextField tfWidth = new TextField();

        // Perimeter
        TextField tfPerimeter = new TextField();
        tfPerimeter.setEditable(false);

        // Area
        TextField tfArea = new TextField();
        tfArea.setEditable(false);

        // Place labels and text fields in the pane, one row at a time
        rectangle_grid.addRow(0, new Label("Length:"), tfLength);
        rectangle_grid.addRow(1, new Label("Width:"), tfWidth);
        rectangle_grid.addRow(2, new Label("Perimeter:"), tfPerimeter);
        rectangle_grid.addRow(3, new Label("Area:"), tfArea);

        // Add a button
        Button btCalcRectangle = new Button("CALCULATE");
        rectangle_grid.add(btCalcRectangle, 0, 4, 2, 1);
        GridPane.setHalignment(btCalcRectangle, HPos.CENTER);

        // Add the grid to the tab
        rectangle_tab.setContent(rectangle_grid);

        // Define a grid for rectangles
        GridPane circle_grid = new GridPane();
        circle_grid.setPadding(new Insets(20, 20, 20, 20));
        circle_grid.setHgap(10);
        circle_grid.setVgap(10);

        // Define the text fields

        // Radius
        TextField tfRadius = new TextField();

        // Perimeter
        TextField tfCircumference = new TextField();
        tfCircumference.setEditable(false);

        // Area
        TextField tfCircleArea = new TextField();
        tfCircleArea.setEditable(false);

        // Place labels and text fields in the pane, one row at a time
        circle_grid.addRow(0, new Label("Radius:"), tfRadius);
        circle_grid.addRow(1, new Label("Perimeter:"), tfCircumference);
        circle_grid.addRow(2, new Label("Area:"), tfCircleArea);

        // Add a button
        Button btCalcCircle = new Button("CALCULATE");
        circle_grid.add(btCalcCircle, 0, 4, 2, 1);
        GridPane.setHalignment(btCalcCircle, HPos.CENTER);

        // Add the grid to the tab
        circle_tab.setContent(circle_grid);

        // Add both tabs to the tab pane
        tp.getTabs().addAll(rectangle_tab, circle_tab);

        // Setup the scene and the stage
        Scene scene = new Scene(tp);
        stage.setTitle("Tab Pane Demo 2");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void stop() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Window Closed");
        alert.setHeaderText(null);
        alert.setContentText("So long and thanks for all the fish");
        alert.showAndWait();
    }
}