package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.DataBase;

public class RegistroClientesController {

    //Atributos
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


    /**Este método se encarga de la accion "Aceptar" el cual nos permite registrar un nuevo cliente.
     *
     * @param event
     */
    public void AceptarButtonOnAction(ActionEvent event){
          Cliente clientex = new Cliente(txtNombre.getText(),txtApellido.getText(),txtCedula.getText(),txtCorreo.getText(),pwrContraseña.getText());
          DataBase.clientes.add(clientex);

        // en esta linea , esconde el stage del Registro
        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
    }



}
