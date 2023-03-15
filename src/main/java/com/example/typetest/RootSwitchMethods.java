package com.example.typetest;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RootSwitchMethods {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToPracticeMode(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scenes/practiceMode.fxml"));
        stage = HelloApplication.getPrimaryStage();
        scene = stage.getScene();
        scene.setRoot(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCredits(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scenes/credits.fxml"));
        stage = HelloApplication.getPrimaryStage();
        scene = stage.getScene();
        scene.setRoot(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToOptions(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scenes/options.fxml"));
        stage = HelloApplication.getPrimaryStage();
        scene = stage.getScene();
        scene.setRoot(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToMainMenu(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scenes/mainMenu.fxml"));
        stage = HelloApplication.getPrimaryStage();
        scene = stage.getScene();
        scene.setRoot(root);
        scene.getStylesheets().add(getClass().getResource("CSS/mainMenu.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
