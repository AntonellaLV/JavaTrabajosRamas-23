// 3. Dado un array, escribe un programa que tome el primer y el segundo mejor valor y lo devuelva en un nuevo arreglo.
// myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
// firstSecond(myArray) // {90, 87}


public class DosMayores {

    public static void main(String[] args) {
        int[] miArreglo = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        int[] resultado = primerYsegundo(miArreglo);
        System.out.println("Los dos mejores valores son: [" + resultado[0] + ", " + resultado[1] + "]");
    }

    public static int[] primerYsegundo(int[] arreglo) {
        int primero = Integer.MIN_VALUE;
        int segundo = Integer.MIN_VALUE;

        for (int num : arreglo) {
            if (num > primero) {
                segundo = primero;
                primero = num;
            } else if (num > segundo) {
                segundo = num;
            }
        }
        
        return new int[] {primero, segundo};
    }
}
