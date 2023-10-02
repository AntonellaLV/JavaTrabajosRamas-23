// 5. Restalos, prohibido menores a ceros: Cree dos arreglos con números decimales,
// luego recortarlos y reste ambos arreglos el resultado aplicarlos a un tercer arreglo,
// si la resta da negativo entonces guarde 0.

public class RestarArreglos {
    public static void main(String[] args) {
        // Definir dos arreglos de números con punto decimal
        double[] arreglo1 = {5.6, 2.3, 9.8, 3.1, 7.4};
        double[] arreglo2 = {1.5, 3.3, 4.8, 6.1, 2.2};

        // Asegurar que ambos arreglos tengan la misma longitud
        if (arreglo1.length != arreglo2.length) {
            System.out.println("Los arreglos no tienen la misma longitud.");
            return;
        }

        // Crear un tercer arreglo para almacenar los resultados
        double[] resultado = new double[arreglo1.length];

        // Recorrer ambos arreglos, restarlos y guardar el resultado en el tercer arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            double resta = arreglo1[i] - arreglo2[i];
            if (resta < 0) {
                resultado[i] = 0;
            } else {
                resultado[i] = resta;
            }
        }

        // Mostrar el resultado en pantalla
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }
}
