// 4. Ordenarlo todo : Realizar un programa que guarde cierta cantidad de números con
// punto decimal en un arreglo. Luego, el programa debe ordenar los números de
// forma ascendente y mostrarlos en pantalla.

import java.util.Arrays;

public class OrdenarDecimales {
    public static void main(String[] args) {
        // Definir un arreglo de números con punto decimal
        double[] numeros = {5.6, 2.3, 9.8, 3.1, 7.4};

        // Ordenar el arreglo de forma ascendente
        Arrays.sort(numeros);

        // Mostrar los números ordenados en pantalla
        for (double num : numeros) {
            System.out.println(num);
        }
    }
}

