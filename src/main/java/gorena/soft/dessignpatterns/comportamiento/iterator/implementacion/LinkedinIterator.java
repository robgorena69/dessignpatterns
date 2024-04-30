package gorena.soft.dessignpatterns.comportamiento.iterator.implementacion;

import java.util.ArrayList;
import java.util.List;

import gorena.soft.dessignpatterns.comportamiento.iterator.entity.LinkedIn;
import gorena.soft.dessignpatterns.comportamiento.iterator.entity.Perfil;
import gorena.soft.dessignpatterns.comportamiento.iterator.interfaces.PerfilIterator;

public class LinkedinIterator implements PerfilIterator {

    private LinkedIn linkedIn;
    private String tipo;
    private String email;
    private int posicionActual = 0;
    private List<String> emails = new ArrayList<>();
    private List<Perfil> contactos = new ArrayList<>();

    public LinkedinIterator(LinkedIn linkedIn, String tipo, String email) {
        this.linkedIn = linkedIn;
        this.tipo = tipo;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> perfiles = linkedIn.solicitaContactosRelacionadosDeLinkedInAPI(this.email, this.tipo);
            for (String perfil : perfiles) {
                this.emails.add(perfil);
                this.contactos.add(null);
            }
        }
    }

    @Override
    public Perfil getSiguiente() {
        if (!tieneSiguiente()) {
            return null;
        }

        String amigoEmail = emails.get(posicionActual);
        Perfil amigoContacto = contactos.get(posicionActual);
        if (amigoContacto != null) {
            amigoContacto = linkedIn.solicitaContactoInfoDeLinkedInApi(amigoEmail);
            contactos.set(posicionActual, amigoContacto);
        }
        posicionActual++;
        return amigoContacto;
    }

    @Override
    public boolean tieneSiguiente() {
        lazyLoad();
        return posicionActual < emails.size();
    }

    @Override
    public void resetear() {
        this.posicionActual = 0;
    }

}
