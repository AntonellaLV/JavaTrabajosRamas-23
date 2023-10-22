package AppMusicalJavaJedi;

public class Cancion {
    private String titulo;
    private String duracion;
    private Album album;

    // Constructor
    public Cancion(String titulo, String duracion, Album album) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.album = album;
        album.agregarCancion(this);  // Agregar canción al álbum
    }

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo + " del álbum " + album.getTitulo());
    }
}
