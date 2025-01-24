package ru.vasilevv.vasil_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoveZMK {

    @FXML
    private Label Ar;

    @FXML
    private TextField aField;

    @FXML
    private Button nait;

    @FXML
    private Label rdd1;

    @FXML
    private Label rdd2;

    @FXML
    private Label rez;

    @FXML
    private TextField rrField;

    @FXML
    void LoveZMK(ActionEvent event) {
        int elementNumber = Integer.parseInt(aField.getText());
        double elementValue = Double.parseDouble(rrField.getText());

        double a = 0, R1 = 0, R2 = 0, S = 0;

        switch (elementNumber) {
            case 1:
                a = elementValue;
                R1 = a * Math.sqrt(3) / 4;
                R2 = 2 * R1;
                S = a * a * Math.sqrt(3) / 4;
                break;
            case 2:
                R1 = elementValue;
                a = (4 * R1) / Math.sqrt(3);
                R2 = 2 * R1;
                S = a * a * Math.sqrt(3) / 4;
                break;
            case 3:
                R2 = elementValue;
                R1 = R2 / 2;
                a = (4 * R1) / Math.sqrt(3);
                S = a * a * Math.sqrt(3) / 4;
                break;
            case 4:
                S = elementValue;
                a = Math.sqrt((4 * S) / Math.sqrt(3));
                R1 = a * Math.sqrt(3) / 4;
                R2 = 2 * R1;
                break;
            default:
                return;
        }
        rez.setText("Сторона a: " + a);
        rdd1.setText("Радиус R1: " + R1);
        rdd2.setText("Радиус R2: " + R2);
        Ar.setText("Площадь S: " + S);
    }

}
