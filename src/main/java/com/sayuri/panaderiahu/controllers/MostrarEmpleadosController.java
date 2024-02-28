package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import com.sayuri.panaderiahu.models.Administrador;
import com.sayuri.panaderiahu.models.Empleado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class MostrarEmpleadosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listEmpleado;

    @FXML
    private Button bttonVolver;

    @FXML
    private Button bttonMostrar;

    @FXML
    void bttonMostrar(MouseEvent event) {
        Administrador empleadoss = HelloApplication.getAdmin();
        for (Empleado impiss : empleadoss.getListEmpleados()){
            listEmpleado.getItems().add(impiss.toString());
        }
    }

    @FXML
    void bttonVolver(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        assert listEmpleado != null : "fx:id=\"listEmpleado\" was not injected: check your FXML file 'MostrarEmpleados.fxml'.";
        assert bttonVolver != null : "fx:id=\"bttonVolver\" was not injected: check your FXML file 'MostrarEmpleados.fxml'.";
        assert bttonMostrar != null : "fx:id=\"bttonMostrar\" was not injected: check your FXML file 'MostrarEmpleados.fxml'.";

    }
}