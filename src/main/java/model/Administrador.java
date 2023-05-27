package model;

import com.tucarro.proyectocarro.Empleado;
import com.tucarro.proyectocarro.tipoEstado;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Administrador extends Persona {
    //Atributos
    private static  ArrayList<Empleado> empleados = new ArrayList<>();
    public Administrador(String nombre, String apellido, String cedula, String correo, String contraseña) {
        super(nombre, apellido, cedula, correo, contraseña);
    }
    //Métodos
    public void verReporte(){

    }
    public static  void RegistrarEmpleado(String nombre , String apellido , String Contrasena , String correo , String cedula , String id ){
        Empleado empleadox = new Empleado(nombre,apellido,cedula,correo,Contrasena,id, tipoEstado.ACTIVO);
        empleados.add(empleadox);
    }

    public void EliminarEmpleado(String id){
        Empleado empleado1 = buscarEmpleado(id);
        empleados.remove(empleado1);

    }
    public void actualizarEmpleado(Empleado empleado){

    }

    public void  bloquearCuenta(){

    }

    public Empleado buscarEmpleado(String id){
        return empleados.stream().filter(x->x.getId()==id).collect(Collectors.toList()).get(0);
    }


    public String buscarUsuario(String usuario){
        Empleado empleadoX = empleados.stream().filter(x->x.getNombre().equals(usuario)).collect(Collectors.toList()).get(0);
        return empleadoX.getNombre();
    }




}
