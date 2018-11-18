package finalproject;

public class Persona {

//Declaracion de las variables
   private String nombre;
   private String apellido;
   private String ced;
   private int edad;
   private String nacionalidad;
   private String correo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String ced, int edad, String nacionalidad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ced = ced;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.correo = correo;
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

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

 
}
