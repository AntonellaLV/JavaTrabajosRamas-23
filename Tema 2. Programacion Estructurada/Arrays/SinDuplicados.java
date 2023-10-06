// 4.Escribe un programa que tome un arreglo de enteros y cree un arreglo con elementos únicos.
// removeDuplicates({1, 1, 2, 2, 3, 4, 5})
// Output : [1, 2, 3, 4, 5]


public class SinDuplicados {

    public static void main(String[] args) {
        int[] miArreglo = {1, 1, 2, 2, 3, 4, 5};
        int[] resultado = removerDuplicados(miArreglo);
        
        // Imprimir el resultado
        System.out.print("Salida: [");
        for(int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if(i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] removerDuplicados(int[] arreglo) {
        int[] temporal = new int[arreglo.length];
        int j = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] != arreglo[i + 1]) {
                temporal[j++] = arreglo[i];
            }
        }
        temporal[j++] = arreglo[arreglo.length - 1];
        
        int[] sinDuplicados = new int[j];
        for (int i = 0; i < j; i++) {
            sinDuplicados[i] = temporal[i];
        }
        
        return sinDuplicados;
    }
}
