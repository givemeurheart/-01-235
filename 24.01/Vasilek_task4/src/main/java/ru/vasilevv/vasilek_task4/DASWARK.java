package ru.vasilevv.vasilek_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DASWARK {

    @FXML
    private TextField kField;

    @FXML
    private TextField nField;

    @FXML
    private Label rez;

    @FXML
    private Label tt;

    @FXML
    private Label tt1;

    @FXML
    private Button vip;

    @FXML
    void DASWARK(ActionEvent event) {
        try {
            int N = Integer.parseInt(nField.getText());
            int K = Integer.parseInt(kField.getText());

            if (K <= 0) {
                rez.setText("Делитель должен быть положительным.");
                return;
            }

            int quotient = 0;
            int remainder = N;


            while (remainder >= K) {
                remainder -= K;
                quotient++;
            }

            rez.setText("Частное: " + quotient + ", Остаток: " + remainder);
        } catch (NumberFormatException e) {
            rez.setText("Введите корректные целые положительные числа!");
        }

    }
}
