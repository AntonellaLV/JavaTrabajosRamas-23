// 7. Cálculo de la fuerza centrípeta: Escribir un programa en Java que calcule la fuerza centrípeta necesaria
// para mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular y el radio de la trayectoria.
// Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la fuerza centrípeta, m es la masa del objeto,
// v es la velocidad angular y r es el radio de la trayectoria. Muestre el resultado por pantalla.

public class CalculoFuerzaCentripeta {
    public static void main(String[] args) {
        // Definimos las variables
        double masa = 5.0; // Cambiar al valor de la masa deseada en kilogramos
        double velocidadAngular = 10.0; // Cambiar al valor de la velocidad angular deseada en radianes por segundo
        double radio = 3.0; // Cambiar al valor del radio deseado en metros

        // Calculamos la fuerza centrípeta utilizando la fórmula F_c = m * v^2 / r
        double fuerzaCentripeta = (masa * Math.pow(velocidadAngular, 2)) / radio;

        // Mostramos el resultado por pantalla
        System.out.println("Masa del Objeto: " + masa + " kg");
        System.out.println("Velocidad Angular: " + velocidadAngular + " rad/s");
        System.out.println("Radio de la Trayectoria: " + radio + " m");
        System.out.println("Fuerza Centripeta Necesaria: " + fuerzaCentripeta + " N");
    }
}
