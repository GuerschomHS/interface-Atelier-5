module com.example.interfaceatelier5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.interfaceatelier5 to javafx.fxml;
    exports com.example.interfaceatelier5;
}