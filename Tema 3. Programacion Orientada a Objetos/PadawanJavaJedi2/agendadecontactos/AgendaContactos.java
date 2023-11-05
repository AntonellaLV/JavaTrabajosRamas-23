package PadawanJavaJedi2.agendadecontactos;

import java.util.LinkedList;
import java.util.List;

public class AgendaContactos {
    private List<Contacto> contactos;

    public AgendaContactos() {
        this.contactos = new LinkedList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void eliminarContacto(String nombre) {
        contactos.removeIf(contacto -> contacto.getNombre().equals(nombre));
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;  // no se encontró el contacto
    }

    public List<Contacto> mostrarContactos() {
        return contactos;
    }
}

