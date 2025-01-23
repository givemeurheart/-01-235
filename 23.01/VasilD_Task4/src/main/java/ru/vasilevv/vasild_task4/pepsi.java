package ru.vasilevv.vasild_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import  static java.lang.Math.*;
public class pepsi {

    @FXML
    private TextField AlbinaYaNaKolenyaxField;

    @FXML
    private Label db;

    @FXML
    private Label rez;

    @FXML
    private Button sostv;

    @FXML
    void pepsi(ActionEvent event) {
        float x = Float.parseFloat(AlbinaYaNaKolenyaxField.getText());
        double a;
        if (-PI / 2 < x && x < PI / 2) {
            a = sqrt(abs((sin(x) + pow(tan(x), 2)) / (3.5 * cos(x))));
            rez.setText("y="+a);
        } else if (PI / 2 < x && x < PI){
            a = cos(x/3)/(sin(x)+pow(tan(3),2));
            rez.setText("у=" +a);
        }else rez.setText("Низя найти y");
    }

}
