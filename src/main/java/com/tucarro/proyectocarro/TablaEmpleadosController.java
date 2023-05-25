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
import model.DataBase;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TablaEmpleadosController implements Initializable {

    //Atributos

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

    // Inizializo un ArrayList de empleados que va a ser metodo de quemar valores
    // de un empleado el cual esta en el DataBase , para que haci el metodo funciones y estos valores queden quemados
    //en el codigo
    //public static ArrayList<Empleado> listaEmpleados= new DataBase().setValoresQuemadosEmpleado();

    /** Este método es el encargado de la accion de el boton "Agregar" el cual nos abre una nueva
     * ventana la cual es para registrar un nuevo Empleado.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void Agregar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("RegistroEmpleados.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();

    }

    /** Este metodo nos permite editar los atributos de un empleado
     *
     * @param event
     */
    @FXML
    void Editar(ActionEvent event) {

    }

    /**Este método nos permite eliminar un Empleado,
     *
     * @param event
     */
    @FXML
    void Eliminar(ActionEvent event) {

    }

    /** Este método inizializa los atributos de la tabla de empleados
     * tomandolos de un ArrayList de Empleados  que se Encuentra en el DataBase.
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Configurar las columnas
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colCedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));

        // Crear lista de Empleados
        ArrayList<Empleado> listaEmpleados = DataBase.empleados;

        // Convertir la lista a un ObservableList
        ObservableList<Persona> datosEmpleados = FXCollections.observableArrayList(listaEmpleados);

        // Asignar los datos a la tabla
        tblEmpleados.setItems(datosEmpleados);

    }
}
