package org.motechproject.migration.tool;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.motechproject.migration.tool.util.Constants;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getResource(Constants.MAIN_LAYOUT));
        primaryStage.setTitle(Constants.MOTECH_TOOL_TITLE);
        primaryStage.setScene(new Scene(root, Constants.SCENE_WIDTH, Constants.SCENE_HEIGHT));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private URL getResource(String resourceName) {
        return this.getClass().getClassLoader().getResource(resourceName);
    }
}
