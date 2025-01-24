module ru.vasilevv.vasilek_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilevv.vasilek_task6 to javafx.fxml;
    exports ru.vasilevv.vasilek_task6;
}