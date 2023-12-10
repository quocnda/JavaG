module com.example.chatchit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatchit to javafx.fxml;
    exports com.example.chatchit;
}