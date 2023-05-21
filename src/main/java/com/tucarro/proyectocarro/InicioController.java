package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Cliente;
import model.Empleado;
import model.RegistroEmpleados;



import java.io.IOException;
import java.util.ArrayList;

public class InicioController {

    public static ArrayList<Cliente> listaClientes= new RegistroEmpleados().buscarCliente();
    public static String nombre;
    public static String contrasena;
    @FXML
    private Button btnEmpleado;
    @FXML
    private Button btnCancelar;
    @FXML
    private Label loginerror;
    @FXML
    private Button btnAceptar;
    @FXML
    private Label lblNombre;
    @FXML
    private Label lblContrasena;
    @FXML
    private TextField txtNombre;
    @FXML
    private PasswordField pswContasena;


    public void loginButtonOnAction(ActionEvent event) throws IOException {

            nombre = txtNombre.getText();
            contrasena = pswContasena.getText();

            for(int i =0;i<RegistroEmpleados.clientes.size();i++){

                if(nombre.isEmpty()&&contrasena.isEmpty()){
                    loginerror.setText("LLene todos los campos");
                } else if (nombre.isEmpty() || contrasena.isEmpty()) {
                    loginerror.setText("algunos campos no estan llenos");

                }

                else if(RegistroEmpleados.clientes.get(i).getNombre().equals(nombre) && RegistroEmpleados.clientes.get(i).getContraseña().equals(contrasena)){
                    loginerror.setText("Se inicio Secion correctamente");
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
                    Scene escena = new Scene(root);
                    stage.setScene(escena);
                    stage.show();
                    // en esta linea , esconde el stage del login y carga el nuevo stage
                    ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
                    break;
                }else{
                    loginerror.setText("Error no se encuentra registrado");
                }


            }




    }

    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage= (Stage) btnCancelar.getScene().getWindow();
        stage.close();

    }


    public void registrarButtonOnCation(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("RegistroClientes.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();

    }

    @FXML
    void loginEmpleado(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("loginEmpleado.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();

        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
    }
}

