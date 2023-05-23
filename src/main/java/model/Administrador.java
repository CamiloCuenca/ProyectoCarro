package model;

import com.tucarro.proyectocarro.Empleado;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Administrador extends Persona {

    private ArrayList<Empleado> empleados = new ArrayList<>();
    public Administrador(String nombre, String apellido, String cedula, String correo, String contraseña) {
        super(nombre, apellido, cedula, correo, contraseña);
    }
    public void verReporte(){

    }
    public void RegistrarEmpleado(String nombre , String apellido , String Contrasena , String correo , String cedula , int id ){
        Empleado empleadox = new Empleado(nombre,apellido,cedula,correo,Contrasena,id);
        empleados.add(empleadox);
    }

    public void EliminarEmpleado(int id){
        Empleado empleado1 = buscarEmpleado(id);
        empleados.remove(empleado1);

    }
    public void actualizarEmpleado(Empleado empleado){

    }

    public void  bloquearCuenta(){

    }

    public Empleado buscarEmpleado(int id){
        return empleados.stream().filter(x->x.getId()==id).collect(Collectors.toList()).get(0);
    }


    public String buscarUsuario(String usuario){
        Empleado empleadoX = empleados.stream().filter(x->x.getNombre().equals(usuario)).collect(Collectors.toList()).get(0);
        return empleadoX.getNombre();
    }


}
