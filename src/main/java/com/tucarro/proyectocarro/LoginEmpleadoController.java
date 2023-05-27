package com.tucarro.proyectocarro;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.DataBase;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LoginEmpleadoController implements Initializable {

    //Atributos
    private static String nombre;
    private static String contrasena;
    private static String ID;
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
    private Label loginerror;

    @FXML
    private ImageView imaCarro;
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
        ((Node) (event.getSource())).getScene().getWindow().hide();

    }
    @FXML
    void Aceptar(ActionEvent event) throws IOException {
        nombre = txtNombre.getText();
        contrasena = pswContrasena.getText();
        ID = txtID.getText();
        if(nombre.isEmpty()&&contrasena.isEmpty()&&ID.isEmpty()){
            loginerror.setText("LLene todos los campos");
        } else if (nombre.isEmpty() || contrasena.isEmpty()) {
            loginerror.setText("algunos campos no estan llenos");

        }

        for(int i = 0; i< DataBase.empleados.size(); i++){



            if(DataBase.empleados.get(i).getNombre().equals(nombre) && DataBase.empleados.get(i).getContraseña().equals(contrasena) && DataBase.empleados.get(i).getId().equals(ID)){
                loginerror.setText("Se inicio Secion correctamente");
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("VentanaEmpleado.fxml"));
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(imaCarro);
        rotate.setDuration(Duration.millis(1700));
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.Y_AXIS);
        rotate.play();

    }
}
