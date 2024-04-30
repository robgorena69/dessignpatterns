package gorena.soft.dessignpatterns.comportamiento.iterator.entity;

import java.util.ArrayList;
import java.util.List;

import gorena.soft.dessignpatterns.comportamiento.iterator.implementacion.LinkedinIterator;
import gorena.soft.dessignpatterns.comportamiento.iterator.interfaces.PerfilIterator;
import gorena.soft.dessignpatterns.comportamiento.iterator.interfaces.RedSocial;

public class LinkedIn implements RedSocial {

    private List<Perfil> contactos;

    public LinkedIn(List<Perfil> cache) {
        if (cache != null) {
            this.contactos = cache;
        } else {
            this.contactos = new ArrayList<>();
        }
    }

    public Perfil solicitaContactoInfoDeLinkedInApi(String emailPerfil) {
        simulateNetworkLatency();
        System.out.println("LinkedIn: Buscando perfil " + emailPerfil + " sobre la red");
        return findContact(emailPerfil);
    }

    public List<String> solicitaContactosRelacionadosDeLinkedInAPI(String perfilEmail, String tipoContacto) {
        simulateNetworkLatency();
        System.out.println("LinkedIn: Cargando " + tipoContacto + " listado de " + perfilEmail + " sobre la red");

        Perfil perfil = findContact(perfilEmail);

        if (perfil != null) {
            return perfil.obtContactos(tipoContacto);
        }
        return null;
    }

    private Perfil findContact(String perfilEmail) {
        for (Perfil perfil : contactos) {
            if (perfil.getEmail().equals(perfilEmail)) {
                return perfil;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public PerfilIterator crearAmigosIterator(String perfilEmail) {
        return new LinkedinIterator(this, "friends", perfilEmail);
    }

    @Override
    public PerfilIterator crearColaboradoresIterator(String perfilEmail) {
        return new LinkedinIterator(this, "coworkers", perfilEmail);
    }

}
