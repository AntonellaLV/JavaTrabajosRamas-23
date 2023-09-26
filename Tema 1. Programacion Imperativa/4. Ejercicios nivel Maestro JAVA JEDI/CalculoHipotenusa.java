// 3. Cálculo de la hipotenusa de un triángulo:
// Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
// dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
// hipotenusa, a y b son los catetos.

public class CalculoHipotenusa {
    public static void main(String[] args) {
        // Definimos los valores de los catetos
        double catetoA = 3.0; // Cambiar al valor del primer cateto deseado
        double catetoB = 4.0; // Cambiar al valor del segundo cateto deseado

        // Calculamos la hipotenusa utilizando la fórmula h^2 = a^2 + b^2
        double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);

        // Mostramos el resultado por pantalla
        System.out.println("Cateto A: " + catetoA);
        System.out.println("Cateto B: " + catetoB);
        System.out.println("Hipotenusa: " + hipotenusa);
    }
}

