package InicialJavaJedi;

// 1. Crear una clase alumno, el cual tenga atributos como :
// a. Nombre
// b. Apellido
// c. Fecha de nacimiento
// d. Edad
// Luego cree 3 objetos de la clase e imprima por pantalla el nombre, apellido y edad de cada uno.

public class Alumno {

    // Atributos de la clase Alumno. Estos son los datos que guardaremos para cada alumno.
    String nombre;
    String apellido;
    String fechaNacimiento;
    int edad;

    // Constructor de la clase Alumno.
    // Se llama cuando creamos un nuevo objeto de tipo Alumno.
    // Inicializa los atributos del objeto con los valores proporcionados.
    public Alumno(String nombre, String apellido, String fechaNacimiento, int edad) {
        this.nombre = nombre;             // Inicializamos el atributo nombre.
        this.apellido = apellido;         // Inicializamos el atributo apellido.
        this.fechaNacimiento = fechaNacimiento; // Inicializamos el atributo fechaNacimiento.
        this.edad = edad;                 // Inicializamos el atributo edad.
    }

    // Método para imprimir los datos del alumno en consola.
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);             // Imprimimos el nombre.
        System.out.println("Apellido: " + apellido);         // Imprimimos el apellido.
        System.out.println("Edad: " + edad);                 // Imprimimos la edad.
        System.out.println("----------------------");        // Línea separadora para mejor visualización.
    }

    // Método principal del programa. Es el punto de inicio cuando ejecutamos el código.
    public static void main(String[] args) {
        // Creamos tres objetos de tipo Alumno, es decir, tres alumnos.
        Alumno alumno1 = new Alumno("Juan", "Pérez", "15/05/2000", 23);
        Alumno alumno2 = new Alumno("Ana", "López", "10/03/2002", 21);
        Alumno alumno3 = new Alumno("Carlos", "Rodríguez", "20/07/1999", 24);

        // Usamos el método imprimirDatos para mostrar la información de cada alumno.
        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();
    }
}
