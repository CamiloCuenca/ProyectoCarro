package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TablasVehiculosController  implements Initializable {

    @FXML
    private Button btndeportivo;

    @FXML
    private BorderPane bordenPane;

    @FXML
    private Button camiones;

    @FXML
    private Button camionetas;

    @FXML
    private Button motos;

    @FXML
    void deportivos(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("tablaDeportivos.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        bordenPane.setCenter(pane);


    }

    @FXML
    void Sedan(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("tablaDeportivos.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        bordenPane.setCenter(pane);


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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
