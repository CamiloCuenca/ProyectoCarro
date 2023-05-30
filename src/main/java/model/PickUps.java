package model;

import model.Enums.*;

public class PickUps extends AbsCamioneta {
    // Atributos
    private int capacidadadCaja;

    // Constructor
    public PickUps(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
                   int numerosPasajeros, int numeroPuertas, int numBolasAire, int capacidadadCaja, String[] fotos,
                   TipoCombustible tipoCombustible,
                   TipoTrasmision tipoTrasmision, EsNuevo esNuevo, Disponibilidad disponibilidad,
                   TieneAireAcondicionado tieneAireAcondicionado, TieneCamaraReversa tieneCamaraReversa, TieneABS tieneABS,
                   EsCuatroxCuatro esCuatroxCuatro) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, numerosPasajeros, numeroPuertas,
                numBolasAire,
                fotos, tipoCombustible, tipoTrasmision, esNuevo, disponibilidad, tieneAireAcondicionado,
                tieneCamaraReversa,
                tieneABS, esCuatroxCuatro);
        this.capacidadadCaja = capacidadadCaja;
    }

    // Metodo imprimir
    @Override
    public String toString() {
        String v = "Camioneta Sav" + ", \nMarca: " + getMarca() + ", \nModelo: " + getModelo() + ", \nNumero Placa: "
                + getNumPlaca() + ", \nCambios: " + getCambios() + ", \nVelodidadMaxima: " + getVelocidadMaxima()
                + ", \nCilindraje: " + getCilindraje() + ", \nNumeros de pasajeros: " + getNumerosPasajeros()
                + ", \nNuermo de puertas: " + getNumeroPuertas() + ", \nNumero de bolsas de aire: " + getNumBolasAire()
                + ", \nCapacidad Caja de Carga : " + capacidadadCaja
                + ", \nTipo Combustible: " + getTipoCombustible()
                + ", \nTipo Trasmisión: " + getTipoTrasmision() + "; \n Es nuevo: " + getEsNuevo()
                + ", \nDisponibilidad: " + getDisponibilidad() + ", \nCamara de reversa: " + getTieneCamaraReversa()
                + ", \nAire acondicionado: " + getTieneAireAcondicionado()
                + ", \nABS: " + getTieneABS() + ", \nCuatro x Cuatro: " + getEsCuatroxCuatro();
        return v;
    }

    // GETTERS Y SETTERS
    public int getCapacidadadCaja() {
        return capacidadadCaja;
    }

    public void setCapacidadadCaja(int capacidadadCaja) {
        this.capacidadadCaja = capacidadadCaja;
    }

}
