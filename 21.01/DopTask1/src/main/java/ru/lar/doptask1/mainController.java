package ru.lar.doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Set;

public class mainController {

    @FXML
    private TextField A1;

    @FXML
    private TextField A2;

    @FXML
    private TextField B1;

    @FXML
    private TextField B2;

    @FXML
    private Button BTN;

    @FXML
    private TextField C1;

    @FXML
    private TextField C2;

    @FXML
    private Label SetX;

    @FXML
    private Label SetY;

    @FXML
    void BTNonAction(ActionEvent event) {
int a1 = Integer.parseInt(A1.getText());
int a2 = Integer.parseInt(A2.getText());
int b1 = Integer.parseInt(B1.getText());
int b2 = Integer.parseInt(B2.getText());
int c1 = Integer.parseInt(C1.getText());
int c2 = Integer.parseInt(C2.getText());

        double d = a1 * b2 - a2 * b1;
        double x = (c1 * b2 - c2 * b1) / d;
        double y = (a1 * c2 - a2 * c1) / d;
        if (d != 0) {
            SetX.setText(String.valueOf(x));
            SetY.setText(String.valueOf(y));
        }
        else {
            SetX.setText("Нет решения.");
            SetY.setText("Нет решения.");
        }

    }

}
