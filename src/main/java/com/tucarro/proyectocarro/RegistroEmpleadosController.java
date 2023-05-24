package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import model.DataBase;

import java.net.URL;
import java.util.ResourceBundle;

public class RegistroEmpleadosController implements Initializable {

    //Atributos
    @FXML
    private TextField TxtId;
    @FXML
    private Button btnAgregar;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtCedula;
    @FXML
    private TextField txtContrasena;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtNombre;
    @FXML
    private ChoiceBox<String> cbEstado;

    /**Este método se encarga de la accion del boton "Agregar" el cual nos registra un nuevo empleado
     *
     *
     * @param event
     */
    @FXML
    void AgregarAction(ActionEvent event) {
        Empleado empleadox = new Empleado(txtNombre.getText(),txtApellido.getText(),txtCedula.getText(),txtCorreo.getText(),txtContrasena.getText(),TxtId.getAnchor(),aux);
        DataBase.empleados.add(empleadox);

        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();

    }

    private  String estado[] ={"ACTIVO","BLOQUEADO"};
    private String estadoEmpleado;

    private tipoEstado aux ;

    /**Este método inicializa el comboBox y su tipo de datos
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbEstado.getItems().addAll(estado);
        cbEstado.setOnAction(this::getEstado);
    }

    /**Este metodo se encarga de validar la entrada de los datos del comboBox
     * con los del enum tipoEstado.
     *
     * @param event
     */
    public void getEstado(ActionEvent event){
        estadoEmpleado = cbEstado.getValue();
        if(estadoEmpleado.equals("ACTIVO")){
            aux= tipoEstado.ACTIVO;
        } else if (estadoEmpleado.equals("BLOQUEADO")) {
            aux=  tipoEstado.BLOQUEADO;
        }
    }

}

