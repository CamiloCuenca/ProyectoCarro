package com.tucarro.proyectocarro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.AbsVehiculoCarga;
import model.Bus;
import model.Enums.*;
import model.Vehiculo;

public class tablaCamionesController {
    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnCambiar;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnEliminar;

    @FXML
    private ChoiceBox<String> cbABS;

    @FXML
    private ChoiceBox<String> cbAireAcondicionado;

    @FXML
    private ChoiceBox<String> cbCamaraReversa;

    @FXML
    private ChoiceBox<String> cbCombustible;

    @FXML
    private ChoiceBox<String> cbDisponibilidad;

    @FXML
    private ChoiceBox<String> cbEstado;

    @FXML
    private ChoiceBox<String> cbTrasmicion;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colABS;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colAireAcon;

    @FXML
    private TableColumn<AbsVehiculoCarga, Integer> colBolsaAire;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colCamaraReversa;

    @FXML
    private TableColumn<AbsVehiculoCarga, Integer> colCambios;

    @FXML
    private TableColumn<AbsVehiculoCarga, Integer> colCilindraje;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colCombustible;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colDisponibilidad;

    @FXML
    private TableColumn<AbsVehiculoCarga, Integer> colEjes;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colEstado;

    @FXML
    private TableColumn<AbsVehiculoCarga, Integer> colMaletero;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colMarca;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colModelo;

    @FXML
    private TableColumn<AbsVehiculoCarga, Integer> colPasajeros;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colPlaca;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colPuertas;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colSalidas;

    @FXML
    private TableColumn<AbsVehiculoCarga, String> colTrasmicion;

    @FXML
    private TableColumn<AbsVehiculoCarga, Integer> colVelocidadMax;

    @FXML
    private ImageView imgFotos;

    @FXML
    private Label motoError;

    @FXML
    private TableView<?> tblMotos;

    @FXML
    private TextField txtBolsasAire;

    @FXML
    private TextField txtCambios;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TextField txtEjes;

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
    private TextField txtSalidasEmergencia;

    @FXML
    private TextField txtVelocidad;

    private static String marca , modelo , placa , combustibleString , trasmisionString ,nuevoString,disponibilidadString , aireAcondicionado , camaraReversa  , abs;
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
    private TieneABS auxTieneABS;







    @FXML
    void Agregar(ActionEvent event) {

    }

    @FXML
    void CambiarFoto(ActionEvent event) {

    }

    @FXML
    void Editar(ActionEvent event) {

    }

    @FXML
    void Eliminar(ActionEvent event) {

    }

    @FXML
    void seleccionar(MouseEvent event) {

    }
}
