package p6;

/*
 * Created by mmendez9 on 3/17/2016.
 */


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10 ,10));
        pane.setHgap(5);
        pane.setVgap(5);

        // Create text fields
        TextField tfFirstName = new TextField();
        TextField tfMI = new TextField();
        tfMI.setPrefColumnCount(1);
        TextField tfLastName = new TextField();

        // Put stuff in the pane
        pane.addRow(0, new Label("First Name: "), tfFirstName);
        pane.addRow(1, new Label("M.I: "), tfMI);
        pane.addRow(2, new Label("Last Name: "), tfLastName);

        // Put a button
        Button btSubmit = new Button("Submit Name");
        pane.add(btSubmit, 1, 3);
        GridPane.setHalignment(btSubmit, HPos.RIGHT);

        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("Flow Pane");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
