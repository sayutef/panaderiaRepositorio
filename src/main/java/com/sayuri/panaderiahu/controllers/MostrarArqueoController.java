package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import com.sayuri.panaderiahu.models.Administrador;
import com.sayuri.panaderiahu.models.Arqueo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class MostrarArqueoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listArqueo;

    @FXML
    private Button bttonVolver;

    @FXML
    private Button bttonMostrar;

    @FXML
    void bttonMostrar(MouseEvent event) {
        Administrador imps = HelloApplication.getAdmin();
        for (Arqueo arqs : imps.getListArqueo()){
            listArqueo.getItems().add(arqs.toString());
        }
    }

    @FXML
    void bttonVolver(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        assert listArqueo != null : "fx:id=\"listArqueo\" was not injected: check your FXML file 'MostrarArqueo.fxml'.";
        assert bttonVolver != null : "fx:id=\"bttonVolver\" was not injected: check your FXML file 'MostrarArqueo.fxml'.";
        assert bttonMostrar != null : "fx:id=\"bttonMostrar\" was not injected: check your FXML file 'MostrarArqueo.fxml'.";

    }
}