package p2;

/*
 * Created by mmendez9 on 3/10/2016.
 * Very Ok button in a pane
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("VERY \nVERY \nOK"));
        pane.getChildren().add(new Button("VERY VERY OK"));
        Scene scene = new Scene(pane, 200, 60);
        primaryStage.setTitle("Button in Stack Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
