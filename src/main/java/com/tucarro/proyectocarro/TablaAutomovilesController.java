package com.tucarro.proyectocarro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.*;
import model.Enums.Disponibilidad;
import model.Enums.EsNuevo;
import model.Enums.TipoCombustible;
import model.Enums.TipoTrasmision;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class TablaAutomovilesController  implements Initializable {

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
    private TableColumn<AbsAutomovil, Integer> colCaballos;
    @FXML
    private TableColumn<AbsAutomovil, Double> colTiempo;

    @FXML
    private TableColumn<AbsAutomovil, Integer> colCambios;

    @FXML
    private TableColumn<AbsAutomovil, Integer> colCilindraje;

    @FXML
    private TableColumn<AbsAutomovil, String> colCombustible;

    @FXML
    private TableColumn<AbsAutomovil, String> colDisponibilidad;

    @FXML
    private TableColumn<AbsAutomovil, String> colEstado;

    @FXML
    private TableColumn<AbsAutomovil, String> colMarca;

    @FXML
    private TableColumn<AbsAutomovil, String> colModelo;

    @FXML
    private TableColumn<AbsAutomovil,String> colPlaca;

    @FXML
    private TableColumn<AbsAutomovil, String> colTrasmicion;

    @FXML
    private TableColumn<AbsAutomovil, Integer> colVelocidadMax;

    @FXML
    private TableColumn<AbsAutomovil, Integer> colBolsasAire;

    @FXML
    private TableColumn<AbsAutomovil, Integer> colPasajeros;
    @FXML
    private TableColumn<AbsAutomovil, Integer> colPuertas;

    @FXML
    private ImageView imgFotos;

    @FXML
    private Label motoError;

    @FXML
    private TableView<AbsAutomovil> tblDeportivos;

    @FXML
    private TextField txtBolsasAire;

    @FXML
    private TextField txtCambios;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TextField txtImagen1;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtPasajeros;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtPuertas;

    @FXML
    private TextField txtVelocidad;

    @FXML
    private TextField txtCaballos;

    @FXML
    private TextField txtTiempo;



    private static String marca , modelo , placa , combustibleString , trasmisionString ,nuevoString,disponibilidadString;
    private static String[]  urlImg =new String[5];
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
        String marca = txtMarca.getText();
        String modelo=txtModelo.getText();
        String placa=txtPlaca.getText();
        //urlImg= txtImagen1[0].getText();
        //String u=txtImagen1.getText();
        //String url = "/com.tuCarro.Img"+u;
        //Image myImage = new Image(getClass().getResourceAsStream(url));

        int velocidadMax=Integer.parseInt(txtVelocidad.getText());
        int cambios=Integer.parseInt(txtCambios.getText());
        int cilindraje=Integer.parseInt(txtCilindraje.getText());
        if(marca.isEmpty()&& modelo.isEmpty()&&placa.isEmpty()){

        } else  {
            DataBase.deportivos.add(new Deportivo(marca,modelo,placa,cambios,velocidadMax,cilindraje,Integer.parseInt(txtPasajeros.getText()),
                    Integer.parseInt(txtPuertas.getText()) , Integer.parseInt(txtBolsasAire.getText()),Integer.parseInt(txtCaballos.getText()),Double.parseDouble(txtTiempo.getText()),urlImg,auxCombustible,auxTipoTrasmision,auxEsNuevo,auxDisponibilidad));
        }





    }

    @FXML
    void CambiarFoto(ActionEvent event) {

    }

    @FXML
    void Editar(ActionEvent event) {
        Deportivo d =(Deportivo) this.tblDeportivos.getSelectionModel().getSelectedItem();
        if(d==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar un empleado");
            alert.showAndWait();
        }else {
            d.setMarca(txtMarca.getText());
            d.setModelo(txtModelo.getText());
            d.setCambios(Integer.parseInt(txtCambios.getText()));
            d.setNumPlaca(txtPlaca.getText());
            d.setCilindraje(Integer.parseInt(txtCilindraje.getText()));
            //m.setFotos(txtImagen1[0].getText());
            d.setTipoCombustible(auxCombustible);
            d.setTipoTrasmision(auxTipoTrasmision);
            d.setEsNuevo(auxEsNuevo);
            d.setDisponibilidad(auxDisponibilidad);
            d.setCaballosDeFuerza(Integer.parseInt(txtCaballos.getText()));
            d.setTiempo100kl(Double.parseDouble(txtTiempo.getText()));
            d.setNumBolasAire(Integer.parseInt(txtBolsasAire.getText()));
            d.setNumeroPuertas(Integer.parseInt(txtPuertas.getText()));
            d.setNumerosPasajeros(Integer.parseInt(txtPasajeros.getText()));
            this.tblDeportivos.refresh();

        }

    }

    @FXML
    void Eliminar(ActionEvent event) {
        Deportivo d =(Deportivo) this.tblDeportivos.getSelectionModel().getSelectedItem();
        if(d==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar un empleado");
            alert.showAndWait();
        }else {
            DataBase.deportivos.remove(d);
            this.tblDeportivos.refresh();
        }


    }

    @FXML
    void seleccionar(MouseEvent event) {
        Deportivo d =(Deportivo) this.tblDeportivos.getSelectionModel().getSelectedItem();
        if(d!=null){
            this.txtMarca.setText(d.getMarca());
            this.txtModelo.setText(d.getModelo());
            this.txtCambios.setText(String.valueOf(d.getCambios()));
            this.txtPlaca.setText(d.getNumPlaca());
            this.txtCilindraje.setText(String.valueOf(d.getCilindraje()));
            this.txtVelocidad.setText(String.valueOf(d.getVelocidadMaxima()));
            this.txtImagen1.setText(Arrays.toString(d.getFotos()));
            this.txtPasajeros.setText(String.valueOf(d.getNumerosPasajeros()));
            this.txtBolsasAire.setText(String.valueOf(d.getNumBolasAire()));
            this.txtCaballos.setText(String.valueOf(d.getCaballosDeFuerza()));
            this.txtTiempo.setText(String.valueOf(d.getTiempo100kl()));
            this.txtPuertas.setText(String.valueOf(d.getNumeroPuertas()));
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

        colPuertas.setCellValueFactory(new PropertyValueFactory<>("numeroPuertas"));
        colPasajeros.setCellValueFactory(new PropertyValueFactory<>("numerosPasajeros"));
        colBolsasAire.setCellValueFactory(new PropertyValueFactory<>("numBolasAire"));
        colCaballos.setCellValueFactory(new PropertyValueFactory<>("caballosDeFuerza"));
        colTiempo.setCellValueFactory(new PropertyValueFactory<>("tiempo100kl"));


        //Crear lista de Motos
        ArrayList<Deportivo> listaDeportivos = DataBase.deportivos;

        //Convertir la lista a un ObservableList
        ObservableList<AbsAutomovil> datosDeportivos = FXCollections.observableArrayList(listaDeportivos);

        //Asignar los datos a la tabla
        tblDeportivos.setItems(datosDeportivos);

        cbEstado.getItems().addAll(nuevo);
        cbCombustible.getItems().addAll(combustible);
        cbDisponibilidad.getItems().addAll(disponibilidad);
        cbTrasmicion.getItems().addAll(trasmision);

        cbEstado.setOnAction(this::getEsNuevo);
        cbCombustible.setOnAction(this::getCombustible);
        cbDisponibilidad.setOnAction(this::getDisponibilidad);
        cbTrasmicion.setOnAction(this::getTrasmision);




    }
}
