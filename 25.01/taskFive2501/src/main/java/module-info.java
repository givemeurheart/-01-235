module ru.vasilev.taskfive2501 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilev.taskfive2501 to javafx.fxml;
    exports ru.vasilev.taskfive2501;
}