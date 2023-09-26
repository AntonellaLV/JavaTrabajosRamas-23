// 4. Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los sumen.
// Determine si el primer número es divisible por el segundo número y muestre el resultado.

public class CalculoDeDivisibilidad {
    public static void main(String[] args) {
        int numero1 = 10; // Cambiar por el primer número deseado
        int numero2 = 5;  // Cambiar por el segundo número deseado

        int suma = numero1 + numero2;
        int residuo = numero1 % numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + suma);
        
        if (residuo == 0) {
            System.out.println(numero1 + " es divisible por " + numero2);
        } else {
            System.out.println(numero1 + " no es divisible por " + numero2);
        }
    }
}
