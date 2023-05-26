package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    private Button btnRegresar;

    //private static ArrayList<Empleado> empleadoArrayList = new RegistroEmpleados().getEmpleados();
    @FXML
    void Empleado(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Empleados.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        borderPane.setCenter(pane);

    }

    public void Regresar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Inicio-view.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();
        // en esta linea , esconde el stage del login y carga el nuevo stage
        ((Node) (event.getSource())).getScene().getWindow().hide();


    }

    @FXML
    void Registro(ActionEvent event) throws IOException {


    }


}
