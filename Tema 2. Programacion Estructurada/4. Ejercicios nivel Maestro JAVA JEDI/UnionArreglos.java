// 2. Unión de dos arreglos : Dado dos arreglos con cualquier tipo de valor (Ya sea
// String, Char, Integer, etc), realice la unión de ambos arreglos en un tercer arreglo.

public class UnionArreglos {
    
    public static void main(String[] args) {
        String[] arregloStr1 = {"Hola", "Mundo"};
        String[] arregloStr2 = {"Buenos", "dias"};
        
        String[] unionString = unirArreglosStrings(arregloStr1, arregloStr2);
        for (String valor : unionString) {
            System.out.print(valor + " ");
        }

        System.out.println();
        
        Integer[] arregloInt1 = {1, 2, 3};
        Integer[] arregloInt2 = {4, 5, 6};
        
        Integer[] unionInt = unirArreglosIntegers(arregloInt1, arregloInt2);
        for (Integer valor : unionInt) {
            System.out.print(valor + " ");
        }
    }
    
    public static String[] unirArreglosStrings(String[] arreglo1, String[] arreglo2) {
        int length = arreglo1.length + arreglo2.length;
        String[] union = new String[length];

        for (int i = 0; i < arreglo1.length; i++) {
            union[i] = arreglo1[i];
        }

        for (int i = 0; i < arreglo2.length; i++) {
            union[i + arreglo1.length] = arreglo2[i];
        }
        
        return union;
    }

    public static Integer[] unirArreglosIntegers(Integer[] arreglo1, Integer[] arreglo2) {
        int length = arreglo1.length + arreglo2.length;
        Integer[] union = new Integer[length];

        for (int i = 0; i < arreglo1.length; i++) {
            union[i] = arreglo1[i];
        }

        for (int i = 0; i < arreglo2.length; i++) {
            union[i + arreglo1.length] = arreglo2[i];
        }
        
        return union;
    }
}

