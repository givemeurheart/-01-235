package ru.vasilevv.vasilevd_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class krnk {

    @FXML
    private Label VDN;

    @FXML
    private TextField gg;

    @FXML
    private Button rez;

    @FXML
    private Label vich;

    @FXML
    void kkk(ActionEvent event) {
    float E= Float.parseFloat(gg.getText());
    int W= (int) (E%7);
    switch (W) {
        case (1):
            vich.setText("вторник");
            break;
        case (2):
            vich.setText("среда");
            break;
        case (3):
            vich.setText("четверг");
            break;
        case (4):
            vich.setText("пятница");
            break;
        case (5):
            vich.setText("суббота");
            break;
        case (6):
            vich.setText("воскресенье");
            break;
        case (0):
            vich.setText("понедельник");
            break;







    }
    }

}
