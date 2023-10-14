package InicialJavaJedi1;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private boolean habilitado;
    private String descripcion;
    private List<Alumno> alumnos;

    public Curso(String nombre, boolean habilitado, String descripcion) {
        this.nombre = nombre;
        this.habilitado = habilitado;
        this.descripcion = descripcion;
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void imprimirInformacion() {
        System.out.println("Curso: " + nombre);
        System.out.println("Habilitado: " + (habilitado ? "Sí" : "No"));
        System.out.println("Descripción: " + descripcion);
        System.out.println("Alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println("- " + alumno);
        }
        System.out.println("------------------------------");
    }
}
