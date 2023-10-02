// 8. Mis amigos y su edad: Guarda en variables el nombre de N cantidad de amigos,
// itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si este
// amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje
// diciendole a ese amigo porque no lo muestra por pantalla.

public class AmigosYEdades {
    public static void main(String[] args) {
        // Datos de tres amigos (como ejemplo). Puedes agregar más o menos según tus necesidades.
        String amigo1 = "Juan";
        int edadAmigo1 = 29;

        String amigo2 = "Maria";
        int edadAmigo2 = 22;

        String amigo3 = "Pedro";
        int edadAmigo3 = 15;

        String amigo4 = "Luisa";
        int edadAmigo4 = 17;

        // Comprueba la edad de Juan
        if (edadAmigo1 >= 18) {
            System.out.println(amigo1);
        } else {
            System.out.println(amigo1 + " es menor de edad, por eso no lo mostramos en pantalla.");
        }

        // Comprueba la edad de Maria
        if (edadAmigo2 >= 18) {
            System.out.println(amigo2);
        } else {
            System.out.println(amigo2 + " es menor de edad, por eso no lo mostramos en pantalla.");
        }

        // Comprueba la edad de Pedro
        if (edadAmigo3 >= 18) {
            System.out.println(amigo3);
        } else {
            System.out.println(amigo3 + " es menor de edad, por eso no lo mostramos en pantalla.");
        }

        // Comprobando la edad de Luisa
        if (edadAmigo4 >= 18) {
            System.out.println(amigo4);
        } else {
            System.out.println(amigo4 + " es menor de edad, por eso no lo mostramos en pantalla.");
        }
    }
}
