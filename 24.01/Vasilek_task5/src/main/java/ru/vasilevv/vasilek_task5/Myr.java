package ru.vasilevv.vasilek_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Myr {

    @FXML
    private Label rez;

    @FXML
    private Label rr;

    @FXML
    private Button vich;

    @FXML
    private TextField zxcField;

    @FXML
    void Myr(ActionEvent event) {
        try {
            int N = Integer.parseInt(zxcField.getText());

            if (N <= 1) {
                rez.setText("Введите число больше 1!");
                return;
            }
            int K = 0;
            int sum = 0;

            while (sum < N) {
                K++;
                sum += K;
            }

            rez.setText("K: " + K + ", Сумма: " + sum);
        } catch (NumberFormatException e) {
            rez.setText("Введите корректное целое число!");
        }

    }
}
