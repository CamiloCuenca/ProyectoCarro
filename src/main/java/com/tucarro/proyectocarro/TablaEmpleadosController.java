package com.tucarro.proyectocarro;

import model.Enums.tipoEstado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import model.DataBase;
import model.Persona;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TablaEmpleadosController implements Initializable {

    //Atributos
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtId;
    @FXML
    private TextField TxtCorreo;
    @FXML
    private ChoiceBox<String> cbEstado;

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
    @FXML
    private Label labError;
    @FXML
    private TextField txtContrasena;


    private static String nombre;
    private static String apellido;
    private static String cedula;
    private static String correo;
    private static String contrasena;
    private static String ID;


    // Inizializo un ArrayList de empleados que va a ser metodo de quemar valores
    // de un empleado el cual esta en el DataBase , para que haci el metodo funciones y estos valores queden quemados
    //en el codigo
    //public static ArrayList<Empleado> listaEmpleados= new DataBase().setValoresQuemadosEmpleado();

    /**
     * Este método es el encargado de la accion de el boton "Agregar" el cual nos abre una nueva
     * ventana la cual es para registrar un nuevo Empleado.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void Agregar(ActionEvent event) throws IOException {
        // Stage stage = new Stage();
        // Parent root = FXMLLoader.load(getClass().getResource("RegistroEmpleados.fxml"));
        //Scene escena = new Scene(root);
        //stage.setScene(escena);
        //stage.show();

        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        cedula = txtCedula.getText();
        correo = TxtCorreo.getText();
        contrasena = txtContrasena.getText();
        ID = txtId.getText();
        if (nombre.isEmpty() && apellido.isEmpty() && cedula.isEmpty() && correo.isEmpty() && contrasena.isEmpty() && ID.isEmpty()) {
            labError.setText("llene todos los espacios");
        } else if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || ID.isEmpty()) {
            labError.setText("Algunos campos no estan llenos");
        } else {
            Empleado empleadox = new Empleado(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), TxtCorreo.getText(), txtContrasena.getText(), txtId.getText(), aux);
            DataBase.empleados.add(empleadox);

        }


    }


    private String estado[] = {"ACTIVO", "BLOQUEADO"};
    private String estadoEmpleado;

    private tipoEstado aux;


    public void getEstado(ActionEvent event) {
        estadoEmpleado = cbEstado.getValue();
        if (estadoEmpleado.equals("ACTIVO")) {
            aux = tipoEstado.ACTIVO;
        } else if (estadoEmpleado.equals("BLOQUEADO")) {
            aux = tipoEstado.BLOQUEADO;
        }


    }


    /**
     * Este metodo nos permite editar los atributos de un empleado
     *
     * @param event
     */
    @FXML
    void Editar(ActionEvent event) {

        //Persona p = this.tblEmpleados.getSelectionModel().getSelectedItem();
        Empleado a = (Empleado) this.tblEmpleados.getSelectionModel().getSelectedItem();
        if (a == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar un empleado");
            alert.showAndWait();
        } else {

            a.setNombre(txtNombre.getText());
            a.setApellido(txtApellido.getText());
            a.setCedula(txtCedula.getText());
            a.setCorreo(TxtCorreo.getText());
            a.setId(txtId.getText());
            a.setContraseña(txtContrasena.getText());
            a.setEstado(aux);
            this.tblEmpleados.refresh();

        }

    }

    /**
     * Este método nos permite eliminar un Empleado,
     *
     * @param event
     */
    @FXML
    void Eliminar(ActionEvent event) {
        Empleado a = (Empleado) this.tblEmpleados.getSelectionModel().getSelectedItem();
        if (a == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar un empleado");
            alert.showAndWait();
        } else {
            DataBase.empleados.remove(a);
            this.tblEmpleados.refresh();
        }


    }

    @FXML
    void seleccionar(MouseEvent event) {
        //Persona p = this.tblEmpleados.getSelectionModel().getSelectedItem();
        Empleado a = (Empleado) this.tblEmpleados.getSelectionModel().getSelectedItem();

        if (a != null) {
            this.txtNombre.setText(a.getNombre());
            this.txtApellido.setText(a.getApellido());
            this.txtCedula.setText(a.getCedula());
            this.TxtCorreo.setText(a.getCorreo());
            this.txtId.setText(a.getId());
            this.txtContrasena.setText(a.getContraseña());
            this.cbEstado.setValue(String.valueOf(aux));
            //this.cbEstado.setValue(a.);

        }

    }


    /**
     * Este método inizializa los atributos de la tabla de empleados
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


        cbEstado.getItems().addAll(estado);
        cbEstado.setOnAction(this::getEstado);

    }


}
