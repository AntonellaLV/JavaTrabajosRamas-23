// 3. Suma de números: Realizar un programa que guarde un número en memoria y determine si es par o impar.

public class NumeroParImpar {
    public static void main(String[] args) {
        // Definimos y guardamos un número en memoria
        int numero = 7; // Puedes cambiar este valor para probar con diferentes números

        // Usamos la estructura if-else para determinar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
    }
}
