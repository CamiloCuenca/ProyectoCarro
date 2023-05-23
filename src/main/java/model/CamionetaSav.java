package model;

public class CamionetaSav extends AbsCamioneta {
    // Atributos
    private int capMaletero;

    public enum TieneVelocidadCrucero {
        SI, NO
    };

    TieneVelocidadCrucero tieneVelocidadCrucero;

    public enum TieneSensorColision {
        SI, NO
    };

    TieneSensorColision tieneSensorColision;

    public enum TIeneSensorCruzado {
        SI, NO
    };

    TIeneSensorCruzado tIeneSensorCruzado;

    public enum TieneAsistentePerCarril {
        SI, NO
    };

    TieneAsistentePerCarril tieneAsistentePerCarril;

    // Constructor
    public CamionetaSav(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
                        int numerosPasajeros, int numeroPuertas, int numBolasAire, int capMaletero, String[] fotos,
                        TipoCombustible tipoCombustible,
                        TipoTrasmision tipoTrasmision, EsNuevo esNuevo, Disponibilidad disponibilidad,
                        TieneAireAcondicionado tieneAireAcondicionado, TieneCamaraReversa tieneCamaraReversa, TieneABS tieneABS,
                        EsCuatroxCuatro esCuatroxCuatro) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, numerosPasajeros, numeroPuertas,
                numBolasAire,
                fotos, tipoCombustible, tipoTrasmision, esNuevo, disponibilidad, tieneAireAcondicionado,
                tieneCamaraReversa,
                tieneABS, esCuatroxCuatro);
        this.capMaletero = capMaletero;
    }

    // Metodo imprimir
    @Override
    public String toString() {
        String v = "Camioneta Sav" + ", \nMarca: " + getMarca() + ", \nModelo: " + getModelo() + ", \nNumero Placa: "
                + getNumPlaca() + ", \nCambios: " + getCambios() + ", \nVelodidadMaxima: " + getVelocidadMaxima()
                + ", \nCilindraje: " + getCilindraje() + ", \nNumeros de pasajeros: " + getNumerosPasajeros()
                + ", \nNuermo de puertas: " + getNumeroPuertas() + ", \nNumero de bolsas de aire: " + getNumBolasAire()
                + ", \nCapacidad maletero : " + capMaletero
                + ", \nTipo Combustible: " + getTipoCombustible()
                + ", \nTipo Trasmisión: " + getTipoTrasmision() + "; \n Es nuevo: " + getEsNuevo()
                + ", \nDisponibilidad: " + getDisponibilidad() + ", \nCamara de reversa: " + getTieneCamaraReversa()
                + ", \nAire acondicionado: " + getTieneAireAcondicionado() + ", \nVelocidad Crucero: "
                + tieneVelocidadCrucero
                + ", \nSensor de colisión: " + tieneSensorColision
                + ", \nSensor cruzado: " + tIeneSensorCruzado + ",\nPermanencia de carril: " + tieneAsistentePerCarril
                + ", \nABS: " + getTieneABS() + ", \nCuatro x Cuatro: " + getEsCuatroxCuatro();
        return v;
    }

    // GETTERS Y SETTRES
    public int getCapMaletero() {
        return capMaletero;
    }

    public void setCapMaletero(int capMaletero) {
        this.capMaletero = capMaletero;
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

    public TIeneSensorCruzado gettIeneSensorCruzado() {
        return tIeneSensorCruzado;
    }

    public void settIeneSensorCruzado(TIeneSensorCruzado tIeneSensorCruzado) {
        this.tIeneSensorCruzado = tIeneSensorCruzado;
    }

    public TieneAsistentePerCarril getTieneAsistentePerCarril() {
        return tieneAsistentePerCarril;
    }

    public void setTieneAsistentePerCarril(TieneAsistentePerCarril tieneAsistentePerCarril) {
        this.tieneAsistentePerCarril = tieneAsistentePerCarril;
    }

}
