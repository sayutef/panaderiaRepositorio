package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class EleccionAdministradorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonAddPan;

    @FXML
    private Button bttonAddPastel;

    @FXML
    private Button bttonAddGalleta;

    @FXML
    private Button bttonAddEmpleado;

    @FXML
    private Button bttonVolver;

    @FXML
    private Button bttonViewPan;

    @FXML
    private Button bttonViewGalleta;

    @FXML
    private Button bttonViewPastel;

    @FXML
    private Button bttonViewEmpleado;

    @FXML
    void bttonAddEmpleado(MouseEvent event) {
        HelloApplication.newStage("AgregarEmpleado","");
    }

    @FXML
    void bttonAddGalleta(MouseEvent event) {
        HelloApplication.newStage("AgregarGalleta", "");
    }

    @FXML
    void bttonAddPan(MouseEvent event) {
        HelloApplication.newStage("AgregarPan", "");
    }

    @FXML
    void bttonAddPastel(MouseEvent event) {
        HelloApplication.newStage("AgregarPastel", "");
    }

    @FXML
    void bttonViewEmpleado(MouseEvent event) {
        HelloApplication.newStage("MostrarEmpleados", "");
    }

    @FXML
    void bttonViewGalleta(MouseEvent event) {
        HelloApplication.newStage("MostrarGalleta", "");
    }

    @FXML
    void bttonViewPan(MouseEvent event) {
        HelloApplication.newStage("MostrarPan", "");
    }

    @FXML
    void bttonViewPastel(MouseEvent event) {
        HelloApplication.newStage("MostrarPastel", "");
    }

    @FXML
    void bttonVolver(MouseEvent event) {
        HelloApplication.getStageView().close();


        //HelloApplication.newStage("hello", "");
    }

    @FXML
    void initialize() {

    }
}