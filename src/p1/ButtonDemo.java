package p1;

/*
 * Created by mmendez9 on 3/10/2016.
 * CIS 150-401
 * OK button
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ButtonDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btOK = new Button("OK"); // Create a button
        Scene scene = new Scene(btOK, 300, 300); // Create an scene and place the button in the scene
        primaryStage.setTitle("Our first GUI"); // Set a title to the stage
        primaryStage.setScene(scene); // Set an scene to the stage
        primaryStage.show(); // Display the stage
    }
}
