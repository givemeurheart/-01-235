package com.vasiliev.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;
import static java.lang.Math.log;

public class NewController {

    @FXML
    private Label Rezult;

    @FXML
    private TextField XTextField;

    @FXML
    private TextField gTextField;

    @FXML
    private Button resultBtn;

    @FXML
    void resuiltBtnonAction(ActionEvent event) {
        double x = Double.parseDouble(XTextField.getText());
        double g = Double.parseDouble(gTextField.getText());
        double y = x + sqrt(abs(1 - pow(x, 2)));
        double d = x + pow(y, 2) * log(abs(x - y));
        if (d != 0) {
            double z= (pow(sin(x+g),2)+cos(x))/(x+pow(y,2)* log(abs(x - y)));
            Rezult.setText("Z = "+ z);
        }else Rezult.setText("Знаменатель равен нулю!");
    }

}
