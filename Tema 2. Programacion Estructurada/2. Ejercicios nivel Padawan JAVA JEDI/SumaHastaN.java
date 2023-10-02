// 6. Y mas… sumas! : Realizar un programa donde se guarde un número entero en una
// variable y que imprima por pantalla el resultado de la suma de todos los números
// enteros desde 1 hasta ese número.

public class SumaHastaN {
    public static void main(String[] args) {
        // Guarda un número entero en una variable
        int numero = 50;  // Puedes cambiar este valor según tus necesidades

        // Variable para almacenar la suma total
        int suma = 0;

        // Variable para iterar desde 1 hasta "numero"
        int i = 1;

        // Bucle para calcular la suma de los números
        while (i <= numero) {
            suma += i;
            i++;  // Incrementa el contador para la próxima iteración
        }

        // Imprime el resultado
        System.out.println("La suma de los numeros desde 1 hasta " + numero + " es: " + suma);
    }
}
