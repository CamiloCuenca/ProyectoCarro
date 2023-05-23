package model;

public class Camion extends AbsVehiculoCarga {
    // Atributos
    private int capacidadCarga;

    public enum TieneFrenoAire {
        SI, NO
    };

    TieneFrenoAire tieneFrenoAire;

    public enum TipoCamion {
        CAMIONRIGIDO, CAMIONARTICULADO
    };

    TipoCamion tipoCamion;

    // Constructor
    public Camion(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
                  int numEjes, int numBolasAire, int capacidadCarga, String[] fotos, TipoCombustible tipoCombustible,
                  TipoTrasmision tipoTrasmision, EsNuevo esNuevo, Disponibilidad disponibilidad,
                  TieneAireAcondicionado tieneAireAcondicionado, TieneABS tieneABS, TieneFrenoAire tieneFrenoAire,
                  TipoCamion tipoCamion) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, numEjes, numBolasAire, fotos,
                tipoCombustible,
                tipoTrasmision, esNuevo, disponibilidad, tieneAireAcondicionado, tieneABS);
        this.capacidadCarga = capacidadCarga;
        this.tieneFrenoAire = tieneFrenoAire;
        this.tipoCamion = tipoCamion;
    }

    // Metodo imprimir
    @Override
    public String toString() {
        String v = " Camion " + ", \nMarca: " + getMarca() + ", \nModelo: " + getModelo() + ", \nNumero Placa: "
                + getNumPlaca() + ", \nCambios: " + getCambios() + ", \nVelodidadMaxima: " + getVelocidadMaxima()
                + ", \nCilindraje: " + getCilindraje()
                + ", \nNumero de bolsas de aire: " + getNumBolasAire()
                + ", \nCapacidad Carga : " + capacidadCarga + ", \nEjes: " + getNumEjes()
                + ", \nTipo Combustible: " + getTipoCombustible()
                + ", \nTipo Trasmisión: " + getTipoTrasmision() + "; \n Es nuevo: " + getEsNuevo()
                + ", \nDisponibilidad: " + getDisponibilidad()
                + ", \nAire acondicionado: " + tieneAireAcondicionado
                + ", \nABS: " + tieneABS;
        return v;
    }

    // GETTERS Y SETTRES
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public TieneFrenoAire getTieneFrenoAire() {
        return tieneFrenoAire;
    }

    public void setTieneFrenoAire(TieneFrenoAire tieneFrenoAire) {
        this.tieneFrenoAire = tieneFrenoAire;
    }

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

}

