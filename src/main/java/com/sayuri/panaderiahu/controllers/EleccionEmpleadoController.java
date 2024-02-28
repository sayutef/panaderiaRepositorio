package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class EleccionEmpleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonAddArqueo;

    @FXML
    private Button bttonViewArqueo;

    @FXML
    private Button bttonVolver;

    @FXML
    void bttonAddArqueo(MouseEvent event) {
        HelloApplication.newStage("AgregarArqueo", "");
    }

    @FXML
    void bttonViewArqueo(MouseEvent event) {
        HelloApplication.newStage("MostrarArqueo", "");
    }

    @FXML
    void bttonVolver(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        assert bttonAddArqueo != null : "fx:id=\"bttonAddArqueo\" was not injected: check your FXML file 'EleccionEmpleado-view.fxml'.";
        assert bttonViewArqueo != null : "fx:id=\"bttonViewArqueo\" was not injected: check your FXML file 'EleccionEmpleado-view.fxml'.";
        assert bttonVolver != null : "fx:id=\"bttonVolver\" was not injected: check your FXML file 'EleccionEmpleado-view.fxml'.";

    }
}