package model;

public class Moto   extends Vehiculo{
    public Moto(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
                String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
                TieneABS tieneABS, Disponibilidad disponibilidad) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision,
                esNuevo,
                tieneABS, disponibilidad);
    }

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
                + getEsNuevo() + ", \nTiene ABS: "
                + getTieneABS() + ", \nDisponibilidad: "
                + getDisponibilidad();

        return v;
    }

}
