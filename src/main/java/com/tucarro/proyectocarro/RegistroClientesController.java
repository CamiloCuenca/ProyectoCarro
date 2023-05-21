package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Cliente;
import model.RegistroEmpleados;
import com.tucarro.proyectocarro.InicioController.*;
import java.io.IOException;
import java.util.ArrayList;


public class RegistroClientesController {

    @FXML
    private Button btnaceptar;

    @FXML
    private PasswordField pwrContraseña;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtNombre;



    public void AceptarButtonOnAction(ActionEvent event){
          Cliente clientex = new Cliente(txtNombre.getText(),txtApellido.getText(),txtCedula.getText(),txtCorreo.getText(),pwrContraseña.getText());
          //Cliente clientePrueba = new Cliente("Carlos","Perez","100","correo","12345");
          //RegistroEmpleados.clientes.add(clientePrueba);
          RegistroEmpleados.clientes.add(clientex);

        // en esta linea , esconde el stage del Registro
        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
    }



}
