package ru.vasilevv.vasilevd_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import static java.lang.Math.*;
public class LoveLizy {

    @FXML
    private ImageView pic;

    @FXML
    private Label rez;

    @FXML
    private Button vich;

    @FXML
    private TextField xF;

    @FXML
    private TextField yF;

    @FXML
    void lyblyLizy(ActionEvent event) {
        float x=Float.parseFloat(xF.getText());
        float y=Float.parseFloat(yF.getText());
        if(x<10 && x>0 && y<5 && y>0)
            rez.setText("Yes");
        else
        if(x>10 || x<0 || y>5 || y<0)
            rez.setText("No");
        else
            rez.setText("Граница");
    }

}
