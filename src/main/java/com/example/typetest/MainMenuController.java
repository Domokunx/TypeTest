package com.example.typetest;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {
    public void switchToPracticeMode(ActionEvent e) throws IOException {
        RootSwitchMethods switcher = new RootSwitchMethods();
        switcher.switchToPracticeMode(e);
    }
    public void switchToCredits(ActionEvent e) throws IOException {
        RootSwitchMethods switcher = new RootSwitchMethods();
        switcher.switchToCredits(e);
    }
    public void switchToOptions(ActionEvent e) throws IOException {
        RootSwitchMethods switcher = new RootSwitchMethods();
        switcher.switchToOptions(e);
    }
    public void logout(ActionEvent e) throws IOException {
        Stage stage = HelloApplication.getPrimaryStage();
        stage.close();
    }
}