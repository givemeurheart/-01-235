package ru.vasilevv.vasilek_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class IKUM {

    @FXML
    private Label gg;

    @FXML
    private TextField myrField;

    @FXML
    private Button razvorot;

    @FXML
    private Label rez;

    @FXML
    void IKUM(ActionEvent event) {
        try {
            int N = Integer.parseInt(myrField.getText());

            if (N <= 0) {
                rez.setText("Введите положительное число (> 0)!");
                return;
            }

            int reversedNumber = 0;

            while (N > 0) {
                int lastDigit = N % 10;
                reversedNumber = reversedNumber * 10 + lastDigit;
                N = N / 10;
            }
            rez.setText("Число в обратном порядке: " + reversedNumber);
        } catch (NumberFormatException e) {
            rez.setText("Введите корректное целое число!");
    }

}
}
