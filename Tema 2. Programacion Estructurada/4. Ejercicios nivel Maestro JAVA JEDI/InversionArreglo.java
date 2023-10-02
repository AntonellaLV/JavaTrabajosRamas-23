// 4. Inversión de un arreglo: Dado un arreglo de enteros inviertalo, de tal manera que
// el primer elemento ahora sea el último y así sucesivamente.

public class InversionArreglo {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        invertirArreglo(arreglo);
        
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
    }

    public static void invertirArreglo(int[] arreglo) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        while (inicio < fin) {
            // Intercambiar valores
            int temp = arreglo[inicio];
            arreglo[inicio] = arreglo[fin];
            arreglo[fin] = temp;
            
            // Mover los índices
            inicio++;
            fin--;
        }
    }
}
