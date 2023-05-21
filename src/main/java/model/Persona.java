package model;

public  abstract class Persona {

    //Atributos
    private String nombre ;
    private String apellido;
    private String cedula ;
    private String correo ;
    private String contraseña ;

    //Constructor
    public Persona(String nombre, String apellido, String cedula, String correo, String contraseña) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.contraseña = contraseña;
    }




    //Get and Set




    public Persona() {
        // TODO Auto-generated constructor stub
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getCedula() {
        return cedula;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", correo=" + correo
                + ", contraseña=" + contraseña + "]";
    }
}
