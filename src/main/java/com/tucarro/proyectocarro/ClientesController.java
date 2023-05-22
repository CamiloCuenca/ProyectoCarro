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
import model.Cliente;
import model.Persona;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientesController implements Initializable {

    @FXML
    private TableColumn<Cliente, String> colApellido;

    @FXML
    private TableColumn<Cliente, String> colCedulas;

    @FXML
    private TableColumn<Cliente, String> colCorreos;

    @FXML
    private TableColumn<Cliente, String> colNombres;

    @FXML
    private TableView<Persona> tblClientes;
    @FXML
    private Button btnAgregar;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {







    }

    @FXML
    void agregar(ActionEvent event) {




    }
}
