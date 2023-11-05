package AppMusicalJavaJedi;

import java.util.List;

public class Reproductor {
    private List<Album> albums;

    public Reproductor(List<Album> albums) {
        this.albums = albums;
    }

    // Reproduce una canción basada en su título
    public void reproducirCancion(String titulo) {
        for (Album album : albums) {
            for (Cancion cancion : album.getCanciones()) {
                if (cancion.getTitulo().equals(titulo)) {
                    cancion.reproducir();
                    return;
                }
            }
        }
        System.out.println("Canción no encontrada.");
    }

    // Muestra la información de un álbum basada en su título
    public void mostrarInfoAlbum(String tituloAlbum) {
        for (Album album : albums) {
            if (album.getTitulo().equals(tituloAlbum)) {
                System.out.println("Título: " + album.getTitulo());
                System.out.println("Año de lanzamiento: " + album.getAnoLanzamiento());
                System.out.println("Artista: " + album.getArtista().getNombre());
                return;
            }
        }
        System.out.println("Álbum no encontrado.");
    }

    // Muestra la información de una canción basada en su título
    public void mostrarInfoCancion(String tituloCancion) {
        for (Album album : albums) {
            for (Cancion cancion : album.getCanciones()) {
                if (cancion.getTitulo().equals(tituloCancion)) {
                    System.out.println("Título de la canción: " + cancion.getTitulo());
                    System.out.println("Duración: " + cancion.getDuracion());
                    System.out.println("Pertenece al álbum: " + cancion.getAlbum().getTitulo());
                    System.out.println("Artista: " + cancion.getAlbum().getArtista().getNombre());
                    return;
                }
            }
        }
        System.out.println("Canción no encontrada.");
    }

    // Reproduce un álbum completo basado en su título
    public void reproducirAlbum(String tituloAlbum) {
        boolean albumEncontrado = false;
        for (Album album : albums) {
            if (album.getTitulo().equals(tituloAlbum)) {
                album.reproducirAlbum();
                albumEncontrado = true;
                break;
            }
        }
        if (!albumEncontrado) {
            System.out.println("Álbum no encontrado.");
        }
    }
}
