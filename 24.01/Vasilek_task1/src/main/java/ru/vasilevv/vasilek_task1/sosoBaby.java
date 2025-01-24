package ru.vasilevv.vasilek_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class sosoBaby {

    @FXML
    private Label ff;

    @FXML
    private TextField numField;

    @FXML
    private Button opr;

    @FXML
    private Label rez;

    @FXML
    void sosoBaby(ActionEvent event) {
        try {
            int month = Integer.parseInt(numField.getText());
            String season;

            switch (month) {
                case 1:
                case 2:
                case 12:
                    season = "Зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Осень";
                    break;
                default:
                    rez.setText("Введите корректный номер месяца (1-12)!");
                    return;
            }

            rez.setText("Время года: " + season);
        } catch (NumberFormatException e) {
            rez.setText("Введите корректный номер месяца!");
        }

    }
}
