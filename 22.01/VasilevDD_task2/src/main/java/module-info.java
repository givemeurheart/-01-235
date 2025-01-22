module ru.vasilevv.vasilevdd_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilevv.vasilevdd_task2 to javafx.fxml;
    exports ru.vasilevv.vasilevdd_task2;
}