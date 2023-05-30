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
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.DataBase;
import model.Vehiculo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InicioController implements Initializable {

    //Atributos
    //public static ArrayList<Cliente> listaClientes= new DataBase().SetValoresQuemadosCliente();
    //public static ArrayList<Administrador> listaAdministradores= new DataBase().setValoresQuemadosAdministrador();

    public static String nombre;
    public static String contrasena;

    @FXML
    private Button btnAbrirVentana;
    @FXML
    public Button btnadmi;
    @FXML
    private Button btnEmpleado;
    @FXML
    private Button btnCancelar;
    @FXML
    private Label loginerror;
    @FXML
    private Button btnRegistrarse;
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
    @FXML
    private ImageView imaCarro;


    /**
     * Este método se encarga de la accion del boton "Aceptar" en el cual nos verifica si el cliente
     * ya se encuentra registrado en la DataBase
     *
     * @param event
     * @throws IOException
     */
    public void loginButtonOnAction(ActionEvent event) throws IOException {

        nombre = txtNombre.getText();
        contrasena = pswContasena.getText();
        if (nombre.isEmpty() && contrasena.isEmpty()) {
            loginerror.setText("LLene todos los campos");
        } else if (nombre.isEmpty() || contrasena.isEmpty()) {
            loginerror.setText("algunos campos no estan llenos");

        }

        for (int i = 0; i < DataBase.clientes.size(); i++) {
            if (DataBase.clientes.get(i).getNombre().equals(nombre) && DataBase.clientes.get(i).getContraseña().equals(contrasena)) {
                loginerror.setText("Se inicio Secion correctamente");
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
                Scene escena = new Scene(root);
                stage.setScene(escena);
                stage.show();
                // en esta linea , esconde el stage del login y carga el nuevo stage
                ((Node) (event.getSource())).getScene().getWindow().hide();
                break;
            } else {
                loginerror.setText("Error no se encuentra registrado");
            }

        }
    }

    /**
     * Este método se encarga de la accion del boton "cerrar" el cual cierra la aplicacion
     *
     * @param event
     */
    public void cancelButtonOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("salir");
        alert.setHeaderText("Estas a punto de desconectarte");
        alert.setContentText("Estas seguro de desconectarte?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("saliste correctamente");
            Stage stage = (Stage) btnCancelar.getScene().getWindow();
            stage.close();
        }
    }


    /**Este método se encarag de abrir una nueva ventana en donde podremos registrar un nuevo cliente
     *
     * @param event
     * @throws IOException
     */


    /**
     * Este metodo se encarga de la accion del boton "soy empleado" la cual nos abre una nueva ventana
     * donde podemos logiarnos como un empleado.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void loginEmpleado(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("loginEmpleado.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();
        // en esta linea , esconde el stage del login y carga el nuevo stage
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    public void Registrarse(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("RegistroClientes.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();
    }

    @FXML
    void admi(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("LoginAdministrador.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();
        // en esta linea , esconde el stage del login y carga el nuevo stage
        ((Node) (event.getSource())).getScene().getWindow().hide();

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

