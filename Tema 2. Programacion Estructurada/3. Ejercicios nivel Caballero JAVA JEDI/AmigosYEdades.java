// 3. Mis amigos, su edad y el mayor : Guarda en un arreglo una N cantidad de amigos,
// itere sobre esa cantidad mostrando el nombre de cada amigo si y sólo si este amigo
// es mayor de edad, en caso de ser menor de edad imprima un mensaje diciendole a
// ese amigo porque no lo muestra por pantalla. Pero a su vez, encuentre al amigo que
// mayor edad tenga, muestre un mensaje por pantalla del nombre de esa persona y su edad.

public class AmigosYEdades {
    public static void main(String[] args) {
        // Arreglos para almacenar nombres y edades de los amigos.
        String[] nombres = {"Juan", "Maria", "Carlos", "Lucia", "Manuel"};
        int[] edades = {17, 22, 19, 15, 24};

        int indiceAmigoMayor = 0; // Asumimos que el primer amigo es el de mayor edad

        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + ": es mayor de edad.");
            } else {
                System.out.println(nombres[i] + ": eres menor de edad, por eso no mostramos mas informacion.");
            }

            // Comprobamos si el amigo actual es mayor que el amigoMayor registrado hasta ahora
            if (edades[i] > edades[indiceAmigoMayor]) {
                indiceAmigoMayor = i;
            }
        }

        System.out.println("\nEl amigo con la mayor edad es " + nombres[indiceAmigoMayor] + " con " + edades[indiceAmigoMayor] + " años.");
    }
}
