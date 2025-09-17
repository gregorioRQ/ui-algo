module com.pola {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pola to javafx.fxml;
    exports com.pola;
}
