package PadawanJavaJedi2.appdeestudiantes;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String id;
    private List<Calificacion> calificaciones;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarCalificacion(Calificacion calificacion) {
        calificaciones.add(calificacion);
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0;
        }

        double suma = 0;
        for (Calificacion calificacion : calificaciones) {
            suma += calificacion.getValor();
        }

        return suma / calificaciones.size();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
}

