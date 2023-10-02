// 4. Suma del rango de números : Escribir un programa que encuentre la suma de los
// números impares en un rango de números enteros guardados en una variable.

public class SumaImparesRango {
    public static void main(String[] args) {
        // Define el rango: desde el número "inicio" hasta el número "fin".
        int inicio = 1;  // Puedes cambiar este valor según tus necesidades
        int fin = 100;   // Puedes cambiar este valor según tus necesidades

        // Variable para almacenar la suma total de números impares
        int suma = 0;

        // Variable para iterar desde "inicio" hasta "fin"
        int i = inicio;

        // Bucle para calcular la suma de los números impares
        while (i <= fin) {
            // Si el número es impar, se suma al total
            if (i % 2 != 0) {
                suma += i;
            }
            i++;  // Incrementa el contador para la próxima iteración
        }

        // Imprime el resultado
        System.out.println("La suma de los numeros impares desde " + inicio + " hasta " + fin + " es: " + suma);
    }
}
