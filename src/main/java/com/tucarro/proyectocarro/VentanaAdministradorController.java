package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class VentanaAdministradorController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button btnEmpleados;

    @FXML
    private Button btnRegistros;

    @FXML
    void Empleado(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Empleados.fxml"));
        AnchorPane pane = (AnchorPane) loader.load() ;
        borderPane.setCenter(pane);

    }

    @FXML
    void Registro(ActionEvent event) {

    }

}
