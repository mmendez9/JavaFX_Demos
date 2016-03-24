package p8;

/*
 * Created by mmendez9 on 3/17/2016.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBox_VBoxDemo extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        pane.setTop(getHBox());
        pane.setLeft(getVBox());


        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("HBox/VBox Demo");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setStyle("-fx-background-color: #8CA336");
        Button btn1 = new Button("One");
        Button btn2 = new Button("Two");
        Button btn3 = new Button("Three");

        hBox.getChildren().addAll(new Label("Pick a button"), btn1, btn2, btn3);

        return hBox;
    }

    private VBox getVBox() {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setStyle("-fx-background-color: #AA8439");

        vBox.getChildren().add(new Label("Courses"));

        Label[] courses = {
                new Label("CIS 120"),
                new Label("CIS 150"),
                new Label("CIS 209")};

        for (Label each : courses) {
            vBox.setMargin(each, new Insets(0, 0, 0, 15));
            vBox.getChildren().add(each);
        }
        return vBox;
    }

}
