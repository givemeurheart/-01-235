package ru.vasilev.taskthree2501;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class LoveAlbina {

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Double> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void addDoza(ActionEvent event) {
        double S3 = Double.parseDouble(numberTextField.getText().toString());
        for (int i = 1; i <= 10; i++) {
            double x = S3 * i;
            dataListView.getItems().add(x);
        }
    }

    @FXML
    void cancelDoza(ActionEvent event) {
        Platform.exit();
    }

}
