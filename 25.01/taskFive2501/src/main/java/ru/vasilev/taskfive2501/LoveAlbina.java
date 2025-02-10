package ru.vasilev.taskfive2501;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class LoveAlbina {

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField numberTextField;

    @FXML
    void addDoza(ActionEvent event) {
        double X = Double.parseDouble(numberTextField.getText().toString());
        double S4 = 1;
        for (int i = 1; i <= X; i++) {
            S4 = i * S4 + 1.0 / i;


        }
        answerLabel.setText("S4 = " +S4);
    }

    @FXML
    void cancelDoza(ActionEvent event) {
            Platform.exit();
        }

    }


