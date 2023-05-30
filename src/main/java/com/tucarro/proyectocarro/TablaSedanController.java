package com.tucarro.proyectocarro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.AbsAutomovil;
import model.DataBase;
import model.Enums.*;
import model.Sedan;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class TablaSedanController implements Initializable {

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnCambiar;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnEliminar;

    @FXML
    private ChoiceBox<String> cbAbs;

    @FXML
    private ChoiceBox<String> cbAire;

    @FXML
    private ChoiceBox<String> cbAsistente;

    @FXML
    private ChoiceBox<String> cbCombustible;

    @FXML
    private ChoiceBox<String> cbDisponibilidad;

    @FXML
    private ChoiceBox<String> cbEstado;

    @FXML
    private ChoiceBox<String> cbReversa;

    @FXML
    private ChoiceBox<String> cbSColision;

    @FXML
    private ChoiceBox<String> cbSCruzado;

    @FXML
    private ChoiceBox<String> cbTrasmicion;

    @FXML
    private ChoiceBox<String> cbVVruzero;

    @FXML
    private TableColumn<AbsAutomovil, String> colAbs;

    @FXML
    private TableColumn<AbsAutomovil, String> colAireAcondicionado;

    @FXML
    private TableColumn<AbsAutomovil, String> colAsistenteCarril;

    @FXML
    private TableColumn<AbsAutomovil, Integer> colBolsasAire;

    @FXML
    private TableColumn<AbsAutomovil, String> colCamaraReversa;

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
    private TableColumn<AbsAutomovil, String> colMaletero;

    @FXML
    private TableColumn<AbsAutomovil, String> colMarca;

    @FXML
    private TableColumn<AbsAutomovil, String> colModelo;

    @FXML
    private TableColumn<AbsAutomovil, Integer> colPasajeros;

    @FXML
    private TableColumn<AbsAutomovil, String> colPlaca;

    @FXML
    private TableColumn<AbsAutomovil, Integer> colPuertas;

    @FXML
    private TableColumn<AbsAutomovil, String> colSensorColision;

    @FXML
    private TableColumn<AbsAutomovil, String> colSensorCruzado;

    @FXML
    private TableColumn<AbsAutomovil, String> colTrasmicion;

    @FXML
    private TableColumn<AbsAutomovil, String> colVCruzero;

    @FXML
    private TableColumn<AbsAutomovil, Integer> colVelocidadMax;

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
    private TextField txtMaletero;

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
    private static String marca , modelo , placa , combustibleString , trasmisionString ,nuevoString,disponibilidadString , aireAcondicionado , camaraReversa , velocidadCruzero , sensorColision , sensorCruzado , asistente , abs;
    private static String[]  urlImg =new String[5];
    private  static int  velocidadMax,cambios , cilindraje;


    private String[] combustible={ "GASOLINA", "DISEL", "ELECTRICO", "HIBRIDO"};
    private String[] trasmision = { "AUTOMATICO", "MANUAL"};
    private String[] nuevo = {"SI", "NO"};
    private String[] tiene={"SI","NO"};

    private String [] disponibilidad = { "DISPONIBLE", "VENDIDO","RENTADO"};

    private Disponibilidad auxDisponibilidad;
    private EsNuevo auxEsNuevo;
    private TipoTrasmision auxTipoTrasmision;
    private TipoCombustible auxCombustible;
    private TieneAireAcondicionado auxTieneAireAcondicionado;
    private TieneCamaraReversa auxTieneCamaraReversa;
    private TieneVelocidadCrucero auxTieneVelocidadCrucero;
    private TieneSensorColision auxTieneSensorColision;
    private TIeneSensorCruzado auxTIeneSensorCruzado;
    private TieneAsistentePerCarril auxTieneAsistentePerCarril;
    private TieneABS auxTieneABS;

    public void getAireAcondicionado(ActionEvent event){
        aireAcondicionado= cbAire.getValue();
        if(aireAcondicionado.equals("SI")){
            auxTieneAireAcondicionado=TieneAireAcondicionado.SI;
        }else if(aireAcondicionado.equals("NO")){
            auxTieneAireAcondicionado=TieneAireAcondicionado.NO;
        }
    }

    public void getCamaraReversa(ActionEvent event){
        camaraReversa=cbReversa.getValue();
        if(camaraReversa.equals("SI")){
            auxTieneCamaraReversa=TieneCamaraReversa.SI;
        } else if (camaraReversa.equals("NO")) {
            auxTieneCamaraReversa=TieneCamaraReversa.NO;
        }
    }

    public void getVelocidadCruzero(ActionEvent event){
        velocidadCruzero=cbVVruzero.getValue();
        if(velocidadCruzero.equals("SI")){
            auxTieneVelocidadCrucero=TieneVelocidadCrucero.SI;
        } else if (velocidadCruzero.equals("NO")){
            auxTieneVelocidadCrucero=TieneVelocidadCrucero.NO;
        }
    }

    public void getSensorColision(ActionEvent event){
        sensorColision=cbSColision.getValue();
        if(sensorColision.equals("SI")){
            auxTieneSensorColision=TieneSensorColision.SI;
        } else if (sensorColision.equals("SI")) {

            auxTieneSensorColision=TieneSensorColision.NO;
        }
    }

    public void getSensorCruzado(ActionEvent event){
        sensorCruzado=cbSCruzado.getValue();
        if(sensorCruzado.equals("SI")){
            auxTIeneSensorCruzado=TIeneSensorCruzado.SI;
        } else if (sensorCruzado.equals("NO")) {
            auxTIeneSensorCruzado=TIeneSensorCruzado.NO;

        }
    }

    public void getAsistente(ActionEvent event){
        asistente=cbAsistente.getValue();
        if(asistente.equals("SI")){
            auxTieneAsistentePerCarril=TieneAsistentePerCarril.SI;
        } else if (asistente.equals("NO")) {
            auxTieneAsistentePerCarril=TieneAsistentePerCarril.NO;
        }
    }

    public void getABS(ActionEvent event){
         abs=cbAbs.getValue();
         if(abs.equals("SI")){
             auxTieneABS=TieneABS.SI;
         } else if (abs.equals("NO")) {
             auxTieneABS=TieneABS.NO;
         }
    }

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
            DataBase.sedans.add(new Sedan(marca,modelo,placa,cambios,velocidadMax,cilindraje,Integer.parseInt(txtPasajeros.getText()),
                    Integer.parseInt(txtPuertas.getText()) , Integer.parseInt(txtBolsasAire.getText()),urlImg,auxCombustible,auxTipoTrasmision,auxEsNuevo,auxDisponibilidad ,Integer.parseInt(txtMaletero.getText()), auxTieneAireAcondicionado,auxTieneCamaraReversa,auxTieneVelocidadCrucero,auxTieneSensorColision,auxTIeneSensorCruzado,auxTieneAsistentePerCarril,auxTieneABS));
        }

    }

    @FXML
    void CambiarFoto(ActionEvent event) {

    }

    @FXML
    void Editar(ActionEvent event) {
        Sedan d =(Sedan) this.tblDeportivos.getSelectionModel().getSelectedItem();
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
            d.setNumBolasAire(Integer.parseInt(txtBolsasAire.getText()));
            d.setNumeroPuertas(Integer.parseInt(txtPuertas.getText()));
            d.setNumerosPasajeros(Integer.parseInt(txtPasajeros.getText()));
            d.setTieneAireAcondicionado(auxTieneAireAcondicionado);
            d.setTieneCamaraReversa(auxTieneCamaraReversa);
            d.setTieneVelocidadCrucero(auxTieneVelocidadCrucero);
            d.setTieneSensorColision(auxTieneSensorColision);
            d.setTieneSensorCruzado(auxTIeneSensorCruzado);
            d.setTieneAsistentePerCarril(auxTieneAsistentePerCarril);
            d.setTieneABS(auxTieneABS);
            this.tblDeportivos.refresh();
        }
    }

    @FXML
    void Eliminar(ActionEvent event) {
        Sedan d =(Sedan) this.tblDeportivos.getSelectionModel().getSelectedItem();
        if(d==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar un empleado");
            alert.showAndWait();
        }else {
            DataBase.sedans.remove(d);
            this.tblDeportivos.refresh();
        }

    }

    @FXML
    void seleccionar(MouseEvent event) {
        Sedan d =(Sedan) this.tblDeportivos.getSelectionModel().getSelectedItem();
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
            this.txtPuertas.setText(String.valueOf(d.getNumeroPuertas()));
            this.cbEstado.setValue(String.valueOf(auxEsNuevo));
            this.cbTrasmicion.setValue(String.valueOf(auxTipoTrasmision));
            this.cbDisponibilidad.setValue(String.valueOf(auxDisponibilidad));
            this.cbCombustible.setValue(String.valueOf(auxCombustible));
            this.cbAire.setValue(String.valueOf(auxTieneAireAcondicionado));
            this.cbReversa.setValue(String.valueOf(auxTieneCamaraReversa));
            this.cbVVruzero.setValue(String.valueOf(auxTieneVelocidadCrucero));
            this.cbSColision.setValue(String.valueOf(auxTieneSensorColision));
            this.cbSCruzado.setValue(String.valueOf(auxTIeneSensorCruzado));
            this.cbAsistente.setValue(String.valueOf(auxTieneAsistentePerCarril));
            this.cbAbs.setValue(String.valueOf(auxTieneABS));
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
        colAireAcondicionado.setCellValueFactory(new PropertyValueFactory<>("tieneAireAcondicionado"));
        colCamaraReversa.setCellValueFactory( new PropertyValueFactory<>("tieneCamaraReversa"));
        colVCruzero.setCellValueFactory(new PropertyValueFactory<>("tieneVelocidadCrucero"));
        colSensorColision.setCellValueFactory(new PropertyValueFactory<>("tieneSensorColision"));
        colSensorCruzado.setCellValueFactory(new PropertyValueFactory<>("tieneSensorCruzado"));
        colAsistenteCarril.setCellValueFactory(new PropertyValueFactory<>("tieneAsistentePerCarril"));
        colAbs.setCellValueFactory(new PropertyValueFactory<>("tieneABS"));
        colMaletero.setCellValueFactory(new PropertyValueFactory<>("capMaletero"));

        //Crear lista de Motos
        ArrayList<Sedan> listaSedans = DataBase.sedans;

        //Convertir la lista a un ObservableList
        ObservableList<AbsAutomovil> datosSedan = FXCollections.observableArrayList(listaSedans);

        //Asignar los datos a la tabla
        tblDeportivos.setItems(datosSedan);



        cbEstado.getItems().addAll(nuevo);
        cbCombustible.getItems().addAll(combustible);
        cbDisponibilidad.getItems().addAll(disponibilidad);
        cbTrasmicion.getItems().addAll(trasmision);

        cbAire.getItems().addAll(tiene);
        cbReversa.getItems().addAll(tiene);
        cbVVruzero.getItems().addAll(tiene);
        cbSColision.getItems().addAll(tiene);
        cbSCruzado.getItems().addAll(tiene);
        cbAsistente.getItems().addAll(tiene);
        cbAbs.getItems().addAll(tiene);



        cbEstado.setOnAction(this::getEsNuevo);
        cbCombustible.setOnAction(this::getCombustible);
        cbDisponibilidad.setOnAction(this::getDisponibilidad);
        cbTrasmicion.setOnAction(this::getTrasmision);

        cbAire.setOnAction(this::getAireAcondicionado);
        cbReversa.setOnAction(this::getCamaraReversa);
        cbVVruzero.setOnAction(this::getVelocidadCruzero);
        cbSColision.setOnAction(this::getSensorColision);
        cbSCruzado.setOnAction(this::getSensorColision);
        cbAsistente.setOnAction(this::getAsistente);
        cbAbs.setOnAction(this::getABS);


    }
}
