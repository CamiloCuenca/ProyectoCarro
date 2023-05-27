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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VentanaEmpleadoController implements Initializable {
    @FXML
    private ImageView imaCarro;
    @FXML
    public Button btnCliente;
    //Atributos
    @FXML
    private Button btnClientes;
    @FXML
    private BorderPane borderPane;
    @FXML
    private Button btnRegresar;
    @FXML
    private Button btnVehiculos;


    /**
     * Este metodo se encarga de mostrar el panel donde se encuentra la tabla de los clientes.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void Cliente(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("clientes.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        borderPane.setCenter(pane);
    }

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
    void Vehiculos(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("tablasVehiculos.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();
        borderPane.setCenter(pane);
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
