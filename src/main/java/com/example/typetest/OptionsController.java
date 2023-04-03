package com.example.typetest;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class OptionsController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private boolean fullscreen;

    public void switchToMainMenu(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scenes/mainMenu.fxml"));
        stage = HelloApplication.getPrimaryStage();
        scene = stage.getScene();
        scene.setRoot(root);
        scene.getStylesheets().add(getClass().getResource("CSS/mainMenu.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    public void enableFullScreen() throws IOException {
        stage = HelloApplication.getPrimaryStage();
        Properties prop = new Properties();
        String config = "C:/Users/cliff/OneDrive/Desktop/Projects/TypeTest/target/classes/com/example/typetest/app.config" ;
        try (FileInputStream fis = new FileInputStream(config)) {
            prop.load(fis);
            fullscreen = !Boolean.parseBoolean(prop.getProperty("app.fullScreen"));
            if (fullscreen) {
                prop.setProperty("app.fullScreen", "true");
                prop.store(new FileOutputStream(config), "fullscreen change");
            }
            else {
                prop.setProperty("app.fullScreen", "false");
                prop.store(new FileOutputStream(config), "fullscreen change");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        stage.setFullScreen(fullscreen);
        stage.show();
    }
}
