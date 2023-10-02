// 7. Yo elijo el equipo ganador mejorado: A partir del ejercicio número 12 del nivel de
// Padawan Jedi (12. Yo elijo el equipo ganador: Modifique el ejercicio anterior en donde usted debe
// crear un menú de opciones en donde en ese menú de opciones debe elegir qué
// equipo de fútbol quiere saber la información del ejercicio 11.). Mejórelo usando arreglos.

public class EquipoGanadorMejorado {
    public static void main(String[] args) {
        // Información de los equipos y sus jugadores
        String[] equipos = {"EquipoA", "EquipoB"};
        String[][] jugadores = {
            {"JugadorA1", "JugadorA2", "JugadorA3"},
            {"JugadorB1", "JugadorB2", "JugadorB3"}
        };

        // Menú de opciones para seleccionar el equipo
        int opcion = 1;  // Puedes cambiar este valor para probar con el otro equipo

        System.out.println("Selecciona el equipo del que quieres saber la informacion:");
        System.out.println("1. " + equipos[0]);
        System.out.println("2. " + equipos[1]);
        System.out.println("Opcion elegida: " + opcion);

        // Muestra la información del equipo seleccionado
        if (opcion == 1 || opcion == 2) {
            System.out.println("\nInformacion del " + equipos[opcion - 1] + ":");
            for (int i = 0; i < jugadores[opcion - 1].length; i++) {
                System.out.println(jugadores[opcion - 1][i]);
            }
        } else {
            System.out.println("Opcion no valida.");
        }
    }
}
