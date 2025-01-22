package ru.vasilevv.vasilevd_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EzzEzz {

    @FXML
    private Label Rz;

    @FXML
    private TextField bbb;

    @FXML
    private Button rez;

    @FXML
    private Label vich;


    @FXML
    void EzzEzz(ActionEvent event) {
        float E = Float.parseFloat(bbb.getText());
        double D = (int)(E/1024);
        vich.setText(""+D);

    }


}
