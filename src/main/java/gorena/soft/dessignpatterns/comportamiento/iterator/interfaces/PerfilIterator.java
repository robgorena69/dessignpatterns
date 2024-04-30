package gorena.soft.dessignpatterns.comportamiento.iterator.interfaces;

import gorena.soft.dessignpatterns.comportamiento.iterator.entity.Perfil;

public interface PerfilIterator {

    Perfil getSiguiente();

    boolean tieneSiguiente();

    void resetear();
}
