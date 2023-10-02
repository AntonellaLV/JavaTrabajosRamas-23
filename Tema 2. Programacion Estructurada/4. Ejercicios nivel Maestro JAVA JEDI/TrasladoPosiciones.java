// 3. Trasladar posiciones en un arreglo: Dado un arreglo de enteros, una posición del
// arreglo y la cantidad de N traslados a hacer en un arreglo. Lo que debe hacer es
// tomar el elemento de la posición del arreglo y trasladarlo N cantidad de veces, si el
// traslado es mayor al tamaño del arreglo informar por pantalla.

public class TrasladoPosiciones {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int posicion = 4; // Puedes cambiar este valor
        int traslados = 3; // Puedes cambiar este valor

        trasladar(arreglo, posicion, traslados);
    }

    public static void trasladar(int[] arreglo, int posicion, int traslados) {
        // Verificar si la posición es válida
        if (posicion < 0 || posicion >= arreglo.length) {
            System.out.println("Posicion fuera de los limites del arreglo.");
            return;
        }

        // Calculamos la nueva posición
        int nuevaPosicion = posicion + traslados;

        // Verificar si la nueva posición es válida
        if (nuevaPosicion < 0 || nuevaPosicion >= arreglo.length) {
            System.out.println("Traslado no permitido. Saldria fuera de los limites del arreglo.");
            return;
        }

        // Realizar el traslado
        int valorTraslado = arreglo[posicion];
        if (traslados > 0) {
            for (int i = posicion; i < nuevaPosicion; i++) {
                arreglo[i] = arreglo[i + 1];
            }
        } else {
            for (int i = posicion; i > nuevaPosicion; i--) {
                arreglo[i] = arreglo[i - 1];
            }
        }
        arreglo[nuevaPosicion] = valorTraslado;

        // Mostrar el arreglo trasladado
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
    }
}
