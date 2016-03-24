package p3;

/*
 * Created by mmendez9 on 3/10/2016.
 * Circles
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class CirclesDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(); // Create a circle
        circle.setCenterX(100); // Set the X point
        circle.setCenterY(150); // Set the Y point
        circle.setRadius(50); // Set the radius of the circle
        circle.setStroke(Color.RED); // Set a circumference color of the circle
        circle.setFill(Color.BLUE); // Set a fill color

        Pane pane = new Pane();
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Fixed Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
