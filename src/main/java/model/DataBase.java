package model;

import com.tucarro.proyectocarro.Cliente;
import com.tucarro.proyectocarro.Empleado;
import com.tucarro.proyectocarro.tipoEstado;

import java.util.ArrayList;

public class DataBase {

   public static  ArrayList<Cliente> clientes = new ArrayList<>();
   public static  ArrayList<Empleado> empleados = new ArrayList<>();

   public static ArrayList<Administrador> administradores = new ArrayList<>();

    /**Este metodo quema a un administrador en el codigo
     * (Para Pruebas).
     *
     * @return
     */
    public ArrayList<Administrador> setValoresQuemadosAdministrador(){
        Administrador admin1 = new Administrador("Profe","smit","1234567890","profe@gmail.com","12345");
        administradores.add(admin1);
        return administradores;
    }

    /**Este metodo quema a un Empleado en el codigo
     * (Para Pruebas).
     *
     * @return
     */
    public  ArrayList<Empleado> setValoresQuemadosEmpleado() {
        Empleado empleadox = new Empleado("Pedro","Perez","111","correo","12345",123, tipoEstado.ACTIVO);
        empleados.add(empleadox);
        return empleados;
    }
    /**Este metodo quema a un Cliente en el codigo
     * (Para pruebas).
     *
     * @return
     */
    public ArrayList<Cliente> SetValoresQuemadosCliente(){
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

}
