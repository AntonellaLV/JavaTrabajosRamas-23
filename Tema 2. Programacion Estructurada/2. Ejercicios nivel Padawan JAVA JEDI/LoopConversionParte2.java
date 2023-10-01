// 2. Convierto lo que me da la gana parte 2: Demuestre cómo convertir un bucle WHILE en un bucle FOR.

public class LoopConversionParte2 {
    public static void main(String[] args) {
        
        // Inicio de la ejecución del bucle WHILE
        System.out.println("Ejecucion con bucle WHILE:");
        
        // Inicialización del contador para el bucle WHILE
        int contadorWhile = 0;

        // Mientras el contadorWhile sea menor o igual a 10, el bucle se ejecutará
        while (contadorWhile <= 10) {
            // Imprime el valor actual de contadorWhile
            System.out.println("Numero con WHILE: " + contadorWhile);
            
            // Incrementa el valor del contador para la próxima iteración
            contadorWhile++;
        }

        // Inicio de la ejecución del bucle FOR
        System.out.println("\nEjecucion con bucle FOR:");

        // Inicialización, condición e incremento están en la declaración del bucle FOR
        for (int contadorFor = 0; contadorFor <= 10; contadorFor++) {
            // Imprime el valor actual de contadorFor
            System.out.println("Numero con FOR: " + contadorFor);
        }
    }
}

