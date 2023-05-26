package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.DataBase;

public class RegistroClientesController {

    //Atributos
    @FXML
    private Button btnaceptar;

    @FXML
    private PasswordField pswContrasena;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtNombre;

    @FXML
    private Label LoginRerrir;

    private static String nombre;
    private static String apellido;
    private static String cedula;
    private static String correo;
    private static String contrasena;


    /**Este método se encarga de la accion "Aceptar" el cual nos permite registrar un nuevo cliente.
     *
     * @param event
     */
    public void AceptarButtonOnAction(ActionEvent event){
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        cedula = txtCedula.getText();
        correo = txtCorreo.getText();
        contrasena = pswContrasena.getText();
        if (nombre.isEmpty()&&apellido.isEmpty()&&cedula.isEmpty()&&correo.isEmpty()&&contrasena.isEmpty()){
            LoginRerrir.setText("LLene todos los campos");
        }else if (nombre.isEmpty()||apellido.isEmpty()||cedula.isEmpty()||correo.isEmpty()||contrasena.isEmpty()){
            LoginRerrir.setText("Algunos campos no estan llenos");
        }else{
            DataBase.clientes.add(new Cliente(txtNombre.getText(),txtApellido.getText(),txtCedula.getText(),txtCorreo.getText(),pswContrasena.getText()));
            ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
        }


         // Cliente clientex = new Cliente(txtNombre.getText(),txtApellido.getText(),txtCedula.getText(),txtCorreo.getText(),pwrContraseña.getText());


        // en esta linea , esconde el stage del Registr
    }



}
