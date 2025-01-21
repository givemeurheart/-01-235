module ru.vasilevv.task11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilevv.task11 to javafx.fxml;
    exports ru.vasilevv.task11;
}