package com.tucarro.proyectocarro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.*;
import model.Persona;
import model.RegistroEmpleados;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ClientesController implements Initializable {


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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Configurar las columnas
        colNombres.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colCedulas.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        colCorreos.setCellValueFactory(new PropertyValueFactory<>("correo"));

        // Crear lista de clientes
        ArrayList<Persona> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente("Juan", "Pérez", "123456789", "juan@example.com", "contraseña1"));
        listaClientes.add(new Cliente("María", "López", "987654321", "maria@example.com", "contraseña2"));

        // Convertir la lista a un ObservableList
        ObservableList<Persona> datosClientes = FXCollections.observableArrayList(listaClientes);

        // Asignar los datos a la tabla
        tblClientes.setItems(datosClientes);

    }

    @FXML
    void agregar(ActionEvent event) {




    }
}
