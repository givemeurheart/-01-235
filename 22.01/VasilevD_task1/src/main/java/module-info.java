module ru.vasilevv.vasilevd_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilevv.vasilevd_task1 to javafx.fxml;
    exports ru.vasilevv.vasilevd_task1;
}