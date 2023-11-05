package InicialJavaJedi1;

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " " + apellido + ", Edad: " + edad;
    }
}

