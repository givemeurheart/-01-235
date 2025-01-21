package ru.vasilevv.task11;

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
    private Label resultP;

    @FXML
    private Label resultc;

    @FXML
    void onClickResult(ActionEvent event) {
        double a = Double.parseDouble(inputa.getText());
        double b = Double.parseDouble(inputb.getText());

        resultc.setText("S = " + (a * b));
        resultP.setText("P = " + (2 * (a + b)));
    }

}
