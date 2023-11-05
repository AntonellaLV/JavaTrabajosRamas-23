package PadawanJavaJedi2.appdeestudiantes;

import java.util.Date;

public class Calificacion {
    private int valor;       // Calificación entre 1 y 10.
    private Date fecha;

    public Calificacion(int valor, Date fecha) {
        if (valor < 1 || valor > 10) {
            throw new IllegalArgumentException("Calificación debe ser entre 1 y 10.");
        }
        this.valor = valor;
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public Date getFecha() {
        return fecha;
    }
}
