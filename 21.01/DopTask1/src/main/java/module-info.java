module ru.lar.doptask1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.lar.doptask1 to javafx.fxml;
    exports ru.lar.doptask1;
}