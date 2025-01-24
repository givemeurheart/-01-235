package ru.vasilevv.vasilek_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class yuki {

    @FXML
    private Label gg;

    @FXML
    private Label gg2;

    @FXML
    private Button opr;

    @FXML
    private Label rez;

    @FXML
    private TextField sField;

    @FXML
    private TextField vField;

    @FXML
    void yuki(ActionEvent event) {
        try {
            int value = Integer.parseInt(vField.getText());
            int suit = Integer.parseInt(sField.getText());

            if (value < 6 || value > 14 || suit < 1 || suit > 4) {
                rez.setText("Некорректные входные данные!");
                return;
            }

            String[] suits = {"пики", "трефы", "бубны", "черви"};
            String[] values = {
                    "шестёрка", "семёрка", "восьмёрка", "девятка", "десятка",
                    "валет", "дама", "король", "туз"
            };

            String cardName = values[value - 6] + " " + suits[suit - 1];
            rez.setText(cardName);
        } catch (NumberFormatException e) {
            rez.setText("Введите корректные числа!");
        }

    }
}
