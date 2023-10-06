//2.Dado un array en 2D calcula la suma de los elementos en diagonal

// myArray2D= { 
//    {1,2,3},
//    {4,5,6},
//    {7,8,9} 
// };

public class SumaDiagonal {

    public static void main(String[] args) {
        int[][] myArray2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int suma = diagonalSum(myArray2D);
        System.out.println("La suma de la diagonal es: " + suma);
    }

    public static int diagonalSum(int[][] array) {
        int suma = 0;

        
        for (int i = 0; i < array.length; i++) {
            suma += array[i][i];
        }

        return suma;
    }
}
