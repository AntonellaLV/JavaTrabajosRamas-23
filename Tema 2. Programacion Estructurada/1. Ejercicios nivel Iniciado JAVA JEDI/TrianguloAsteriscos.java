// 1. Triangulo de asteriscos : Se le solicita que creen un programa 
// que imprima un triángulo de asteriscos en la consola. Usar bucles.

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        int altura = 5; // Puedes cambiar este valor para ajustar la altura del triángulo
        int i = 0;

        while (i < altura) {
            int j = 0;

            // Imprime espacios y asteriscos en un solo bucle
            while (j < altura + i) {
                if (j < altura - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
            }

            // Salto de línea para la siguiente fila
            System.out.println();
            
            i++;
        }
    }
}
