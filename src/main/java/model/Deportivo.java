package model;

public class Deportivo extends Automovil{
    private int caballosDeFuerza;
    private double tiempo100kl;

    public Deportivo(int caballosDeFuerza, double tiempo100kl, String marca, String modelo, String numPlaca,
                     int cambios, int velocidadMaxima, int cilindraje,
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
        this.caballosDeFuerza = caballosDeFuerza;
        this.tiempo100kl = tiempo100kl;

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
                + getTieneAsistentePerCarril() + ", \nCaballos de Fuerza: "
                + caballosDeFuerza + ", \nTiempo para 100kl: "
                + tiempo100kl;

        return v;

    }

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
