package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import com.sayuri.panaderiahu.models.Administrador;
import com.sayuri.panaderiahu.models.Arqueo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
public class AgregarArqueoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textCantPanes;

    @FXML
    private TextField textCantPastel;

    @FXML
    private TextField textCantGalleta;

    @FXML
    private TextField textCostoPanVendido;

    @FXML
    private TextField textCostoPastelVendido;

    @FXML
    private TextField textCostoGalletaVendida;

    @FXML
    private Button bttonAgregar;

    @FXML
    private Button bttonVolver;

    @FXML
    void bttonAgregar(MouseEvent event) {
        try {
            int cantPanes = Integer.parseInt(textCantPanes.getText());
            int cantPastel = Integer.parseInt(textCantPastel.getText());
            int cantGalleta = Integer.parseInt(textCantGalleta.getText());
            int costoPan = Integer.parseInt(textCostoPanVendido.getText());
            int costoPastel = Integer.parseInt(textCostoPastelVendido.getText());
            int costoGalleta = Integer.parseInt(textCostoGalletaVendida.getText());

            Arqueo arqueo3 = new Arqueo(costoPan, costoPastel, costoGalleta, cantPanes, cantPastel, cantGalleta);
            arqueo3.setCostoPan(costoPan * cantPanes);
            arqueo3.setCostoPastel(costoPastel * cantPastel);
            arqueo3.setCostoGalleta(costoGalleta *cantGalleta);

            HelloApplication.getAdmin().addArqueo(arqueo3);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Arqueo Agregado");
            alert.setHeaderText("Se ha agregado un nuevo arqueo:");
            alert.setContentText("Cantidad de Panes: " + arqueo3.getCantPan() +
                    "\nCantidad de Pasteles: " + arqueo3.getCantPastel() +
                    "\nCantidad de Galletas: " + arqueo3.getCantGalleta() +
                    "\nCosto de Pan: " + arqueo3.getCostoPan() +
                    "\nCosto de Pastel: " + arqueo3.getCostoPastel() +
                    "\nCosto de Galleta: " + arqueo3.getCostoGalleta());
            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error en la entrada de datos");
            alert.setHeaderText("Por favor, ingrese números válidos en los campos.");
            alert.showAndWait();
        }
    }

    @FXML
    void bttonVolver(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        assert textCantPanes != null : "fx:id=\"textCantPanes\" was not injected: check your FXML file 'AgregarArqueo-view.fxml'.";
        assert textCantPastel != null : "fx:id=\"textCantPastel\" was not injected: check your FXML file 'AgregarArqueo-view.fxml'.";
        assert textCantGalleta != null : "fx:id=\"textCantGalleta\" was not injected: check your FXML file 'AgregarArqueo-view.fxml'.";
        assert textCostoPanVendido != null : "fx:id=\"textCostoPanVendido\" was not injected: check your FXML file 'AgregarArqueo-view.fxml'.";
        assert textCostoPastelVendido != null : "fx:id=\"textCostoPastelVendido\" was not injected: check your FXML file 'AgregarArqueo-view.fxml'.";
        assert textCostoGalletaVendida != null : "fx:id=\"textCostoGalletaVendida\" was not injected: check your FXML file 'AgregarArqueo-view.fxml'.";
        assert bttonAgregar != null : "fx:id=\"bttonAgregar\" was not injected: check your FXML file 'AgregarArqueo-view.fxml'.";
        assert bttonVolver != null : "fx:id=\"bttonVolver\" was not injected: check your FXML file 'AgregarArqueo-view.fxml'.";

    }
}