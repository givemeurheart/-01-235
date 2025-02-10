package ru.vasilev.tasktwo2501;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class LoveAlbina {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkDoza(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int n = data.get(0);
        int t = data.get(1);
        int S2 = 0;
        if (n<t)
        while (n <= t) {
            if (n % 2 == 0) {
                S2 ++;
            } n ++;
        }else while (t <= n) {
                if (t % 2 == 0) {
                    S2 ++;
                } t ++;
                    answerLabel.setText(String.valueOf(S2));


            }
        }

    @FXML
    void addDoza(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());
            dataListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            numberTextField.setText("");
        }

    }

    @FXML
    void cancelDoza(ActionEvent event) {
        Platform.exit();

    }

}