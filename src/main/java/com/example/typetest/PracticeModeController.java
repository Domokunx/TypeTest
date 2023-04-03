package com.example.typetest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.io.IOException;

public class PracticeModeController {

    @FXML TextArea paragraph;
    @FXML TextField typingArea;
    @FXML Label accuracyLabel;

    private int wordIndex = 0;
    private int correctWordCount = 0;
    private int wordCount = 0;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void onSubmitWord() {
        String paragraphText = paragraph.getText();
        String[] words = paragraphText.split(" ");
        if (wordIndex == words.length - 1) {
            return;
        }
        checkCurrentWord();
    }

    private void checkCurrentWord() {
        typingArea.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode() == KeyCode.SPACE) {
                highlightCurrentWord();
                String wordTyped = typingArea.getText().trim();
                String paragraphText = paragraph.getText();
                String[] words = paragraphText.split(" ");
                String currentWord = words[wordIndex++];
                wordCount++;

                if (currentWord.equals(wordTyped)) {
                    correctWordCount++;
                }

                typingArea.setText("");
                int accuracy = correctWordCount * 100 / wordCount;
                String accuracyString = accuracy + "%";
                accuracyLabel.setText(accuracyString);

                stage = HelloApplication.getPrimaryStage();
                stage.show();
            }
        });
    }

    public void highlightCurrentWord() {
        paragraph.requestFocus();
        paragraph.selectNextWord();
        typingArea.requestFocus();

    }

    public void switchToMainMenu(ActionEvent e) throws IOException {
        RootSwitchMethods switcher = new RootSwitchMethods();
        switcher.switchToMainMenu(e);
    }
}
