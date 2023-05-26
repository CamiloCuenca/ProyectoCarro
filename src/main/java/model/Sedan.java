package model;

public class Sedan extends AbsAutomovil {
    private int capMaletero;

    public enum TieneAireAcondicionado {
        SI, NO
    }

    ;

    AbsCamioneta.TieneAireAcondicionado tieneAireAcondicionado;

    public enum TieneCamaraReversa {
        SI, NO
    }

    ;

    AbsCamioneta.TieneCamaraReversa tieneCamaraReversa;

    public enum TieneVelocidadCrucero {
        SI, NO
    }

    ;

    CamionetaSav.TieneVelocidadCrucero tieneVelocidadCrucero;

    public enum TieneSensorColision {
        SI, NO
    }

    ;

    CamionetaSav.TieneSensorColision tieneSensorColision;

    public enum TIeneSensorCruzado {
        SI, NO
    }

    ;

    CamionetaSav.TIeneSensorCruzado tIeneSensorCruzado;

    public enum TieneAsistentePerCarril {
        SI, NO
    }

    ;

    CamionetaSav.TieneAsistentePerCarril tieneAsistentePerCarril;


    public enum TieneABS {
        SI, NO
    }

    ;

    AbsCamioneta.TieneABS tieneABS;

    public Sedan(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje, int numerosPasajeros, int numeroPuertas, int numBolasAire, String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo, Disponibilidad disponibilidad, int capMaletero, AbsCamioneta.TieneAireAcondicionado tieneAireAcondicionado, AbsCamioneta.TieneCamaraReversa tieneCamaraReversa, CamionetaSav.TieneVelocidadCrucero tieneVelocidadCrucero, CamionetaSav.TieneSensorColision tieneSensorColision, CamionetaSav.TIeneSensorCruzado tIeneSensorCruzado, CamionetaSav.TieneAsistentePerCarril tieneAsistentePerCarril, AbsCamioneta.TieneABS tieneABS) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, numerosPasajeros, numeroPuertas, numBolasAire, fotos, tipoCombustible, tipoTrasmision, esNuevo, disponibilidad);
        this.capMaletero = capMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.tieneSensorColision = tieneSensorColision;
        this.tIeneSensorCruzado = tIeneSensorCruzado;
        this.tieneAsistentePerCarril = tieneAsistentePerCarril;
        this.tieneABS = tieneABS;
    }

    public int getCapMaletero() {
        return capMaletero;
    }

    public void setCapMaletero(int capMaletero) {
        this.capMaletero = capMaletero;
    }

    public AbsCamioneta.TieneAireAcondicionado getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(AbsCamioneta.TieneAireAcondicionado tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public AbsCamioneta.TieneCamaraReversa getTieneCamaraReversa() {
        return tieneCamaraReversa;
    }

    public void setTieneCamaraReversa(AbsCamioneta.TieneCamaraReversa tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }

    public CamionetaSav.TieneVelocidadCrucero getTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }

    public void setTieneVelocidadCrucero(CamionetaSav.TieneVelocidadCrucero tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
    }

    public CamionetaSav.TieneSensorColision getTieneSensorColision() {
        return tieneSensorColision;
    }

    public void setTieneSensorColision(CamionetaSav.TieneSensorColision tieneSensorColision) {
        this.tieneSensorColision = tieneSensorColision;
    }

    public CamionetaSav.TIeneSensorCruzado gettIeneSensorCruzado() {
        return tIeneSensorCruzado;
    }

    public void settIeneSensorCruzado(CamionetaSav.TIeneSensorCruzado tIeneSensorCruzado) {
        this.tIeneSensorCruzado = tIeneSensorCruzado;
    }

    public CamionetaSav.TieneAsistentePerCarril getTieneAsistentePerCarril() {
        return tieneAsistentePerCarril;
    }

    public void setTieneAsistentePerCarril(CamionetaSav.TieneAsistentePerCarril tieneAsistentePerCarril) {
        this.tieneAsistentePerCarril = tieneAsistentePerCarril;
    }

    public AbsCamioneta.TieneABS getTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(AbsCamioneta.TieneABS tieneABS) {
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
                + ", \nSensor cruzado: " + tIeneSensorCruzado + ",\nPermanencia de carril: " + tieneAsistentePerCarril
                + ", \nABS: " + tieneABS;
        return v;
    }
}
