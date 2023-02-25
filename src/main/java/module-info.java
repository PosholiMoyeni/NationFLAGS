module com.example.nationflags {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nationflags to javafx.fxml;
    exports com.example.nationflags;
}