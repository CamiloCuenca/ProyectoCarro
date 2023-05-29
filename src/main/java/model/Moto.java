package model;

import model.Enums.Disponibilidad;
import model.Enums.EsNuevo;
import model.Enums.TipoCombustible;
import model.Enums.TipoTrasmision;

public class Moto extends Vehiculo {

    // Constructor
    public Moto(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
                String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
                Disponibilidad disponibilidad) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision,
                esNuevo,
                disponibilidad);
    }





    // Metodo imprimir
    @Override
    public String toString() {
        String v = "Moto" + ", \nMarca: "
                + getMarca() + ", \nModelo: "
                + getModelo() + ", \nNumero Placa: "
                + getNumPlaca() + ", \nCambios: "
                + getCambios() + ", \nVelodidadMaxima: "
                + getVelocidadMaxima() + ", \nCilindraje: "
                + getCilindraje() + ", \nTipo Combustible: "
                + getTipoCombustible() + ", \nTipo Trasmisión: "
                + getTipoTrasmision() + "; \n Es nuevo: "
                + getEsNuevo() + ", \nDisponibilidad: "
                + getDisponibilidad();

        return v;
    }


}

