package gorena.soft.dessignpatterns.comportamiento.iterator.implementacion;

import java.util.ArrayList;
import java.util.List;

import gorena.soft.dessignpatterns.comportamiento.iterator.entity.Facebook;
import gorena.soft.dessignpatterns.comportamiento.iterator.entity.Perfil;
import gorena.soft.dessignpatterns.comportamiento.iterator.interfaces.PerfilIterator;

public class FacebookIterator implements PerfilIterator {

    private Facebook facebook;
    private String tipo;
    private String email;
    private int posicionActual = 0;
    private List<String> emails = new ArrayList<>();
    private List<Perfil> perfiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String tipo, String email) {
        this.facebook = facebook;
        this.tipo = tipo;
        this.email = email;
    }

    private void lazyload() {
        if (emails.size() == 0) {
            List<String> perfiles = facebook.solicitaPerfilAmigosDeFacebook(email, tipo);
            for (String perfil : perfiles) {
                this.emails.add(perfil);
                this.perfiles.add(null);
            }
        }
    }

    @Override
    public Perfil getSiguiente() {
        if (!tieneSiguiente()) {
            return null;
        }

        String amigoEmail = emails.get(posicionActual);
        Perfil amigoPerfil = perfiles.get(posicionActual);
        if (amigoPerfil == null) {
            amigoPerfil = facebook.solicitarPerfilDeFacebook(amigoEmail);
            perfiles.set(posicionActual, amigoPerfil);
        }
        posicionActual++;
        return amigoPerfil;
    }

    @Override
    public boolean tieneSiguiente() {
        lazyload();
        return posicionActual < emails.size();
    }

    @Override
    public void resetear() {
        this.posicionActual = 0;
    }

}
