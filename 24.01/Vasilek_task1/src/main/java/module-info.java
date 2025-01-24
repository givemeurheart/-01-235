module ru.vasilevv.vasilek_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilevv.vasilek_task1 to javafx.fxml;
    exports ru.vasilevv.vasilek_task1;
}