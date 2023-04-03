package com.example.typetest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.Properties;

public class HelloApplication extends Application {
    private static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("scenes/mainMenu.fxml"));
            Scene mainMenu = new Scene(root); // Scene contains nodes, and canvas
            String cssURL = getClass().getResource("CSS/mainMenu.css").toExternalForm();
            mainMenu.getStylesheets().add(cssURL);
            Image icon = new Image(getClass().getResource("images/icon.png").toExternalForm());

            Properties prop = new Properties();
            String config = "C:/Users/cliff/OneDrive/Desktop/Projects/TypeTest/target/classes/com/example/typetest/app.config" ;
            try (FileInputStream fis = new FileInputStream(config)) {
                prop.load(fis);
                primaryStage.setFullScreen(Boolean.parseBoolean(prop.getProperty("app.fullScreen")));
            }
            catch (Exception e) {
                System.out.println(e);
            }

            primaryStage.getIcons().add(icon);
            primaryStage.setResizable(false);
            primaryStage.setFullScreenExitHint("");
            primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
            primaryStage.setTitle("TypeTest");
            primaryStage.setScene(mainMenu);
            setPrimaryStage(primaryStage);
            primaryStage.show(); //Need this to see stage
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void setPrimaryStage(Stage primaryStage) {
        HelloApplication.primaryStage = primaryStage;
    }
    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}