package ru.vasiliev.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class NewController {

    @FXML
    private TextField inputa;

    @FXML
    private TextField inputb;

    @FXML
    private Button resultBtn;


    @FXML
    private Label resultc;

    @FXML
    void onClickResult(ActionEvent event) {
        double x1 = Double.parseDouble(inputa.getText());
        double x2 = Double.parseDouble(inputb.getText());
        resultc.setText("" + Math.abs(x2 - x1));
    }

}
