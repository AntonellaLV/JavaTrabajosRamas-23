// 2. Descontador: Se le solicita que guarde un número en un espacio de memoria y
// discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría usar para hacerlo?


public class Descontador {
    public static void main(String[] args) {
        int numero = 100; // Inicializamos el número

        // Utilizamos el operador post-decremento 20 veces manualmente
        numero--; numero--; numero--; numero--; numero--;
        numero--; numero--; numero--; numero--; numero--;
        numero--; numero--; numero--; numero--; numero--;
        numero--; numero--; numero--; numero--; numero--;

        // Mostramos el valor final del número
        System.out.println("El numero solicitado, decrementado 20 veces es: " + numero);
    }
}
