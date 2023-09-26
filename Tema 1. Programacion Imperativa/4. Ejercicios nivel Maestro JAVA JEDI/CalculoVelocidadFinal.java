// 6. Cálculo de la velocidad final: Escribir un programa en Java que calcule la velocidad final
// de un objeto en caída libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo transcurrido.
// Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final,
// v_i es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo transcurrido.

public class CalculoVelocidadFinal {
    public static void main(String[] args) {
        // Definimos las variables
        double velocidadInicial = 0.0; // Cambiar al valor de la velocidad inicial deseada en m/s
        double aceleracionGravedad = 9.81; // Aceleración de la gravedad en m/s^2
        double tiempoTranscurrido = 5.0; // Cambiar al valor del tiempo deseado en segundos

        // Calculamos la velocidad final utilizando la fórmula v_f = v_i + g * t
        double velocidadFinal = velocidadInicial + aceleracionGravedad * tiempoTranscurrido;

        // Mostramos el resultado por pantalla
        System.out.println("Velocidad Inicial: " + velocidadInicial + " m/s");
        System.out.println("Aceleracion de la Gravedad: " + aceleracionGravedad + " m/s^2");
        System.out.println("Tiempo Transcurrido: " + tiempoTranscurrido + " segundos");
        System.out.println("Velocidad Final: " + velocidadFinal + " m/s");
    }
}
