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
import model.RegistroEmpleados;

import java.io.IOException;
import java.util.ArrayList;

public class InicioController {
    public static ArrayList<String> listanombres = new RegistroEmpleados().llenarUsusarios();
    public static ArrayList<String> listaContrasenas = new RegistroEmpleados().llenarCedulaususarios();
    public static String nombre;
    public static String contrasena;
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

        if(lblNombre.getText().equals("") || lblContrasena.getText().equals("")){
            loginerror.setText("Por favor llenar todos los campos requeridos");
        }else {
            nombre = txtNombre.getText();
            contrasena = pswContasena.getText();
            for(int i =0;i<listanombres.size();i++){

                if (listanombres.get(i).contains(nombre) && listaContrasenas.get(i).contains(contrasena)){
                    loginerror.setText("Se inicio Secion correctamente");
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
                    Scene escena = new Scene(root);
                    stage.setScene(escena);
                    stage.show();
                    // en esta linea , esconde el stage del login y carga el nuevo stage
                    ( (Node) (event.getSource() ) ).getScene().getWindow().hide();

                    break;
                }else {
                    loginerror.setText("error");
                }
            }
        }



    }

    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage= (Stage) btnCancelar.getScene().getWindow();
        stage.close();

    }
}

