module ru.vasilevv.vasild_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilevv.vasild_task4 to javafx.fxml;
    exports ru.vasilevv.vasild_task4;
}