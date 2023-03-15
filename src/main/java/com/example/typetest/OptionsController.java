package com.example.typetest;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class OptionsController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMainMenu(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scenes/mainMenu.fxml"));
        stage = HelloApplication.getPrimaryStage();
        scene = stage.getScene();
        scene.setRoot(root);
        scene.getStylesheets().add(getClass().getResource("CSS/mainMenu.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    public void enableFullScreen(ActionEvent e) throws IOException {
        stage = HelloApplication.getPrimaryStage();
        stage.setFullScreen(!stage.isFullScreen());
        stage.show();
    }
}
