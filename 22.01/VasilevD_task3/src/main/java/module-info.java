module ru.vasilevv.vasilevd_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilevv.vasilevd_task3 to javafx.fxml;
    exports ru.vasilevv.vasilevd_task3;
}