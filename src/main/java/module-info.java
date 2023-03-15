module com.example.typetest {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.typetest to javafx.fxml;
    exports com.example.typetest;
}