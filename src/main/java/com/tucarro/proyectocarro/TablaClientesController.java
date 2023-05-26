package com.tucarro.proyectocarro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.DataBase;
import model.Persona;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TablaClientesController implements Initializable {

    public Button btnAgregar;
    // Atributos
    @FXML
    private TableColumn<Persona, String> colApellido;

    @FXML
    private TableColumn<Persona, String> colCedulas;

    @FXML
    private TableColumn<Persona, String> colCorreos;

    @FXML
    private TableColumn<Persona, String> colNombres;

    @FXML
    private TableView<Persona> tblClientes;

    /**
     * Este método inizializa los atributos de la tabla de clientes
     * tomandolos de un ArrayList de Clientes que se Encuentra en el DataBase.
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Configurar las columnas
        colNombres.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colCedulas.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        colCorreos.setCellValueFactory(new PropertyValueFactory<>("correo"));

        // Crear lista de clientes
        ArrayList<Cliente> listaClientes = DataBase.clientes;


        // Convertir la lista a un ObservableList
        ObservableList<Persona> datosClientes = FXCollections.observableArrayList(listaClientes);

        // Asignar los datos a la tabla
        tblClientes.setItems(datosClientes);

    }

    /**
     * Este método es el encargado de la accion de el boton "Agregar" el cual nos abre una nueva
     * ventana la cual es para registrar un nuevo clientes.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void Agregar(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("RegistroClientes.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();

    }
}
