package com.example.typetest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
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
}