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

public class VentanaEmpleadoController {
    @FXML
    public Button btnCliente;
    //Atributos
    @FXML
    private Button btnClientes;
    @FXML
    private BorderPane borderPane;
    @FXML
    private Button btnRegresar;



    /**Este metodo se encarga de mostrar el panel donde se encuentra la tabla de los clientes.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void Cliente(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("clientes.fxml"));
        AnchorPane pane = (AnchorPane) loader.load() ;
        borderPane.setCenter(pane);
    }

    @FXML
    void Regresar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Inicio-view.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();
        // en esta linea , esconde el stage del login y carga el nuevo stage
        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();

    }




}
