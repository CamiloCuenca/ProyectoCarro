package model;

public class Sedan extends Automovil{
    private int capMaletero;

    public Sedan(int capMaletero, String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima,
                 int cilindraje,
                 String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
                 TieneABS tieneABS, Disponibilidad disponibilidad, int numerosPasajeros, int numeroPuertas, int numBolasAire,
                 TieneCamaraReversa tieneCamaraReversa, TieneAireAcondicionado tieneAireAcondicionado,
                 TieneVelocidadCrucero tieneVelocidadCrucero, TieneSensorColision tieneSensorColision,
                 TIeneSensorCruzado tIeneSensorCruzado, TieneAsistentePerCarril tieneAsistentePerCarril) {
        super(marca, modelo, numPlaca, cambios, velocidadMaxima, cilindraje, fotos, tipoCombustible, tipoTrasmision,
                esNuevo,
                tieneABS, disponibilidad, numerosPasajeros, numeroPuertas, numBolasAire, tieneCamaraReversa,
                tieneAireAcondicionado, tieneVelocidadCrucero, tieneSensorColision, tIeneSensorCruzado,
                tieneAsistentePerCarril);
        this.capMaletero = capMaletero;
    }

    @Override
    public String toString() {
        String v = "Sedan" + ", \nMarca: "
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
                + getDisponibilidad() + ", \nNumero de pasajeros: "
                + getNumerosPasajeros() + ", \nNumero de puertas: "
                + getNumeroPuertas() + ",\nNumero de bolsas de aire: "
                + getNumBolasAire() + ", \nCamara de Reversa: "
                + getTieneCamaraReversa() + ", \nAire Acondicionado: "
                + getTieneAireAcondicionado() + ", \nVelocidad Crucero: "
                + getTieneVelocidadCrucero() + ", \nSensor Colisión: "
                + getTieneSensorColision() + ", \nSensor Cruzado: "
                + gettIeneSensorCruzado() + ", \nAsistente de Permanencia: "
                + getTieneAsistentePerCarril() + ", \nCapacidad Maletero: "
                + capMaletero;

        return v;
    }

    public int getCapMaletero() {
        return capMaletero;
    }

    public void setCapMaletero(int capMaletero) {
        this.capMaletero = capMaletero;
    }

}
