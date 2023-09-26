// 1. Contador: Se le solicita que guarde un número en un espacio de memoria e
// incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar para hacerlo?

public class Contador {
    public static void main(String[] args) {
        int numero = 1; // Inicializamos el número en 1

        numero = numero * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2;

        // Mostramos el valor final del número
        System.out.println("El numero solicitado, incrementado 20 veces es: " + numero);
    }
}
