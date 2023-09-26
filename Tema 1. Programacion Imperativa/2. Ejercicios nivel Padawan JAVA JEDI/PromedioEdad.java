// 4. Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
// edad y los nombres de esas personas, luego saque su promedio e imprima por
// pantalla el nombre de la persona y su edad. Por último imprimir el promedio de sus edades.

public class PromedioEdad {
    public static void main(String[] args) {
        // Definimos las edades y los nombres de las personas
        int edad1 = 25;
        String nombre1 = "Juan";
        
        int edad2 = 30;
        String nombre2 = "Maria";
        
        int edad3 = 22;
        String nombre3 = "Carlos";
        
        // Calculamos el promedio de las edades
        double promedioEdades = (edad1 + edad2 + edad3) / 3.0; // Usamos 3.0 para obtener un resultado decimal
        
        // Imprimimos los nombres y edades de las personas
        System.out.println("Nombre: " + nombre1 + ", Edad: " + edad1);
        System.out.println("Nombre: " + nombre2 + ", Edad: " + edad2);
        System.out.println("Nombre: " + nombre3 + ", Edad: " + edad3);
        
        // Imprimimos el promedio de las edades
        System.out.println("Promedio de Edades: " + promedioEdades);
    }
}
