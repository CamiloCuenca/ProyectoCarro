package model;
public class Bus extends AbsVehiculoCarga {
    // Atributos
    private int capdMaletero;
    private int numerosPasajeros;
    private int numeroPuertas;
    private int numSalidasEm;

    public enum TieneCamaraReversa {
        SI, NO
    };

    TieneCamaraReversa tieneCamaraReversa;

    // Contructor
    public Bus(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
               int capdMaletero, int numerosPasajeros, int numeroPuertas, int numSalidasEm,
               int numEjes, int numBolasAire, String[] fotos, TipoCombustible tipoCombustible,
               TipoTrasmision tipoTrasmision, EsNuevo esNuevo, Disponibilidad disponibilidad,
               TieneAireAcondicionado tieneAireAcondicionado, TieneABS tieneABS, TieneCamaraReversa tieneCamaraReversa) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, numEjes, numBolasAire, fotos,
                tipoCombustible,
                tipoTrasmision, esNuevo, disponibilidad, tieneAireAcondicionado, tieneABS);
        this.capdMaletero = capdMaletero;
        this.numerosPasajeros = numerosPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numSalidasEm = numSalidasEm;
        this.tieneCamaraReversa = tieneCamaraReversa;

    }

    // Metodo imprimir
    @Override
    public String toString() {
        String v = " Bus " + ", \nMarca: " + getMarca() + ", \nModelo: " + getModelo() + ", \nNumero Placa: "
                + getNumPlaca() + ", \nCambios: " + getCambios() + ", \nVelodidadMaxima: " + getVelocidadMaxima()
                + ", \nCilindraje: " + getCilindraje() + ", \nNumeros de pasajeros: " + numerosPasajeros
                + ", \nNuermo de puertas: " + numeroPuertas + ", \nSalidas de emergencia: " + numSalidasEm
                + ", \nNumero de bolsas de aire: " + getNumBolasAire()
                + ", \nCapacidad maletero : " + capdMaletero + ", \nEjes: " + getNumEjes()
                + ", \nTipo Combustible: " + getTipoCombustible()
                + ", \nTipo Trasmisión: " + getTipoTrasmision() + "; \n Es nuevo: " + getEsNuevo()
                + ", \nDisponibilidad: " + getDisponibilidad() + ", \nCamara de reversa: " + tieneCamaraReversa
                + ", \nAire acondicionado: " + tieneAireAcondicionado + ", \nVelocidad Crucero: "
                + ", \nABS: " + tieneABS;
        return v;
    }

    // GETTERS Y SETTRES
    public int getCapdMaletero() {
        return capdMaletero;
    }

    public void setCapdMaletero(int capdMaletero) {
        this.capdMaletero = capdMaletero;
    }

    public int getNumerosPasajeros() {
        return numerosPasajeros;
    }

    public void setNumerosPasajeros(int numerosPasajeros) {
        this.numerosPasajeros = numerosPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumSalidasEm() {
        return numSalidasEm;
    }

    public void setNumSalidasEm(int numSalidasEm) {
        this.numSalidasEm = numSalidasEm;
    }

    public TieneCamaraReversa getTieneCamaraReversa() {
        return tieneCamaraReversa;
    }

    public void setTieneCamaraReversa(TieneCamaraReversa tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }

}

