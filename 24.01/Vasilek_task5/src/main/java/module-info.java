module ru.vasilevv.vasilek_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilevv.vasilek_task5 to javafx.fxml;
    exports ru.vasilevv.vasilek_task5;
}