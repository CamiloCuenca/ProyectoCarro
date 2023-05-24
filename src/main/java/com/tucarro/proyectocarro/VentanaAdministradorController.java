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

    //Atributos
    @FXML
    private BorderPane borderPane;
    @FXML
    private Button btnEmpleados;
    @FXML
    private Button btnRegistros;

    /**Este método me muestra el panel donde se encuentra la tabla de Empleados.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void Empleado(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Empleados.fxml"));
        AnchorPane pane = (AnchorPane) loader.load() ;
        borderPane.setCenter(pane);

    }

    /**Este método me muestra el panel donde se encuntra la tabla de los registros.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void Registro(ActionEvent event) throws IOException {


    }

}
