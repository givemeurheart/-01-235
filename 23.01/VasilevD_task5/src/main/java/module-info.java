module ru.vasilevv.vasilevd_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilevv.vasilevd_task5 to javafx.fxml;
    exports ru.vasilevv.vasilevd_task5;
}