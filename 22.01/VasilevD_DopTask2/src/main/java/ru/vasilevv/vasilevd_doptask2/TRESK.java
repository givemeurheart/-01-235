package ru.vasilevv.vasilevd_doptask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TRESK {

    @FXML
    private TextField gg;

    @FXML
    private Label god;

    @FXML
    private Button opr;

    @FXML
    private Label otv;

    @FXML
    void xanax(ActionEvent event) {
        int year = Integer.parseInt(gg.getText());
        if (year % 100 == 0)
            otv.setText("" + (year / 100));
        else
            otv.setText("" + (year / 100 + 1));
    }

}
