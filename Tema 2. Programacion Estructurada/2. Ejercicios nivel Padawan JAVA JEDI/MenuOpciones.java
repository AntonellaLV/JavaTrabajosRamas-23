// 9. Menú de opciones : Realice un menú de opciones, donde la opción se guarde en
// una variable (Sin pedir por teclado), muestre la opción elegida y fuerce su salida bucle.

public class MenuOpciones {
    public static void main(String[] args) {
        int opcion = 3;  // Puedes cambiar este valor para elegir diferentes opciones

        boolean continuar = true; // Controla el bucle

        while (continuar) {
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opcion 1: Ver perfil.");
                    continuar = false;  // Finalizar el bucle
                    break;
                case 2:
                    System.out.println("Has elegido la opcion 2: Configuracion.");
                    continuar = false;  // Finalizar el bucle
                    break;
                case 3:
                    System.out.println("Has elegido la opcion 3: Cerrar sesion.");
                    continuar = false;  // Finalizar el bucle
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    continuar = false;  // Finalizar el bucle
                    break;
            }
        }
    }
}
