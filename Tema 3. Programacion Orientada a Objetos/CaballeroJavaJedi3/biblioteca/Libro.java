package CaballeroJavaJedi3.biblioteca;

public class Libro {
    private String titulo;
    private Autor autor;
    private boolean disponibilidad;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean estaDisponible() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Disponibilidad: " + (disponibilidad ? "Disponible" : "No Disponible");
    }
}
