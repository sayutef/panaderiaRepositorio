module com.sayuri.panaderiahu {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.attach.display;

    exports com.sayuri.panaderiahu;
    opens com.sayuri.panaderiahu.controllers to javafx.fxml;
}
