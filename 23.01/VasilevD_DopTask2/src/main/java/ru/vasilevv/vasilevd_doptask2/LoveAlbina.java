package ru.vasilevv.vasilevd_doptask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoveAlbina {

    @FXML
    private Label jj;

    @FXML
    private TextField nudsField;

    @FXML
    private Button opr;

    @FXML
    private Label rez;

    @FXML
    void LoveAlbina(ActionEvent event) {
        int num = Integer.parseInt(nudsField.getText());
        String result = "";
        if (num % 2 == 0) result += "четное ";
        else result += "нечетное ";
        if (num >= 1 && num <= 9) result += "однозначное ";
        else if (num >= 10 && num <= 99) result += "двузначное ";
        else if (num >= 100 && num <= 999) result += "трехзначное ";
        rez.setText(result + "число");
    }

}
