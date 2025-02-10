module ru.vasilev.tasktwo2501 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilev.tasktwo2501 to javafx.fxml;
    exports ru.vasilev.tasktwo2501;
}