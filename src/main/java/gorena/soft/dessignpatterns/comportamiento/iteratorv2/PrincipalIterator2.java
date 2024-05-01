package gorena.soft.dessignpatterns.comportamiento.iteratorv2;

import gorena.soft.dessignpatterns.comportamiento.iteratorv2.implementaciones.Lista;
import gorena.soft.dessignpatterns.comportamiento.iteratorv2.implementaciones.Mapas;
import gorena.soft.dessignpatterns.comportamiento.iteratorv2.interfaces.Iterarador;

public class PrincipalIterator2 {

    public static void main(String[] args) {
        Iterarador lista = new Lista();
        Iterarador mapa = new Mapas();
        lista.adiciona("Slipknot");
        lista.adiciona("Sic");
        lista.adiciona("surfacing");
        lista.adiciona("Spit Out");
        lista.adiciona("Tattered Torn");
        lista.adiciona("Me in side");
        lista.adiciona("Prothetics");
        lista.adiciona("No Life");

        System.out.println("Ir Poscion 5 " + lista.irPosicion(5));
        System.out.println("La siguiente es " + lista.siguiente());
        System.out.println("La siguiente es " + lista.siguiente());

        mapa.adiciona("map Slipknot");
        mapa.adiciona("map Sic");
        mapa.adiciona("map surfacing");
        mapa.adiciona("map Spit Out");
        mapa.adiciona("map Tattered Torn");
        mapa.adiciona("map Me in side");
        mapa.adiciona("map Prothetics");
        mapa.adiciona("map No Life");

        System.out.println("Ir Poscion map 5 " + mapa.irPosicion(5));
        System.out.println("La siguiente map es " + mapa.siguiente());
        System.out.println("La siguiente map es " + mapa.siguiente());

    }

}
