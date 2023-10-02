// 2. Dame los mayores y los menores : Realizar un programa donde se guarden 5 en
// un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo
// de los números ingresados.

public class MaximoYMinimo {
    
    public static void main(String[] args) {
        int[] numeros = {12, 43, 7, 89, 45};  // Array con 5 números enteros.

        int maximo = numeros[0];  // Asumimos que el primer número es el máximo.
        int minimo = numeros[0];  // Asumimos que el primer número es el mínimo.

        // Recorremos el arreglo desde el segundo elemento (índice 1).
        for (int i = 1; i < numeros.length; i++) {
            // Si encontramos un número mayor que el máximo actual, lo actualizamos.
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            // Si encontramos un número menor que el mínimo actual, lo actualizamos.
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        // Mostramos en pantalla el valor máximo y mínimo.
        System.out.println("El valor maximo es: " + maximo);
        System.out.println("El valor minimo es: " + minimo);
    }
}
