module ru.vasilev.taskfour2501 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilev.taskfour2501 to javafx.fxml;
    exports ru.vasilev.taskfour2501;
}