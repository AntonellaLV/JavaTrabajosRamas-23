// 1. Eliminación de un elemento: Dado un arreglo con valores enteros, realice la
// búsqueda de ese entero y si lo encuentra eliminarlo, si no lo encuentra informe por pantalla.

public class EliminarElemento {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int numeroAEliminar = 30;  // Cambia este valor para probar con otros números

        int[] nuevoArr = eliminarElemento(arr, numeroAEliminar);

        if (nuevoArr.length == arr.length) {
            System.out.println("El numero " + numeroAEliminar + " no fue encontrado.");
        } else {
            System.out.println("Arreglo despues de eliminar " + numeroAEliminar + ":");
            for (int i = 0; i < nuevoArr.length; i++) {
                System.out.print(nuevoArr[i] + " ");
            }
        }
    }

    public static int[] eliminarElemento(int[] arr, int elemento) {
        int indice = -1;

        // Buscar el índice del elemento en el arreglo
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elemento) {
                indice = i;
                break;
            }
        }

        // Si el elemento no se encontró, regresar el mismo arreglo
        if (indice == -1) {
            return arr;
        }

        // Si el elemento se encontró, crear un nuevo arreglo sin ese elemento
        int[] nuevoArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != indice) {
                nuevoArr[j++] = arr[i];
            }
        }

        return nuevoArr;
    }
}
