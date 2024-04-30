package gorena.soft.dessignpatterns.comportamiento.iterator;

import gorena.soft.dessignpatterns.comportamiento.iterator.entity.Perfil;
import gorena.soft.dessignpatterns.comportamiento.iterator.interfaces.PerfilIterator;
import gorena.soft.dessignpatterns.comportamiento.iterator.interfaces.RedSocial;

public class SocialSpammer {
    public RedSocial redSocial;
    public PerfilIterator perfilIterator;

    public SocialSpammer(RedSocial redSocial) {
        this.redSocial = redSocial;
    }

    public void enviarSpamAmigos(String perfilEmail, String mensaje) {
        System.out.println("Iterando sobre amigos");
        perfilIterator = redSocial.crearAmigosIterator(perfilEmail);
        while (perfilIterator.tieneSiguiente()) {
            Perfil perfil = perfilIterator.getSiguiente();
            enviaMensaje(perfilEmail, mensaje);

        }
    }

    public void enviarSpamColaboradores(String perfilEmail, String mensaje) {
        System.out.println("Iterando sobre colaboradores");
        perfilIterator = redSocial.crearColaboradoresIterator(perfilEmail);
        while (perfilIterator.tieneSiguiente()) {
            Perfil perfil = perfilIterator.getSiguiente();
            enviaMensaje(perfilEmail, mensaje);

        }
    }

    public void enviaMensaje(String email, String message) {
        System.out.println("Enviar mensaje a : '" + email + "'. Con el mensaje '" + message + "'");
    }

}
