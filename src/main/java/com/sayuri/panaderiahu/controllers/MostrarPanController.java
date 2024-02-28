package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import com.sayuri.panaderiahu.models.Administrador;
import com.sayuri.panaderiahu.models.Alimento;
import com.sayuri.panaderiahu.models.Pan;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;

public class MostrarPanController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listPan;

    @FXML
    private Button bttonVolver;

    @FXML
    private Button bttonMostrar;
    @FXML
    private TextField textFieldNombre;

    @FXML
    private TextField textFieldCosto;

    @FXML
    private TextField textFieldTipoPan;


    private ObservableList<Pan> panList = FXCollections.observableArrayList();
    @FXML
    void bttonMostrar(MouseEvent event) {
        Administrador nose = HelloApplication.getAdmin();
        for (Alimento pan : nose.getListAlimentos()){
            listPan.getItems().add(pan.toString());
        }

    }
    @FXML
    void bttonMostrarCliked(MouseEvent event){

    }
    @FXML
    void bttonVolver(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {

    }
}