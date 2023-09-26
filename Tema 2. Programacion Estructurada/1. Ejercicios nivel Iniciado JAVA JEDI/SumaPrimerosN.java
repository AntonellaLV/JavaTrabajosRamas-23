// 5. La suma de los primeros: Realizar un programa que calcule la suma de los
// primeros N números naturales, donde N es un número entero guardado en memoria.

public class SumaPrimerosN {
    public static void main(String[] args) {
        // Definimos y guardamos el valor de N en memoria
        int N = 100; // Puedes cambiar este valor para probar con diferentes números

        int suma = 0;
        int i = 1; // Empezamos desde el primer número natural

        // Usamos un bucle while para sumar los primeros N números naturales
        while (i <= N) {
            suma += i; // Sumamos el valor actual de i a la suma
            i++;       // Incrementamos i para el siguiente ciclo
        }

        System.out.println("La suma de los primeros " + N + " numeros naturales es: " + suma);
    }
}
