module ru.vasiliev.task2
{
        requires javafx.controls;
        requires javafx.fxml;


        opens ru.vasiliev.task2 to javafx.fxml;
        exports ru.vasiliev.task2;
}