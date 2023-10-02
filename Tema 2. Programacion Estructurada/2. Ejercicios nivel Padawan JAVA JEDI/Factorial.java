//3. El factorial: Realizar un programa que calcule el factorial de un número.

public class Factorial {
    public static void main(String[] args) {
        // Número del cual queremos calcular el factorial
        int numero = 5; // Puedes cambiar este valor según necesites

        // Variable para almacenar el resultado
        long factorial = 1; 

        // Variable para controlar el bucle
        int i = numero;

        // Bucle para calcular el factorial
        while (i > 0) {
            factorial *= i;  // Multiplicamos el factorial por el número actual
            i--;             // Disminuimos el número
        }

        // Imprime el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
