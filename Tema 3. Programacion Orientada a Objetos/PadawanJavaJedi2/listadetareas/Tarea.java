package PadawanJavaJedi2.listadetareas;

public class Tarea {
    private String titulo;
    private String descripcion;
    private String fechaVencimiento;

    public Tarea(String titulo, String descripcion, String fechaVencimiento) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nDescripción: " + descripcion + "\nFecha de Vencimiento: " + fechaVencimiento;
    }
}
