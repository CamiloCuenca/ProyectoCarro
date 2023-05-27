package com.tucarro.proyectocarro;

import model.Persona;
import model.Vehiculo;

import java.util.ArrayList;

public class Empleado extends Persona {
    //Atributos

    private com.tucarro.proyectocarro.tipoEstado estado;

    private String id;

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

    //Constructor
    public Empleado(String nombre, String apellido, String cedula, String correo, String contraseña, String id, tipoEstado estado) {
        super(nombre, apellido, cedula, correo, contraseña);
        this.id = id;
        this.estado = estado;
    }


    //Get and Set
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }


    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }


    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }


    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public tipoEstado getEstado() {
        return estado;
    }

    public void setEstado(tipoEstado estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Método para buscar un Cliente

    public boolean buscarClientes(String nombre, String contrasena) {

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equals(nombre) && clientes.get(i).getNombre().equals(contrasena)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }




}
