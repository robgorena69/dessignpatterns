package gorena.soft.dessignpatterns.comportamiento.iterator.interfaces;

public interface RedSocial {
    PerfilIterator crearAmigosIterator(String perfilEmail);

    PerfilIterator crearColaboradoresIterator(String perfilEmail);

}
