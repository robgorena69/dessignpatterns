package gorena.soft.dessignpatterns.comportamiento.iteratorv2.interfaces;

import java.util.List;

public interface Iterarador {

    public void elimina(int posicion);

    public void adiciona(String elemento);

    public String irPosicion(int posicion);

    public String siguiente();

    public String ultimo();

    public String primero();

    public boolean haySiguiente();

    public List<String> obtieneListado();

}
