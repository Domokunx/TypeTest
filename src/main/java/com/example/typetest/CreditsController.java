package com.example.typetest;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CreditsController {

    public void switchToMainMenu(ActionEvent event) throws IOException {
        RootSwitchMethods switcher = new RootSwitchMethods();
        switcher.switchToMainMenu(event);
    }
}
