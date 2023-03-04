module com.ltd.myapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ltd.myapp to javafx.fxml;
    exports com.ltd.myapp;
}
