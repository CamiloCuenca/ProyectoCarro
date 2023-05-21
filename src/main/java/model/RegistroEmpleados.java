package model;

import java.util.ArrayList;

public class RegistroEmpleados {
    ArrayList<Cliente> clientes = new ArrayList<>();



    public ArrayList<Cliente> añandirCliente(Cliente cliente){
        clientes.add(cliente);
        return clientes;
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

        clientes.add(clientey);
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
