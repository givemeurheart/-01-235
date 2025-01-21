module com.vasiliev.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vasiliev.task4 to javafx.fxml;
    exports com.vasiliev.task4;
}