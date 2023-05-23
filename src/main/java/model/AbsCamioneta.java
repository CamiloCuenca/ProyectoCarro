package model;

public abstract class AbsCamioneta extends Vehiculo {
    // Atributos
    private int numerosPasajeros;
    private int numeroPuertas;
    private int numBolasAire;

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

    public enum EsCuatroxCuatro {
        SI, NO
    };

    EsCuatroxCuatro esCuatroxCuatro;

    // Contructor
    public AbsCamioneta(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
                        int numerosPasajeros, int numeroPuertas, int numBolasAire,
                        String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
                        Disponibilidad disponibilidad, TieneAireAcondicionado tieneAireAcondicionado,
                        TieneCamaraReversa tieneCamaraReversa, TieneABS tieneABS, EsCuatroxCuatro esCuatroxCuatro) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision,
                esNuevo,
                disponibilidad);
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneABS = tieneABS;
        this.esCuatroxCuatro = esCuatroxCuatro;
    }

    // Metodo imprimir
    @Override
    public abstract String toString();

    // SETTERS Y GETTERS
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

    public int getNumBolasAire() {
        return numBolasAire;
    }

    public void setNumBolasAire(int numBolasAire) {
        this.numBolasAire = numBolasAire;
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

    public EsCuatroxCuatro getEsCuatroxCuatro() {
        return esCuatroxCuatro;
    }

    public void setEsCuatroxCuatro(EsCuatroxCuatro esCuatroxCuatro) {
        this.esCuatroxCuatro = esCuatroxCuatro;
    }

}
