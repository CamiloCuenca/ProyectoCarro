package com.tucarro.proyectocarro;
import com.tucarro.proyectocarro.Cliente;
import model.Persona;
import model.Vehiculo;

import java.util.ArrayList;
public class Empleado extends Persona {
    //Atributos
    //private ArrayList<Reportes> reportes = new  ArrayList<Reportes>();
    private enum tipoEstado{ACTIVO,BLOQUEADO};
    private tipoEstado estado;
    private int id;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

    //Constructor
    public Empleado(String nombre, String apellido, String cedula, String correo, String contraseña, int id) {
        super(nombre, apellido, cedula, correo, contraseña);
        this.id=id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Cliente> registrarCliente(Cliente cliente){
        clientes.add(cliente);
        return clientes;
    }

   public boolean buscarClientes(String nombre , String contrasena){

       Cliente clientex = new Cliente();
       Cliente clientey = new Cliente();

       clientex.setNombre("Juan");
       clientex.setApellido("cuenca");
       clientex.setCedula("1004779025");
       clientex.setCorreo("camilo@gotmail");
       clientex.setContraseña("12345");

       clientey.setNombre("Camilo");
       clientey.setApellido("cuenca");
       clientey.setCedula("1004779025");
       clientey.setCorreo("camilo@gotmail");
       clientey.setContraseña("12345");

        for(int i =0;i<clientes.size();i++){
            if(clientes.get(i).getNombre().equals(nombre) && clientes.get(i).getNombre().equals(contrasena)){
                return true;
            }else{
                return false;
            }
        }
        return false;
   }



}
