package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import com.sayuri.panaderiahu.models.Administrador;
import com.sayuri.panaderiahu.models.Pastel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class AgregarPastelController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textPastel;

    @FXML
    private TextField textCosto;

    @FXML
    private TextField textSabor;

    @FXML
    private Button bttonAgregar;

    @FXML
    private Button bttonVolver;

    @FXML
    void bttonAgregar(MouseEvent event) {
        try {
            String nombre = textPastel.getText();
            String costoStr = textCosto.getText();
            String sabor = textSabor.getText();

            if (nombre.isEmpty() || costoStr.isEmpty() || sabor.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }

            int costo = Integer.parseInt(costoStr);

            Pastel pastel = new Pastel(nombre, costo, sabor);
            HelloApplication.getAdmin().addAlimentos(pastel);
            System.out.println("Nombre : [" + pastel.getNombre() + "]");
            System.out.println("Costo : [" + pastel.getCosto() + "]");
            System.out.println("Tipo pan : [" + pastel.getSabor() + "]");
            System.out.println(pastel.toString());

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos introducidos en el formulario...");
            alert.setHeaderText("Ha introducido correctamente los " +
                    "datos en el formulario. Se muestran a continuación.");
            alert.setContentText(pastel.toString());

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
        assert textPastel != null : "fx:id=\"textPastel\" was not injected: check your FXML file 'AgregarPastel.fxml'.";
        assert textCosto != null : "fx:id=\"textCosto\" was not injected: check your FXML file 'AgregarPastel.fxml'.";
        assert textSabor != null : "fx:id=\"textSabor\" was not injected: check your FXML file 'AgregarPastel.fxml'.";
        assert bttonAgregar != null : "fx:id=\"bttonAgregar\" was not injected: check your FXML file 'AgregarPastel.fxml'.";
        assert bttonVolver != null : "fx:id=\"bttonVolver\" was not injected: check your FXML file 'AgregarPastel.fxml'.";

    }
}

