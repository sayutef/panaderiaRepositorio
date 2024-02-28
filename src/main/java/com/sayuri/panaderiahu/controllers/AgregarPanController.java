package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import com.sayuri.panaderiahu.models.Administrador;
import com.sayuri.panaderiahu.models.Pan;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
public class AgregarPanController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textPan;

    @FXML
    private TextField textCosto;

    @FXML
    private TextField textTipoPan;

    @FXML
    private Button bttonAgregar;

    @FXML
    private Button bttonVolver;

    @FXML
    void bttonAgregar(MouseEvent event) {
        try {
            String nombre = textPan.getText();
            String costoStr = textCosto.getText();
            String tipoPan = textTipoPan.getText();

            if (nombre.isEmpty() || costoStr.isEmpty() || tipoPan.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }

            int costo = Integer.parseInt(costoStr);

            Pan pan = new Pan(nombre, costo, tipoPan);
            HelloApplication.getAdmin().addAlimentos(pan);

            System.out.println("Nombre : [" + pan.getNombre() + "]");
            System.out.println("Costo : [" + pan.getCosto() + "]");
            System.out.println("Tipo pan : [" + pan.getTipoPan() + "]");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos introducidos en el formulario...");
            alert.setHeaderText("Ha introducido correctamente los " +
                    "datos en el formulario. Se muestran a continuación.");
            alert.setContentText(pan.toString());

            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error en la entrada de datos");
            alert.setHeaderText("Por favor, ingrese números válidos en el campo de Costo.");
            alert.showAndWait();
        } catch (IllegalArgumentException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Faltan datos...");
            alert.setHeaderText(e.getMessage());
            alert.showAndWait();
        }
    }


    @FXML
    void bttonVolver(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        assert textPan != null : "fx:id=\"textPan\" was not injected: check your FXML file 'AgregarPan.fxml'.";
        assert textCosto != null : "fx:id=\"textCosto\" was not injected: check your FXML file 'AgregarPan.fxml'.";
        assert textTipoPan != null : "fx:id=\"textTipoPan\" was not injected: check your FXML file 'AgregarPan.fxml'.";
        assert bttonAgregar != null : "fx:id=\"bttonAgregar\" was not injected: check your FXML file 'AgregarPan.fxml'.";
        assert bttonVolver != null : "fx:id=\"bttonVolver\" was not injected: check your FXML file 'AgregarPan.fxml'.";

    }
}