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


       // clientes.add(clientey);
       // clientes.add(clientex);
        return clientes;
    }

}
