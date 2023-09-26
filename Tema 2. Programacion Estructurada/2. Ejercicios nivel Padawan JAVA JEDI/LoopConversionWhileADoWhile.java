// 1. Convierto lo que me da la gana: Demuestre cómo convertir un bucle WHILE en un DO WHILE.

public class LoopConversionWhileADoWhile {
    public static void main(String[] args) {
        // Inicio de la ejecución del bucle WHILE
        System.out.println("Ejecucion con bucle WHILE:");

        // Inicialización del contador para el bucle WHILE
        int contadorWhile = 10;

        // Mientras el contadorWhile sea menor que 5, el bucle se ejecutará (en este caso no se ejecutará)
        while (contadorWhile < 5) {
            System.out.println("Numero con WHILE: " + contadorWhile);
            contadorWhile++;  // Incrementa el valor del contador
        }

        // Separación entre las ejecuciones de los bucles
        System.out.println("\nEjecucion con bucle DO-WHILE:");

        // Inicialización del contador para el bucle DO-WHILE
        int contadorDoWhile = 10;

        // El bucle DO-WHILE se ejecutará al menos una vez antes de evaluar la condición
        do {
            System.out.println("Numero con DO-WHILE: " + contadorDoWhile);
            contadorDoWhile++;  // Incrementa el valor del contador
        } while (contadorDoWhile < 5);  // Si el contadorDoWhile es menor que 5, se repite el bucle (en este caso no se repetirá después de la primera ejecución)
    }
}
