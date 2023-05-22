package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import java.io.IOException;

public class VentanaEmpleadoController {


    @FXML
    private Button btnClientes;
    @FXML
    private BorderPane borderPane;

    @FXML
    void clientes(ActionEvent event) throws IOException {

        Stage stage = new Stage();
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("clientes.fxml"));
       AnchorPane pane = (AnchorPane) loader.load() ;
       borderPane.setCenter(pane);

    }
}
