// 10. Menú de opciones parte 2: Realice un menú de opciones con bucle WHILE, donde
// la opción se guarde en una variable (Sin pedir por teclado), muestre la opción
// elegida y fuerce su salida bucle.

public class MenuOpciones2 {
    public static void main(String[] args) {
        int opcion = 3;  // Puedes cambiar este valor para elegir diferentes opciones
        boolean mostrarMenu = true;

        while (mostrarMenu) {
            System.out.println("Menu de opciones:");
            System.out.println("1. Ver perfil");
            System.out.println("2. Configuracion");
            System.out.println("3. Cerrar sesion");
            System.out.println("Elegiste la opcion: " + opcion);
            
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opcion 1: Ver perfil.");
                    mostrarMenu = false;  // Finalizar el bucle
                    break;
                case 2:
                    System.out.println("Has elegido la opcion 2: Configuracion.");
                    mostrarMenu = false;  // Finalizar el bucle
                    break;
                case 3:
                    System.out.println("Has elegido la opcion 3: Cerrar sesion.");
                    mostrarMenu = false;  // Finalizar el bucle
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    mostrarMenu = false;  // Finalizar el bucle
                    break;
            }
        }
    }
}
