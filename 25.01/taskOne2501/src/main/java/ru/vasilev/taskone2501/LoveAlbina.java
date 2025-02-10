package ru.vasilev.taskone2501;

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
        int S = 0;
        for (int i = 1; i <= n; i++) {
            int m = data.get(i);
            if (m % 10 == 4 && m % 3 == 0) {
                S = S + m;

            }
        }
        if (S != 0 )
            answerLabel.setText(String.valueOf(S));
        else answerLabel.setText("Подоходящих чисел нет");

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
