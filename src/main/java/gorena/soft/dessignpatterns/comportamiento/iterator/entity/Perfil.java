package gorena.soft.dessignpatterns.comportamiento.iterator.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Perfil {

    private String nombre;
    private String email;
    private HashMap<String, List<String>> contactos = new HashMap<>();

    public Perfil(String email, String nombre, String... contacts) {
        this.nombre = nombre;
        this.email = email;

        for (String contacto : contacts) {
            String[] partes = contacto.split(":");
            String tipoContacto = "friends";
            String emailContacto;
            if (partes.length == 1) {
                emailContacto = partes[0];
            } else {
                tipoContacto = partes[0];
                emailContacto = partes[1];
            }
            if (!this.contactos.containsKey(tipoContacto)) {
                this.contactos.put(tipoContacto, new ArrayList<>());
            }
            this.contactos.get(tipoContacto).add(emailContacto);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> obtContactos(String tipoContacto) {
        if (!this.contactos.containsKey(tipoContacto)) {
            this.contactos.put(tipoContacto, new ArrayList<>());
        }
        return contactos.get(tipoContacto);
    }
}
