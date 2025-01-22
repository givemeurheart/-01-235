package ru.vasilevv.vasilevdd_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class sosoX {

    @FXML
    private TextField gg;

    @FXML
    private Button rez;

    @FXML
    private Label rr;

    @FXML
    private Label vich;

    @FXML
    void dll(ActionEvent event) {
        float E= Float.parseFloat(gg.getText());
        int D=(int)(E/60%60);
        vich.setText(D+"минут");
    }

}
