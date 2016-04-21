package p9;

/*
 * Created by mmendez9 on 3/24/2016.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TabPaneDemo extends Application {

    @Override
    public void start(Stage stage) {

        // Setup a tab pane, disallowing tab closing
        TabPane tp = new TabPane();
        tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

        // Create a tab for buttons
        Tab buttons_tab = new Tab("Buttons");

        // Define two buttons and put them in an HBox
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        HBox hb = new HBox();
        hb.getChildren().addAll(b1, b2);
        hb.setPadding(new Insets(20));
        hb.setSpacing(20);

        // Add the HBox to the buttons tab
        buttons_tab.setContent(hb);

        // Create a tab for a help message
        Tab help_tab = new Tab("Help");

        // Define a label with the help message
        Label help_dia = new Label("Help Message: Buy low and sell high.");

        // Add the label to the help tab
        help_tab.setContent(help_dia);

        // Add both tabs to the tab pane
        tp.getTabs().addAll(buttons_tab, help_tab);

        // Setup the scene and the stage
        Scene scene = new Scene(tp);
        stage.setTitle("Tab Pane Demo");
        stage.setX(400);
        stage.setY(100);
        stage.setHeight(500);
        stage.setWidth(600);
        stage.setScene(scene);
        stage.show();
    }
}
