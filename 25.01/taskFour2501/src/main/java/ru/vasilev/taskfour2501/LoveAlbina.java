package ru.vasilev.taskfour2501;

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
    private TextField numberTextField2;

    @FXML
    void addDoza(ActionEvent event) {
           double X = Double.parseDouble(numberTextField.getText().toString());
           int N = Integer.parseInt(numberTextField2.getText().toString());
           double S4 = 0;
           double R4 = 1;
           for (int i = 1; i <= N; i++) {
               S4 = S4+R4*pow(X,N)/N * 1f;
               R4 = R4 * (-1);

           }
        answerLabel.setText("R4 = " +R4);

    }

    @FXML
    void cancelDoza(ActionEvent event) {
        Platform.exit();
    }

}
