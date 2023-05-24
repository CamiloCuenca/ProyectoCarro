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
import model.Persona;
import model.RegistroEmpleados;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class EmpleadosController implements Initializable {

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnEliminar;

    @FXML
    private TableColumn<Persona, String> colApellido;

    @FXML
    private TableColumn<Persona, String> colCedula;

    @FXML
    private TableColumn<Persona, String> colCorreo;

    @FXML
    private TableColumn<Persona, String> colEstado;

    @FXML
    private TableColumn<Empleado, Integer> colId;

    @FXML
    private TableColumn<Persona, String> colNombre;

    @FXML
    private TableView<Persona> tblEmpleados;

    public static ArrayList<Empleado> listaEmpleados= new RegistroEmpleados ().getEmpleados();

    @FXML
    void Agregar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("RegistroEmpleados.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();

    }

    @FXML
    void Editar(ActionEvent event) {

    }

    @FXML
    void Eliminar(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Configurar las columnas
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colCedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));

        // Crear lista de clientes
        ArrayList<Empleado> listaEmpleados = RegistroEmpleados.empleados;
        //listaEmpleados.add(new Empleado("Carlos","fuentes","1004556789","correop@gmai.com","12345",1234));

        // Convertir la lista a un ObservableList
        ObservableList<Persona> datosEmpleados = FXCollections.observableArrayList(listaEmpleados);

        // Asignar los datos a la tabla
        tblEmpleados.setItems(datosEmpleados);

    }
}
