package com.sayuri.panaderiahu.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sayuri.panaderiahu.HelloApplication;
import com.sayuri.panaderiahu.models.Administrador;
import com.sayuri.panaderiahu.models.Empleado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
public class AgregarEmpleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textEmpleado;

    @FXML
    private TextField textTelefono;

    @FXML
    private Button bttonAgregar;

    @FXML
    private Button bttonVolver;

    @FXML
    void bttonAgregar(MouseEvent event) {
        try {
            String nombre = textEmpleado.getText();
            String telefonoStr = textTelefono.getText();

            if (nombre.isEmpty() || telefonoStr.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }

            int telefono = Integer.parseInt(telefonoStr);

            Empleado empleado = new Empleado(nombre, telefono);


            HelloApplication.getAdmin().addEmpleados(empleado);
            System.out.println("nombre " +empleado.getNombre() + ": ");
            System.out.println("telefono "+empleado.getTelefono()+ ": ");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Empleado Agregado");
            alert.setHeaderText("Se ha agregado un nuevo empleado:");
            alert.setContentText("Nombre: " + empleado.getNombre() +
                    "\nTeléfono: " + empleado.getTelefono());

            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error en la entrada de datos");
            alert.setHeaderText("Por favor, ingrese un número válido en el campo de Teléfono.");
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
        assert textEmpleado != null : "fx:id=\"textEmpleado\" was not injected: check your FXML file 'AgregarEmpleado.fxml'.";
        assert textTelefono != null : "fx:id=\"textTelefono\" was not injected: check your FXML file 'AgregarEmpleado.fxml'.";
        assert bttonAgregar != null : "fx:id=\"bttonAgregar\" was not injected: check your FXML file 'AgregarEmpleado.fxml'.";
        assert bttonVolver != null : "fx:id=\"bttonVolver\" was not injected: check your FXML file 'AgregarEmpleado.fxml'.";

    }
}