package com.example.typetest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class OptionsController {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private boolean fullscreen = false;

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
        fullscreen = !fullscreen;
        stage = HelloApplication.getPrimaryStage();
        stage.setFullScreen(fullscreen);
        stage.show();
    }

}
