package p5;

/*
 * Created by mmendez9 on 3/17/2016.
 */


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Demo5 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(10, 10, 10 ,10));
        pane.setHgap(5);
        pane.setVgap(5);

        // Create text fields
        TextField tfFirstName = new TextField();
        TextField tfMI = new TextField();
        tfMI.setPrefColumnCount(1);
        TextField tfLastName = new TextField();

        // Put stuff in the pane
        pane.getChildren().addAll(new Label("First Name: "), tfFirstName);
        pane.getChildren().addAll(new Label("M.I: "), tfMI);
        pane.getChildren().addAll(new Label("Last Name: "), tfLastName);

        Scene scene = new Scene(pane, 600, 100);
        primaryStage.setTitle("Flow Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
