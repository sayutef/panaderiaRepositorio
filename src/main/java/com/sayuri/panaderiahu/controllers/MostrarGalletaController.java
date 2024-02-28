package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import com.sayuri.panaderiahu.models.Administrador;
import com.sayuri.panaderiahu.models.Alimento;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class MostrarGalletaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listGalleta;

    @FXML
    private Button bttonVolver;

    @FXML
    private Button bttonMostrar;

    @FXML
    void bttonMostrar(MouseEvent event) {
        Administrador admi = HelloApplication.getAdmin();
        for (Alimento galleta : admi.getListAlimentos()){
            listGalleta.getItems().add(galleta.toString());
    }
    }

    @FXML
    void bttonVolver(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        assert listGalleta != null : "fx:id=\"listGalleta\" was not injected: check your FXML file 'MostrarGalleta.fxml'.";
        assert bttonVolver != null : "fx:id=\"bttonVolver\" was not injected: check your FXML file 'MostrarGalleta.fxml'.";
        assert bttonMostrar != null : "fx:id=\"bttonMostrar\" was not injected: check your FXML file 'MostrarGalleta.fxml'.";

    }
}