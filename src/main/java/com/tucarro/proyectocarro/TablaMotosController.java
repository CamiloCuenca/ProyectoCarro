package com.tucarro.proyectocarro;

import model.Enums.Disponibilidad;
import model.Enums.EsNuevo;
import model.Enums.TipoCombustible;
import model.Enums.TipoTrasmision;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.DataBase;
import model.Moto;
import model.Vehiculo;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class TablaMotosController  implements Initializable {

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnCambiar;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnEliminar;

    @FXML
    private ChoiceBox<String> cbCombustible;

    @FXML
    private ChoiceBox<String> cbDisponibilidad;

    @FXML
    private ChoiceBox<String> cbEstado;

    @FXML
    private ChoiceBox<String> cbTrasmicion;

    @FXML
    private TableColumn<Vehiculo, Integer> colCambios;

    @FXML
    private TableColumn<Vehiculo, Integer> colCilindraje;

    @FXML
    private TableColumn<?, ?> colCombustible; // crear el enum tipoCombustible como una clase aparte de enum

    @FXML
    private TableColumn<?, ?> colDisponibilidad;

    @FXML
    private TableColumn<?, ?> colEstado;

    @FXML
    private TableColumn<Vehiculo, String > colMarca;

    @FXML
    private TableColumn<Vehiculo, String> colModelo;

    @FXML
    private TableColumn<Vehiculo ,String > colPlaca;

    @FXML
    private TableColumn<?, ?> colTrasmicion; //

    @FXML
    private TableColumn<Vehiculo, Integer> colVelocidadMax;

    @FXML
    private ImageView imgFotos;

    @FXML
    private TableView<Vehiculo> tblMotos;

    @FXML
    private TextField txtCambios;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtVelocidad;
    @FXML
    private TextField txtImagen1;
    @FXML
    private Label motoError;

    private static String marca , modelo , placa , combustibleString , trasmisionString ,nuevoString,disponibilidadString;
    private static String[]  urlImg;
    private  static int  velocidadMax,cambios , cilindraje;

    private String[] combustible={ "GASOLINA", "DISEL", "ELECTRICO", "HIBRIDO"};
    private String[] trasmision = { "AUTOMATICO", "MANUAL"};
    private String[] nuevo = {"SI", "NO"};
    private String [] disponibilidad = { "DISPONIBLE", "VENDIDO","RENTADO"};

    private Disponibilidad auxDisponibilidad;
    private EsNuevo auxEsNuevo;
    private TipoTrasmision auxTipoTrasmision;
    private TipoCombustible auxCombustible;


    public void getDisponibilidad(ActionEvent event) {
        disponibilidadString=cbDisponibilidad.getValue();
        if(disponibilidadString.equals("DISPONIBLE")){
            auxDisponibilidad = Disponibilidad.DISPONIBLE;
        } else if (disponibilidadString.equals("VENDIDO")) {
            auxDisponibilidad = Disponibilidad.VENDIDO;
        } else if (disponibilidadString.equals("RENTADO")) {
            auxDisponibilidad=Disponibilidad.RENTADO;
        }

    }

    public void getEsNuevo(ActionEvent event){
        nuevoString=cbEstado.getValue();
        if(nuevoString.equals("SI")){
            auxEsNuevo=EsNuevo.SI;
        } else if (nuevoString.equals("NO")) {
            auxEsNuevo=EsNuevo.NO;
        }
    }

    public void getTrasmision(ActionEvent event){
        trasmisionString=cbTrasmicion.getValue();
        if(trasmisionString.equals("AUTOMATICO")){
            auxTipoTrasmision=TipoTrasmision.AUTOMATICO;

        } else if (trasmisionString.equals("MANUAL")) {
            auxTipoTrasmision=TipoTrasmision.MANUAL;
        }

    }

    public void getCombustible(ActionEvent event){
        combustibleString=cbCombustible.getValue();
        if(combustibleString.equals("GASOLINA")){
            auxCombustible=TipoCombustible.GASOLINA;
        } else if (combustibleString.equals("DISEL")) {
            auxCombustible=TipoCombustible.DISEL;
        } else if (combustibleString.equals("ELECTRICO")) {
            auxCombustible=TipoCombustible.ELECTRICO;
        } else if (combustibleString.equals("HIBRIDO")) {
            auxCombustible=TipoCombustible.HIBRIDO;
        }

    }


    @FXML
    void Agregar(ActionEvent event) {

        marca = txtMarca.getText();
        modelo=txtModelo.getText();
        placa=txtPlaca.getText();
        //urlImg= txtImagen1[0].getText();
        velocidadMax=Integer.parseInt(txtVelocidad.getText());
        cambios=Integer.parseInt(txtCambios.getText());
        cilindraje=Integer.parseInt(txtCilindraje.getText());
        if(marca.isEmpty()&& modelo.isEmpty()&&placa.isEmpty()){

        } else  {
            DataBase.motos.add(new Moto(marca,modelo,placa,cambios,velocidadMax,cilindraje,urlImg,auxCombustible,auxTipoTrasmision,auxEsNuevo,auxDisponibilidad));
        }


    }

    @FXML
    void CambiarFoto(ActionEvent event) {

    }

    @FXML
    void Editar(ActionEvent event) {
        Moto m =(Moto) this.tblMotos.getSelectionModel().getSelectedItem();
        if(m==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar un empleado");
            alert.showAndWait();
        }else{
            m.setMarca(txtMarca.getText());
            m.setModelo(txtModelo.getText());
            m.setCambios(Integer.parseInt(txtCambios.getText()));
            m.setNumPlaca(txtPlaca.getText());
            m.setCilindraje(Integer.parseInt(txtCilindraje.getText()));
            //m.setFotos(txtImagen1[0].getText());
            m.setTipoCombustible(auxCombustible);
            m.setTipoTrasmision(auxTipoTrasmision);
            m.setEsNuevo(auxEsNuevo);
            m.setDisponibilidad(auxDisponibilidad);
        }
    }

    @FXML
    void Eliminar(ActionEvent event) {
        Moto m =(Moto) this.tblMotos.getSelectionModel().getSelectedItem();
        if(m==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar un empleado");
            alert.showAndWait();
        }else {
            DataBase.motos.remove(m);
            this.tblMotos.refresh();
        }

    }

    @FXML
    void seleccionar(MouseEvent event) {

        Moto m =(Moto) this.tblMotos.getSelectionModel().getSelectedItem();
        if(m!=null){
            this.txtMarca.setText(m.getMarca());
            this.txtModelo.setText(m.getModelo());
            this.txtCambios.setText(String.valueOf(m.getCambios()));
            this.txtPlaca.setText(m.getNumPlaca());
            this.txtCilindraje.setText(String.valueOf(m.getCilindraje()));
            this.txtVelocidad.setText(String.valueOf(m.getVelocidadMaxima()));
            this.txtImagen1.setText(Arrays.toString(m.getFotos()));
            this.cbEstado.setValue(String.valueOf(auxEsNuevo));
            this.cbTrasmicion.setValue(String.valueOf(auxTipoTrasmision));
            this.cbDisponibilidad.setValue(String.valueOf(auxDisponibilidad));
            this.cbCombustible.setValue(String.valueOf(auxCombustible));
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Configura las columnas
        colMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        colModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        colPlaca.setCellValueFactory(new PropertyValueFactory<>("numPlaca"));
        colCambios.setCellValueFactory(new PropertyValueFactory<>("cambios"));
        colVelocidadMax.setCellValueFactory(new PropertyValueFactory<>("velocidadMaxima"));
        colCilindraje.setCellValueFactory(new PropertyValueFactory<>("cilindraje"));

        colCombustible.setCellValueFactory(new PropertyValueFactory<>("tipoCombustible"));
        colTrasmicion.setCellValueFactory(new PropertyValueFactory<>("tipoTrasmision"));
        colEstado.setCellValueFactory(new PropertyValueFactory<>("esNuevo"));
        colDisponibilidad.setCellValueFactory(new PropertyValueFactory<>("disponibilidad"));


        //Crear lista de Motos
        ArrayList<Moto> listaMotos = DataBase.motos;

        //Convertir la lista a un ObservableList
        ObservableList<Vehiculo> datosMotos = FXCollections.observableArrayList(listaMotos);

        //Asignar los datos a la tabla
        tblMotos.setItems(datosMotos);

        cbEstado.getItems().addAll(nuevo);
        cbCombustible.getItems().addAll(combustible);
        cbDisponibilidad.getItems().addAll(disponibilidad);
        cbTrasmicion.getItems().addAll(trasmision);

    }
}

