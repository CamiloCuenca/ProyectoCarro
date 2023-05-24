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
import model.DataBase;

import java.io.IOException;
import java.util.ArrayList;

public class LoginEmpleadoController {

    //Atributos
    private String nombre;
    private String contrasena;
    private int ID;
    public static ArrayList<Empleado> listaEmpleados= new DataBase().setValoresQuemadosEmpleado();
    @FXML
    private Button btnAceptar;
    @FXML
    private Button btnRegresar;


    @FXML
    private PasswordField pswContrasena;
    @FXML
    private TextField txtID;
    @FXML
    private TextField txtNombre;
    @FXML
    private Label loginError;

    /** este método se encarga de la accion del boton "Aceptar" el cual se encarga de verificar
     * si el empleado si esta registrado , y avre una nueva ventana para las funciones que cumple el epmpleado.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void Regresar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Inicio-view.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();
        // en esta linea , esconde el stage del login y carga el nuevo stage
        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();

    }
    @FXML
    void Aceptar(ActionEvent event) throws IOException {
        nombre = txtNombre.getText();
        contrasena = pswContrasena.getText();
        ID = Integer.parseInt(txtID.getText());

        for(int i = 0; i< DataBase.empleados.size(); i++){

            if(nombre.isEmpty()&&contrasena.isEmpty()){
                loginError.setText("LLene todos los campos");
            } else if (nombre.isEmpty() || contrasena.isEmpty()) {
                loginError.setText("algunos campos no estan llenos");

            }

            else if(DataBase.empleados.get(i).getNombre().equals(nombre) && DataBase.empleados.get(i).getContraseña().equals(contrasena) && DataBase.empleados.get(i).getId()==ID){
                loginError.setText("Se inicio Secion correctamente");
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("VentanaEmpleado.fxml"));
                Scene escena = new Scene(root);
                stage.setScene(escena);
                stage.show();
                // en esta linea , esconde el stage del login y carga el nuevo stage
                ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
                break;
            }else{
                loginError.setText("Error no se encuentra registrado");
            }

        }
    }
}
