package com.tucarro.proyectocarro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.DataBase;
import model.Persona;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TablaClientesController implements Initializable {

    @FXML
    private TableColumn<Persona, String> colNombres;
    @FXML
    private TableColumn<Persona, String> colApellido;
    @FXML
    private TableColumn<Persona, String> colCedulas;

    @FXML
    private TableColumn<Persona, String> colCorreos;
    @FXML
    private TableView<Persona> tblClientes;
    @FXML
    private Label labError;

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtCedula;
    @FXML
    private TextField TxtCorreo;
    @FXML
    private  TextField pswContrasena;
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnEliminar;

    private static String nombre;
    private static String apellido;
    private static String cedula;
    private static String correo;

    private static  String contrasena;


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
    void Agregar(ActionEvent event) {

        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        cedula = txtCedula.getText();
        correo = TxtCorreo.getText();
        contrasena = pswContrasena.getText();
        if (nombre.isEmpty() && apellido.isEmpty() && cedula.isEmpty() && correo.isEmpty() && contrasena.isEmpty()) {
            labError.setText("LLene todos los campos");
        } else if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
            labError.setText("Algunos campos no estan llenos");
        } else {
            DataBase.clientes.add(new Cliente(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), TxtCorreo.getText(), pswContrasena.getText()));

        }

    }


    @FXML
    void Editar(ActionEvent event) {
        Cliente a = (Cliente) this.tblClientes.getSelectionModel().getSelectedItem();
        if(a == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar un empleado");
            alert.showAndWait();
        }else{

            a.setNombre(txtNombre.getText());
            a.setApellido(txtApellido.getText());
            a.setCedula(txtCedula.getText());
            a.setCorreo(TxtCorreo.getText());
            a.setContraseña(pswContrasena.getText());
            this.tblClientes.refresh();

        }

    }

    @FXML
    void Eliminar(ActionEvent event) {

        Cliente a = (Cliente) this.tblClientes.getSelectionModel().getSelectedItem();
        if(a == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar un empleado");
            alert.showAndWait();
        }else{
            DataBase.clientes.remove(a);
            this.tblClientes.refresh();
        }


    }

    @FXML
    void Seleccionar(MouseEvent event) {

        Cliente a = (Cliente) this.tblClientes.getSelectionModel().getSelectedItem();

        if(a != null){
            this.txtNombre.setText(a.getNombre());
            this.txtApellido.setText(a.getApellido());
            this.txtCedula.setText(a.getCedula());
            this.TxtCorreo.setText(a.getCorreo());
            this.pswContrasena.setText(a.getContraseña());

        }

    }


}
