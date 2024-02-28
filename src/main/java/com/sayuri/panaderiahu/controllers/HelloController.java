package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonadmin;

    @FXML
    private Button bttonempleado;

    @FXML
    void bttonadmin(MouseEvent event) {
        HelloApplication.newStage("eleccionAdministrador-view", "");
    }

    @FXML
    void bttonempleado(MouseEvent event) {
        HelloApplication.newStage("EleccionEmpleado-view","");
    }

    @FXML
    void initialize() {
        assert bttonadmin != null : "fx:id=\"bttonadmin\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert bttonempleado != null : "fx:id=\"bttonempleado\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

    public void init(Stage stageRoot) {
    }
}
