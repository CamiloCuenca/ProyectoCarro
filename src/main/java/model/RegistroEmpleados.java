package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class RegistroEmpleados {
   public static  ArrayList<Cliente> clientes = new ArrayList<>();
   public static  ArrayList<Empleado> empleados = new ArrayList<>();




    public  ArrayList<Empleado> getEmpleados() {
        Empleado empleadox = new Empleado("Pedro","Perez","111","correo","12345",123);
        empleadox.setNombre("Pedro");
        empleadox.setContraseña("12345");
        empleados.add(empleadox);
        return empleados;
    }

    public ArrayList<Cliente> buscarCliente(){
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

        //clientes.add(clientey);
        clientes.add(clientex);
        return clientes;
    }






    public ArrayList<String> llenarUsusarios() {
        ArrayList<String> listaNombre = new ArrayList<>();
        listaNombre.add("Juan Camilo");
        listaNombre.add("Pedro Infante");
        listaNombre.add("Carlitos Rodrigez");

        return listaNombre;
    }


    public ArrayList<String> llenarCedulaususarios() {
        ArrayList<String> listaCedula = new ArrayList<>();
        listaCedula.add("12345");
        listaCedula.add("67890");
        listaCedula.add("11111");
        return listaCedula;

    }

}
