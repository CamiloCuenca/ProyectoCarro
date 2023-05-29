package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TablasVehiculosController {

    @FXML
    private Button automoviles;

    @FXML
    private BorderPane bordenPane;

    @FXML
    private Button camiones;

    @FXML
    private Button camionetas;

    @FXML
    private Button motos;

    @FXML
    void AutoMoviles(ActionEvent event) {

    }

    @FXML
    void Camiones(ActionEvent event) {

    }

    @FXML
    void Camionetas(ActionEvent event) {

    }

    @FXML
    void Motos(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("tablaMotos.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        bordenPane.setCenter(pane);


    }


}
