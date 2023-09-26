// 4. Cálculo de la media aritmética:
// Escribir un programa en Java que calcule la media aritmética de un conjunto de
// números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
// los números y k es el número total de elementos. Utilicen variables y constantes según corresponda.
// Muestre el resultado por pantalla.


public class CalculoMediaAritmetica {
    public static void main(String[] args) {
        // Definimos los números en el conjunto
        double n1 = 10.5;
        double n2 = 15.2;
        double n3 = 20.0;
        double n4 = 8.7;
        double n5 = 12.3;

        // Calculamos la suma de los números
        double suma = n1 + n2 + n3 + n4 + n5;

        // Definimos el número total de elementos en el conjunto
        int k = 5; // En este caso, hay 5 números en el conjunto

        // Calculamos la media aritmética
        double media = suma / k;

        // Mostramos el resultado por pantalla
        System.out.println("Numeros en el conjunto:");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("n5 = " + n5);
        System.out.println("Media Aritmetica: " + media);
    }
}
