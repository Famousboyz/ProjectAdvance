module com.example.projectadvance {
    requires javafx.controls;
    requires javafx.fxml;
    requires zip4j;


    opens com.example.projectadvance to javafx.fxml;
    exports com.example.projectadvance;
}