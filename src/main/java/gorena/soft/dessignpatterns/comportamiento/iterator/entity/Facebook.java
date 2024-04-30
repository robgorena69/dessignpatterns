package gorena.soft.dessignpatterns.comportamiento.iterator.entity;

import java.util.ArrayList;
import java.util.List;

import gorena.soft.dessignpatterns.comportamiento.iterator.implementacion.FacebookIterator;
import gorena.soft.dessignpatterns.comportamiento.iterator.interfaces.PerfilIterator;
import gorena.soft.dessignpatterns.comportamiento.iterator.interfaces.RedSocial;

public class Facebook implements RedSocial {

    private List<Perfil> perfiles;

    public Facebook(List<Perfil> cache) {
        if (cache != null) {
            this.perfiles = cache;
        } else {
            this.perfiles = new ArrayList<>();
        }
    }

    public Perfil solicitarPerfilDeFacebook(String perfilEmail) {
        this.simulateNetworkLatency();
        System.out.println("Facebook: buscando el perfil de " + perfilEmail + " sobre la red");
        return encuentraPerfil(perfilEmail);

    }

    private Perfil encuentraPerfil(String perfilEmail) {
        for (Perfil perfil : perfiles) {
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

    public List<String> solicitaPerfilAmigosDeFacebook(String perfilEmail, String tipoContacto) {
        this.simulateNetworkLatency();
        System.out.println("Facebook: buscando " + tipoContacto + " listado de " + perfilEmail + " sobre la red ....");
        Perfil perfil = encuentraPerfil(perfilEmail);
        if (perfil != null) {
            return perfil.obtContactos(tipoContacto);
        }
        return null;
    }

    @Override
    public PerfilIterator crearAmigosIterator(String perfilEmail) {
        return new FacebookIterator(this, "friends", perfilEmail);
    }

    @Override
    public PerfilIterator crearColaboradoresIterator(String perfilEmail) {
        return new FacebookIterator(this, "coworkers", perfilEmail);
    }

}
