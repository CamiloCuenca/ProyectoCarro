package model;

import model.Enums.Disponibilidad;
import model.Enums.EsNuevo;
import model.Enums.TipoCombustible;
import model.Enums.TipoTrasmision;

public class Van extends AbsAutomovil {
    // Atributos
    private int capdMaletero;

    public enum TieneAireAcondicionado {
        SI, NO
    };

    TieneAireAcondicionado tieneAireAcondicionado;

    public enum TieneCamaraReversa {
        SI, NO
    };

    TieneCamaraReversa tieneCamaraReversa;

    public enum TieneABS {
        SI, NO
    };

    TieneABS tieneABS;

    // Constructor
    public Van(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
               int numerosPasajeros, int numeroPuertas, int numBolasAire, int capMaletero, String[] fotos,
               TipoCombustible tipoCombustible,
               TipoTrasmision tipoTrasmision, EsNuevo esNuevo, Disponibilidad disponibilidad,
               TieneAireAcondicionado tieneAireAcondicionado, TieneCamaraReversa tieneCamaraReversa, TieneABS tieneABS) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, numerosPasajeros, numeroPuertas,
                numBolasAire,
                fotos, tipoCombustible, tipoTrasmision, esNuevo, disponibilidad);
        this.capdMaletero = capMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneABS = tieneABS;

    }

    // Metodo imprimir
    @Override
    public String toString() {
        String v = "Sedan " + ", \nMarca: " + getMarca() + ", \nModelo: " + getModelo() + ", \nNumero Placa: "
                + getNumPlaca() + ", \nCambios: " + getCambios() + ", \nVelodidadMaxima: " + getVelocidadMaxima()
                + ", \nCilindraje: " + getCilindraje() + ", \nNumeros de pasajeros: " + getNumerosPasajeros()
                + ", \nNuermo de puertas: " + getNumeroPuertas() + ", \nNumero de bolsas de aire: " + getNumBolasAire()
                + ", \nCapacidad maletero : " + capdMaletero
                + ", \nTipo Combustible: " + getTipoCombustible()
                + ", \nTipo Trasmisión: " + getTipoTrasmision() + "; \n Es nuevo: " + getEsNuevo()
                + ", \nDisponibilidad: " + getDisponibilidad() + ", \nCamara de reversa: " + tieneCamaraReversa
                + ", \nAire acondicionado: " + tieneAireAcondicionado + ", \nVelocidad Crucero: "
                + ", \nABS: " + tieneABS;
        return v;
    }

    // GETTERS Y SETTERS
    public int getCapdMaletero() {
        return capdMaletero;
    }

    public void setCapdMaletero(int capdMaletero) {
        this.capdMaletero = capdMaletero;
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

    public TieneABS getTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(TieneABS tieneABS) {
        this.tieneABS = tieneABS;
    }

}