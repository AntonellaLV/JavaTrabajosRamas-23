package AppMusicalJavaJedi;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String titulo;
    private int anoLanzamiento;
    private Artista artista;
    private List<Cancion> canciones = new ArrayList<>();

    // Constructor
    public Album(String titulo, int anoLanzamiento, Artista artista) {
        this.titulo = titulo;
        this.anoLanzamiento = anoLanzamiento;
        this.artista = artista;
    }

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void reproducirAlbum() {
        for(Cancion cancion : canciones) {
            cancion.reproducir();
        }
    }
}

