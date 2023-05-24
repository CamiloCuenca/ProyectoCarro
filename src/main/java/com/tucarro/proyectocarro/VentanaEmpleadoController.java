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

    //Atributos
    @FXML
    private Button btnClientes;
    @FXML
    private BorderPane borderPane;

    /**Este metodo se encarga de mostrar el panel donde se encuentra la tabla de los clientes.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void clientes(ActionEvent event) throws IOException {

        Stage stage = new Stage();
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("clientes.fxml"));
       AnchorPane pane = (AnchorPane) loader.load() ;
       borderPane.setCenter(pane);

    }
}
