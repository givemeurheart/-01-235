module ru.vasilev.taskthree2501 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vasilev.taskthree2501 to javafx.fxml;
    exports ru.vasilev.taskthree2501;
}