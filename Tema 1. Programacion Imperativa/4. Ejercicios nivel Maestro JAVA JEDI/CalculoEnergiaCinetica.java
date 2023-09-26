// 5. Cálculo de la energía cinética: Escribir un programa en Java que calcule la energía cinética
// de un objeto en movimiento, dados su masa y su velocidad. Utilizar la fórmula: E = (1/2) * m * v^2,
// donde E es la energía cinética, m es la masa del objeto y v es la velocidad. Muestre el resultado por pantalla.

public class CalculoEnergiaCinetica {
    public static void main(String[] args) {
        // Definimos la masa del objeto en kilogramos
        double masa = 5.0; // Cambiar este valor según sea necesario

        // Definimos la velocidad del objeto en metros por segundo
        double velocidad = 10.0; // Cambiar este valor según sea necesario

        // Calculamos la energía cinética utilizando la fórmula E = (1/2) * m * v^2
        double energiaCinetica = (1.0 / 2.0) * masa * Math.pow(velocidad, 2);

        // Mostramos el resultado por pantalla
        System.out.println("Masa del objeto: " + masa + " kilogramos");
        System.out.println("Velocidad del objeto: " + velocidad + " metros por segundo");
        System.out.println("Energia Cinetica: " + energiaCinetica + " julios");
    }
}
