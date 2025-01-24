module ru.vasilevv.vasilek_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilevv.vasilek_task2 to javafx.fxml;
    exports ru.vasilevv.vasilek_task2;
}