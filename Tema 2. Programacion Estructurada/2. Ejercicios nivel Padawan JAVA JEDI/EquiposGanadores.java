// 11. Los equipos ganadores : Guarde en variables el nombre de 2 equipos de fútbol,
// luego en otras 2 variables el nombre de los entrenadores y luego guarde el nombre
// de los jugadores en distintas variables. Luego muestre un encabezado con el
// nombre de cada equipo y por cada equipo muestre los nombres de los jugadores.

public class EquiposGanadores {
    public static void main(String[] args) {
        // Nombres de los equipos
        String equipo1 = "Real Madrid";
        String equipo2 = "FC Barcelona";

        // Nombres de los entrenadores
        String entrenador1 = "Carlo Ancelotti";
        String entrenador2 = "Xavi Hernandez";

        // Jugadores del equipo 1
        String jugador1Equipo1 = "Karim Benzema";
        String jugador2Equipo1 = "Luka Modric";
        String jugador3Equipo1 = "Thibaut Courtois";

        // Jugadores del equipo 2
        String jugador1Equipo2 = "Lionel Messi";
        String jugador2Equipo2 = "Gerard Pique";
        String jugador3Equipo2 = "Marc-Andre ter Stegen";

        // Muestra de datos

        // Equipo 1
        System.out.println("==== " + equipo1 + " ====");
        System.out.println("Entrenador: " + entrenador1);
        System.out.println("Jugadores:");
        System.out.println(jugador1Equipo1);
        System.out.println(jugador2Equipo1);
        System.out.println(jugador3Equipo1);

        System.out.println();  // Espacio en blanco para separar equipos

        // Equipo 2
        System.out.println("==== " + equipo2 + " ====");
        System.out.println("Entrenador: " + entrenador2);
        System.out.println("Jugadores:");
        System.out.println(jugador1Equipo2);
        System.out.println(jugador2Equipo2);
        System.out.println(jugador3Equipo2);
    }
}
