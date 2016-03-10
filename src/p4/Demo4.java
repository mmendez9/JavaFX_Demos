package p4;

/*
 * Created by mmendez9 on 3/10/2016.
 * Circle centered
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Demo4 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle circle = new Circle(50);

        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        circle.setStroke(Color.RED);
        circle.setFill(Color.BLUE);

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Centered Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
