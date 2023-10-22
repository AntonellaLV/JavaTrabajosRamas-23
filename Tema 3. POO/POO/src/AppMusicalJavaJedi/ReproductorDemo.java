package AppMusicalJavaJedi;

import java.util.Scanner;

public class ReproductorDemo {

    public static void main(String[] args) {
        Artista artista = new Artista("Los Beatles", "Rock");
        Album album1 = new Album("Abbey Road", 1969, artista);
        Cancion cancion1 = new Cancion("Come Together", "4:20", album1);
        Cancion cancion2 = new Cancion("Something", "3:03", album1);

        Playlist playlistFavorita = new Playlist("Clásicos del Rock");
        playlistFavorita.agregarCancion(cancion1);
        playlistFavorita.agregarCancion(cancion2);

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Deseas que la playlist se repita? (s/n): ");
        char respuesta = sc.nextLine().charAt(0);
        if (respuesta == 's' || respuesta == 'S') {
            playlistFavorita.setSeRepite(true);
        }

        // Iniciar la reproducción
        new Thread(playlistFavorita::reproducirPlaylist).start();

        System.out.println("Presiona Enter para detener la playlist...");
        sc.nextLine();

        // Detener la playlist
        playlistFavorita.setSeRepite(false);
    }
}
