package AppMusicalJavaJedi;

import java.util.ArrayList;
import java.util.List;

// Se mantiene simple usando una List.
// Al llegar al final de la lista, si seRepite es verdadero, simplemente se vuelve a empezar desde el principio.
// Esto se logra mediante el bucle.
// La estructura de control más conveniente para manejar la repetición de la playlist es el bucle 'do-while'.

public class Playlist {
    private String nombre;
    private List<Cancion> canciones;
    private boolean seRepite;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void reproducirPlaylist() {
        if (canciones.isEmpty()) {
            System.out.println("La playlist está vacía.");
            return;
        }

        do {
            for (Cancion cancion : canciones) {
                cancion.reproducir();
            }
        } while (seRepite);
    }

    // Getters y Setters
    public boolean isSeRepite() {
        return seRepite;
    }

    public void setSeRepite(boolean seRepite) {
        this.seRepite = seRepite;
    }
}
