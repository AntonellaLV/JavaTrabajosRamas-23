// 1.Escribe un programa que tome un array y cree otro array que contenga solo los elementos del medio,
// es decir, eliminando el primer y último elemento.
// myArray = [1, 2, 3, 4]
// middle(myArray)  # [2,3]


public class ArrayProcessing {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6};

        // Si el array tiene 2 elementos o menos, no hay elementos intermedios
        if (originalArray.length <= 2) {
            System.out.println("[]");
            return;
        }

        int[] processedArray = new int[originalArray.length - 2];

        for (int i = 1; i < originalArray.length - 1; i++) {
            processedArray[i - 1] = originalArray[i];
        }

        // Imprimir el resultado
        System.out.print("[");
        for (int i = 0; i < processedArray.length; i++) {
            System.out.print(processedArray[i]);
            if (i != processedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
