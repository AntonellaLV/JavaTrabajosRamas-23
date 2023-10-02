// 1. Dame los mayores y los menores: Dado un arreglo con valores enteros, realice la
// búsqueda de ese entero, si encontró el entero mostrarlo por pantalla sino muestre
// por pantalla que no lo encontró.

public class BusquedaEntero {
    
    public static void main(String[] args) {
        int[] arreglo = {10, 23, 45, 78, 89, 56};
        int valorABuscar = 45;  // Puedes cambiar este valor para probar con otros números.

        buscarEntero(arreglo, valorABuscar);
    }

    public static void buscarEntero(int[] arreglo, int valor) {
        boolean encontrado = false;

        // Recorremos el arreglo en busca del valor
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                encontrado = true;
                break;  // Si encontramos el valor, salimos del bucle.
            }
        }

        // Mostramos el resultado
        if (encontrado) {
            System.out.println("El valor " + valor + " fue encontrado en el arreglo.");
        } else {
            System.out.println("El valor " + valor + " no fue encontrado en el arreglo.");
        }
    }
}
