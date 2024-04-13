package gorena.soft.dessignpatterns.estructurales.Facade;

import gorena.soft.dessignpatterns.estructurales.Facade.implementaciones.CompactDisc;
import gorena.soft.dessignpatterns.estructurales.Facade.interfaz.Dispositivo;

public class PrincipalFacade {

    public static void main(String[] args) {
        Dispositivo cd = Facade.inicializarDispositivo("CD");
        cd.reproducir();
        cd.reproducir();
        cd.pausa();
        System.out.println(cd.tiempoRestante());
        Dispositivo lp = Facade.inicializarDispositivo("Vinilo");
        lp.reproducir();
        lp.pausa();
        lp.detener();
        System.out.println(lp.tiempoRestante());
        Dispositivo tape = Facade.inicializarDispositivo("Casete");
        tape.reproducir();
        tape.pausa();
        System.out.println(tape.tiempoRestante());
        lp.reproducir();
        cd.reproducir();
        tape.reproducir();
        lp.reproducir();
        cd.reproducir();
        tape.reproducir();
        lp.tiempoRestante();
        cd.tiempoRestante();
        tape.tiempoRestante();
        System.out.println(((CompactDisc) cd).getArtista());

    }
}
