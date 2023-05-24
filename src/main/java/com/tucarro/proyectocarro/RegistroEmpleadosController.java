package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.RegistroEmpleados;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistroEmpleadosController implements Initializable {

    @FXML
    private TextField TxtId;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtContrasena;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtEstado;

    @FXML
    private TextField txtNombre;
    @FXML
    private ChoiceBox<String> cbEstado;

    @FXML
    void Regresar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("VentanaAdministrador.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();
        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
    }

    @FXML
    void AgregarAction(ActionEvent event) {
        Empleado empleadox = new Empleado(txtNombre.getText(),txtApellido.getText(),txtCedula.getText(),txtCorreo.getText(),txtContrasena.getText(),TxtId.getAnchor(),aux);
        RegistroEmpleados.empleados.add(empleadox);

        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();

    }

    private  String estado[] ={"SI","NO"};
    private String estadoEmpleado;

    private tipoEstado aux ;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbEstado.getItems().addAll(estado);
        cbEstado.setOnAction(this::getEstado);
    }
    public void getEstado(ActionEvent event){
        estadoEmpleado = cbEstado.getValue();
        if(estadoEmpleado.equals("SI")){
            aux= tipoEstado.SI;
        } else if (estadoEmpleado.equals("NO")) {
            aux=  tipoEstado.NO;
        }


    }

    public tipoEstado validar(){
        if(estadoEmpleado.equals("SI")){
            return tipoEstado.SI;
        } else if (estadoEmpleado.equals("NO")) {
            return  tipoEstado.NO;
        }
        return tipoEstado.SI;

    }
}

