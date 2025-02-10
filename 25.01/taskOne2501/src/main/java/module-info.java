module ru.vasilev.taskone2501 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilev.taskone2501 to javafx.fxml;
    exports ru.vasilev.taskone2501;
}