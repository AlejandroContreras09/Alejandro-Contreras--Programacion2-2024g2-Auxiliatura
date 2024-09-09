package Class;

import java.util.HashMap;

public class Agenda {
    private HashMap<String, Contacto> contactos;

    public Agenda() {
        this.contactos = new HashMap<>();
    }

    public void agregarContacto(Contacto contacto) {
        if (contactos.containsKey(contacto.getEmail())) {
            System.out.println("El contacto ya existe.");
        } else {
            contactos.put(contacto.getEmail(), contacto);
            System.out.println("Contacto agregado.");
        }
    }

    public void verContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            for (Contacto contacto : contactos.values()) {
                System.out.println(contacto);
            }
        }
    }

    public void buscarContacto(String email) {
        if (contactos.containsKey(email)) {
            System.out.println(contactos.get(email));
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void borrarContacto(String email) {
        if (contactos.containsKey(email)) {
            contactos.remove(email);
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }
}
