package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import com.sayuri.panaderiahu.models.Administrador;
import com.sayuri.panaderiahu.models.Alimento;
import com.sayuri.panaderiahu.models.Galleta;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AgregarGalletaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textGalleta;

    @FXML
    private TextField textCosto;

    @FXML
    private TextField textTipo;

    @FXML
    private Button bttonAgregar;

    @FXML
    private Button bttonVolver;

    @FXML
    void bttonAgregar(MouseEvent event) {
        try {
            String nombre = textGalleta.getText();
            String costoStr = textCosto.getText();
            String tipo = textTipo.getText();

            if (nombre.isEmpty() || costoStr.isEmpty() || tipo.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }

            int costo = Integer.parseInt(costoStr);

            Galleta galleta = new Galleta(nombre, costo, tipo);
            HelloApplication.getAdmin().addAlimentos(galleta);


            System.out.println("Nombre : [" + galleta.getNombre() + "]");
            System.out.println("Costo : [" + galleta.getCosto() + "]");
            System.out.println("Tipo : [" + galleta.getTipoGalleta()
                    + "]");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos introducidos en el formulario...");
            alert.setHeaderText("Ha introducido correctamente los " +
                    "datos en el formulario. Se muestran a continuación.");
            alert.setContentText("Nombre: " + nombre +
                    System.lineSeparator() + "Costo: " + costo + System.lineSeparator() + "Tipo :" + tipo);

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

    }
}