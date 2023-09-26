// 2. Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
// esa cantidad mostrando el nombre de cada amigo.

public class MisAmigos {
    public static void main(String[] args) {
        // Definimos variables individuales para cada amigo
        String amigo1 = "Juan";
        String amigo2 = "Maria";
        String amigo3 = "Pedro";
        String amigo4 = "Ana";
        String amigo5 = "Luis";

        // Inicializamos una variable para controlar el flujo con el bucle while
        int i = 1;

        // Usamos un bucle while para mostrar cada amigo
        while (i <= 5) {
            switch (i) {
                case 1:
                    System.out.println(amigo1);
                    break;
                case 2:
                    System.out.println(amigo2);
                    break;
                case 3:
                    System.out.println(amigo3);
                    break;
                case 4:
                    System.out.println(amigo4);
                    break;
                case 5:
                    System.out.println(amigo5);
                    break;
            }
            
            // Incrementamos el valor de i para el siguiente ciclo
            i++;
        }
    }
}
