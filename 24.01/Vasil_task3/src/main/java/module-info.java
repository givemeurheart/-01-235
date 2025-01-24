module ru.vasilevv.vasil_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilevv.vasil_task3 to javafx.fxml;
    exports ru.vasilevv.vasil_task3;
}