package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ventanaPrincipalController {
    @FXML
    private Button Regresar;


    @FXML
    void Regresar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Inicio-view.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();
        // en esta linea , esconde el stage del login y carga el nuevo stage
        ((Node) (event.getSource())).getScene().getWindow().hide();


    }


}










