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

public class MostrarPastelController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonvolver;

    @FXML
    private ListView<String> listpastel;

    @FXML
    private Button bttonMostrar;

    @FXML
    void bttonMostrar(MouseEvent event) {
        Administrador pastel =HelloApplication.getAdmin();
        for (Alimento pastel1 : pastel.getListAlimentos()){
            listpastel.getItems().add(pastel1.toString());
        }
    }

    @FXML
    void bttonvolver(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        assert bttonvolver != null : "fx:id=\"bttonvolver\" was not injected: check your FXML file 'MostrarPastel.fxml'.";
        assert listpastel != null : "fx:id=\"listpastel\" was not injected: check your FXML file 'MostrarPastel.fxml'.";
        assert bttonMostrar != null : "fx:id=\"bttonMostrar\" was not injected: check your FXML file 'MostrarPastel.fxml'.";

    }
}