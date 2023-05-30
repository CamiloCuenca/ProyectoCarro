package model;

import model.Enums.*;

public class Sedan extends AbsAutomovil {
    private int capMaletero;

    TieneAireAcondicionado tieneAireAcondicionado;
    TieneCamaraReversa tieneCamaraReversa;

    TieneVelocidadCrucero tieneVelocidadCrucero;

    TieneSensorColision tieneSensorColision;


    TIeneSensorCruzado tieneSensorCruzado;

    TieneAsistentePerCarril tieneAsistentePerCarril;
    TieneABS tieneABS;

    public Sedan(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje, int numerosPasajeros, int numeroPuertas, int numBolasAire, String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo, Disponibilidad disponibilidad, int capMaletero, TieneAireAcondicionado tieneAireAcondicionado, TieneCamaraReversa tieneCamaraReversa, TieneVelocidadCrucero tieneVelocidadCrucero, TieneSensorColision tieneSensorColision, TIeneSensorCruzado tIeneSensorCruzado, TieneAsistentePerCarril tieneAsistentePerCarril, TieneABS tieneABS) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, numerosPasajeros, numeroPuertas, numBolasAire, fotos, tipoCombustible, tipoTrasmision, esNuevo, disponibilidad);
        this.capMaletero = capMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.tieneSensorColision = tieneSensorColision;
        this.tieneSensorCruzado = tIeneSensorCruzado;
        this.tieneAsistentePerCarril = tieneAsistentePerCarril;
        this.tieneABS = tieneABS;
    }

    public int getCapMaletero() {
        return capMaletero;
    }

    public void setCapMaletero(int capMaletero) {
        this.capMaletero = capMaletero;
    }

    public TieneAireAcondicionado getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(TieneAireAcondicionado tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public TieneCamaraReversa getTieneCamaraReversa() {
        return tieneCamaraReversa;
    }

    public void setTieneCamaraReversa(TieneCamaraReversa tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }

    public TieneVelocidadCrucero getTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }

    public void setTieneVelocidadCrucero(TieneVelocidadCrucero tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
    }

    public TieneSensorColision getTieneSensorColision() {
        return tieneSensorColision;
    }

    public void setTieneSensorColision(TieneSensorColision tieneSensorColision) {
        this.tieneSensorColision = tieneSensorColision;
    }

    public TIeneSensorCruzado getTieneSensorCruzado() {
        return tieneSensorCruzado;
    }

    public void setTieneSensorCruzado(TIeneSensorCruzado tieneSensorCruzado) {
        this.tieneSensorCruzado = tieneSensorCruzado;
    }

    public TieneAsistentePerCarril getTieneAsistentePerCarril() {
        return tieneAsistentePerCarril;
    }

    public void setTieneAsistentePerCarril(TieneAsistentePerCarril tieneAsistentePerCarril) {
        this.tieneAsistentePerCarril = tieneAsistentePerCarril;
    }

    public TieneABS getTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(TieneABS tieneABS) {
        this.tieneABS = tieneABS;
    }

    @Override
    public String toString() {
        String v = "Camioneta Sav" + ", \nMarca: " + getMarca() + ", \nModelo: " + getModelo() + ", \nNumero Placa: "
                + getNumPlaca() + ", \nCambios: " + getCambios() + ", \nVelodidadMaxima: " + getVelocidadMaxima()
                + ", \nCilindraje: " + getCilindraje() + ", \nNumeros de pasajeros: " + getNumerosPasajeros()
                + ", \nNuermo de puertas: " + getNumeroPuertas() + ", \nNumero de bolsas de aire: " + getNumBolasAire()
                + ", \nCapacidad maletero : " + capMaletero
                + ", \nTipo Combustible: " + getTipoCombustible()
                + ", \nTipo Trasmisión: " + getTipoTrasmision() + "; \n Es nuevo: " + getEsNuevo()
                + ", \nDisponibilidad: " + getDisponibilidad() + ", \nCamara de reversa: " + tieneCamaraReversa
                + ", \nAire acondicionado: " + tieneAireAcondicionado + ", \nVelocidad Crucero: "
                + tieneVelocidadCrucero
                + ", \nSensor de colisión: " + tieneSensorColision
                + ", \nSensor cruzado: " + tieneSensorCruzado + ",\nPermanencia de carril: " + tieneAsistentePerCarril
                + ", \nABS: " + tieneABS;
        return v;
    }
}
