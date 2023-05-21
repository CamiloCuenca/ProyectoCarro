package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class VentanaEmpleadoController {


    @FXML
    private Button btnClientes;

    @FXML
    void clientes(ActionEvent event) throws IOException {



        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("clientes.fxml"));
        Scene escena = new Scene(root);

        stage.setScene(escena);
        stage.show();

    }
}
