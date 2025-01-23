package ru.vasilevv.vasilevd_doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class pepsi {

    @FXML
    private TextField chField;

    @FXML
    private Label ff;

    @FXML
    private Button opr;

    @FXML
    private Label otv;

    @FXML
    void pepsi(ActionEvent event) {
        int num = Integer.parseInt(chField.getText());
        String result = "";
        if (num == 0) result += "нулевое";
        else {
            if (num > 0) result += "положительное ";
            else result += "отрицательное ";
            if (num % 2 == 0) result += "четное ";
            else result += "нечетное ";
        }
        otv.setText(result + "число");
    }

}
