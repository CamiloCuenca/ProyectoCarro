package model;

import model.Enums.Disponibilidad;
import model.Enums.EsNuevo;
import model.Enums.TipoCombustible;
import model.Enums.TipoTrasmision;

public abstract class Vehiculo {
    // Atributos clase padre
    private String marca;
    private String modelo;
    private String numPlaca;
    private int cambios;
    private int velocidadMaxima;
    private int cilindraje;
    private String[] fotos;
    private TipoCombustible tipoCombustible;
   private  TipoTrasmision tipoTrasmision;
   private EsNuevo esNuevo;
    private Disponibilidad disponibilidad;

    // Constructor
    public Vehiculo(String marca, String modelo, String numPlaca, int cambios, int velocidadMaxima, int cilindraje,
                    String[] fotos, TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, EsNuevo esNuevo,
                    Disponibilidad disponibilidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPlaca = numPlaca;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.fotos = fotos;
        this.tipoCombustible = tipoCombustible;
        this.tipoTrasmision = tipoTrasmision;
        this.esNuevo = esNuevo;
        this.disponibilidad = disponibilidad;
    }

    // Metodo imprimir
    @Override
    public abstract String toString();

    // GETTERS Y SETTRES
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String[] getFotos() {
        return fotos;
    }

    public void setFotos(String[] fotos) {
        this.fotos = fotos;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoTrasmision getTipoTrasmision() {
        return tipoTrasmision;
    }

    public void setTipoTrasmision(TipoTrasmision tipoTrasmision) {
        this.tipoTrasmision = tipoTrasmision;
    }

    public EsNuevo getEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(EsNuevo esNuevo) {
        this.esNuevo = esNuevo;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}