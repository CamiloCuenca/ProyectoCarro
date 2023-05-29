package model;

import model.Enums.Disponibilidad;
import model.Enums.EsNuevo;
import model.Enums.TipoCombustible;
import model.Enums.TipoTrasmision;

public class Deportivo extends AbsAutomovil {
    // Atributos
    private int caballosDeFuerza;
    private double tiempo100kl;

    // Constructor
    public Deportivo(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
                     int numerosPasajeros, int numeroPuertas, int numBolasAire, int caballosDeFuerza, double tiempo100kl,
                     String[] fotos, TipoCombustible tipoCombustible,
                     TipoTrasmision tipoTrasmision, EsNuevo esNuevo, Disponibilidad disponibilidad) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, numerosPasajeros, numeroPuertas,
                numBolasAire,
                fotos, tipoCombustible, tipoTrasmision, esNuevo, disponibilidad);
        this.caballosDeFuerza = caballosDeFuerza;
        this.tiempo100kl = tiempo100kl;
    }

    // Metodo imprimir
    @Override
    public String toString() {
        String v = "Deportivo" + ", \nMarca: " + getMarca() + ", \nModelo: " + getModelo() + ", \nNumero Placa: "
                + getNumPlaca() + ", \nCambios: " + getCambios() + ", \nVelodidadMaxima: " + getVelocidadMaxima()
                + ", \nCilindraje: " + getCilindraje() + ", \nNumeros de pasajeros: " + getNumerosPasajeros()
                + ", \nNuermo de puertas: " + getNumeroPuertas() + ", \nNumero de bolsas de aire: " + getNumBolasAire()
                + ", \nCaballos de fuerza: " + caballosDeFuerza + ", \nTiempo de 0kl a 100kl: " + tiempo100kl
                + ", \nTipo Combustible: " + getTipoCombustible()
                + ", \nTipo Trasmisión: " + getTipoTrasmision() + "; \n Es nuevo: " + getEsNuevo()
                + ", \nDisponibilidad: " + getDisponibilidad();
        return v;
    }

    // GETTRES Y SETTERS
    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public double getTiempo100kl() {
        return tiempo100kl;
    }

    public void setTiempo100kl(double tiempo100kl) {
        this.tiempo100kl = tiempo100kl;
    }

}

