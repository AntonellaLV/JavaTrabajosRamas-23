// 6. A mi me gustan los pares: Escribe un programa que imprima solo los N números pares,
// donde los N números son guardados en variables o constantes según corresponda.

public class NumerosPares {
    public static void main(String[] args) {
        // Definimos y guardamos los N números en variables individuales
        int num1 = 7;
        int num2 = 12;
        int num3 = 25;
        int num4 = 44;
        int num5 = 78;

        System.out.println("Numeros pares entre los valores dados:");

        // Comprobamos y mostramos si cada número es par
        if (num1 % 2 == 0) System.out.println(num1);
        if (num2 % 2 == 0) System.out.println(num2);
        if (num3 % 2 == 0) System.out.println(num3);
        if (num4 % 2 == 0) System.out.println(num4);
        if (num5 % 2 == 0) System.out.println(num5);
    }
}
