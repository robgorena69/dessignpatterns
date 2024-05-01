package gorena.soft.dessignpatterns.comportamiento.iteratorv2.implementaciones;

import java.util.ArrayList;
import java.util.List;

import gorena.soft.dessignpatterns.comportamiento.iteratorv2.interfaces.Iterarador;

public class Lista implements Iterarador {

    private List<String> valores = new ArrayList<>();
    private int posicionActual = 0;

    public Lista(List<String> valores) {
        this.valores = valores;
    }

    public Lista() {
        valores = new ArrayList<>();
    }

    @Override
    public String irPosicion(int posicion) {
        this.posicionActual = posicion - 1;
        return this.valores.get(posicionActual);
    }

    @Override
    public String siguiente() {
        if (haySiguiente()) {
            this.posicionActual++;
            this.posicionActual++;
        }
        return this.irPosicion(posicionActual);
    }

    @Override
    public String ultimo() {
        posicionActual = this.valores.size();
        return irPosicion(posicionActual);
    }

    @Override
    public String primero() {
        this.posicionActual = 0;
        return this.valores.get(posicionActual);
    }

    @Override
    public boolean haySiguiente() {
        return this.posicionActual <= this.valores.size() - 1;
    }

    @Override
    public void elimina(int posicion) {
        this.valores.remove(posicion - 1);
    }

    @Override
    public void adiciona(String elemento) {
        this.valores.add(elemento);

    }

    @Override
    public List<String> obtieneListado() {
        return this.valores;
    }

}
