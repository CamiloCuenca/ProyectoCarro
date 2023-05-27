package com.tucarro.proyectocarro;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import model.DataBase;

import java.net.URL;
import java.util.ResourceBundle;

public class RegistroClientesController implements Initializable {

    @FXML
    private ImageView imaCarro;
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


    /**
     * Este método se encarga de la accion "Aceptar" el cual nos permite registrar un nuevo cliente.
     *
     * @param event
     */
    public void AceptarButtonOnAction(ActionEvent event) {
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        cedula = txtCedula.getText();
        correo = txtCorreo.getText();
        contrasena = pswContrasena.getText();
        if (nombre.isEmpty() && apellido.isEmpty() && cedula.isEmpty() && correo.isEmpty() && contrasena.isEmpty()) {
            LoginRerrir.setText("LLene todos los campos");
        } else if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
            LoginRerrir.setText("Algunos campos no estan llenos");
        } else {
            DataBase.clientes.add(new Cliente(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtCorreo.getText(), pswContrasena.getText()));
            ((Node) (event.getSource())).getScene().getWindow().hide();
        }


        // Cliente clientex = new Cliente(txtNombre.getText(),txtApellido.getText(),txtCedula.getText(),txtCorreo.getText(),pwrContraseña.getText());


        // en esta linea , esconde el stage del Registr
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
