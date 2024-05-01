package gorena.soft.dessignpatterns.comportamiento.iteratorv2.implementaciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import gorena.soft.dessignpatterns.comportamiento.iteratorv2.interfaces.Iterarador;

public class Mapas implements Iterarador {

    private int posicionActual = 0;

    HashMap map = new HashMap();

    @Override
    public void elimina(int posicion) {
        HashMap mapTemporal = new HashMap<>();
        // Se redimensiona el mapa
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, String> elemento = iterator.next();
            if (Integer.valueOf(elemento.getKey()) != posicion) {
                this.posicionActual++;
                mapTemporal.put(posicionActual, elemento.getValue());
            }
        }
        map = mapTemporal;
    }

    @Override
    public void adiciona(String elemento) {
        posicionActual++;
        map.put(String.valueOf(posicionActual), elemento);
    }

    @Override
    public String irPosicion(int posicion) {
        String valorActual;
        posicionActual = posicion;
        valorActual = (String) map.get(String.valueOf(posicion));
        return valorActual;
    }

    @Override
    public String siguiente() {
        if (this.haySiguiente()) {
            this.posicionActual++;
            return irPosicion(posicionActual);
        }
        return null;
    }

    @Override
    public String ultimo() {
        this.posicionActual = map.size();
        return (String) map.get(String.valueOf(posicionActual));
    }

    @Override
    public String primero() {
        this.posicionActual = 1;
        return irPosicion(posicionActual);
    }

    @Override
    public boolean haySiguiente() {
        return this.posicionActual <= map.size();
    }

    @Override
    public List<String> obtieneListado() {
        List<String> resultado = new ArrayList<String>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, String> elemento = iterator.next();
            resultado.add(elemento.getValue());
        }
        return resultado;
    }

}
