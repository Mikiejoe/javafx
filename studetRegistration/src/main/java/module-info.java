module com.example.studetregistration {
    requires javafx.controls;
    requires javafx.fxml;

//    requires org.controlsfx.controls;
//    requires com.dlsc.formsfx;
//    requires org.kordamp.bootstrapfx.core;

    opens com.example.studetregistration to javafx.fxml;
    exports com.example.studetregistration;
}