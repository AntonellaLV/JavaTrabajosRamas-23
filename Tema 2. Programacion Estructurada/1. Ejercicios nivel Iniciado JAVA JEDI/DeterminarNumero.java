// 4. De que se trata esto? : Realizar un programa que guarde un número en memoria y
// determine si es positivo, negativo o cero.


public class DeterminarNumero {
    public static void main(String[] args) {
        // Definimos y guardamos un número en memoria
        int numero = 10; // Puedes cambiar este valor para probar con diferentes números

        // Usamos la estructura if-else para determinar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
    }
}
