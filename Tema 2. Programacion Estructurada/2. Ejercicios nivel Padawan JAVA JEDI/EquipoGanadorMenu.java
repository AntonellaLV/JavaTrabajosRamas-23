// 12. Yo elijo el equipo ganador : Modifique el ejercicio anterior en donde usted debe
// crear un menú de opciones en donde en ese menú de opciones debe elegir qué
// equipo de fútbol quiere saber la información del ejercicio 11.

public class EquipoGanadorMenu {
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

        // Menú de opciones
        System.out.println("Selecciona el equipo del que deseas saber la informacion:");
        System.out.println("1. " + equipo1);
        System.out.println("2. " + equipo2);

        int opcion = 2;  // Asignamos manualmente. Cambia este valor para ver distintos resultados.

        switch (opcion) {
            case 1:
                System.out.println("==== " + equipo1 + " ====");
                System.out.println("Entrenador: " + entrenador1);
                System.out.println("Jugadores:");
                System.out.println(jugador1Equipo1);
                System.out.println(jugador2Equipo1);
                System.out.println(jugador3Equipo1);
                break;
            case 2:
                System.out.println("==== " + equipo2 + " ====");
                System.out.println("Entrenador: " + entrenador2);
                System.out.println("Jugadores:");
                System.out.println(jugador1Equipo2);
                System.out.println(jugador2Equipo2);
                System.out.println(jugador3Equipo2);
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
    }
}
