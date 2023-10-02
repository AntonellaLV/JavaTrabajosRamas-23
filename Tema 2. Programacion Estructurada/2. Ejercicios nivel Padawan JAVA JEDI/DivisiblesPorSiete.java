// 5. Positivos y divisibles por 7 : Realizar un programa que muestre por pantalla los
// números enteros positivos que sean divisibles por 7 y que sean menores que 100.


public class DivisiblesPorSiete {
    public static void main(String[] args) {
        // Máximo valor a considerar
        int limite = 100;

        // Variable para iterar desde 1 hasta el límite
        int i = 1;

        System.out.println("Numeros menores que " + limite + " y divisibles por 7:");

        // Bucle para identificar los números divisibles por 7
        while (i < limite) {
            // Si el número es divisible por 7, se muestra en pantalla
            if (i % 7 == 0) {
                System.out.println(i);
            }
            i++;  // Incrementa el contador para la próxima iteración
        }
    }
}
