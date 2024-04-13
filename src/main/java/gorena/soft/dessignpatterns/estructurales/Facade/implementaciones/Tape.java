package gorena.soft.dessignpatterns.estructurales.Facade.implementaciones;

import gorena.soft.dessignpatterns.estructurales.Facade.interfaz.Dispositivo;

public class Tape implements Dispositivo {
    private int tiempoCasete = 0;

    @Override
    public void reproducir() {
        this.tiempoCasete = tiempoCasete + 5;
        System.out.println("Reproduciendo el Casette");
    }

    @Override
    public void detener() {
        this.tiempoCasete = 0;
        System.out.println("Deteniendo el Casette");
    }

    @Override
    public void pausa() {
        this.tiempoCasete = this.tiempoCasete - 1;
        System.out.println("Pausando el Casette");
    }

    @Override
    public int tiempoRestante() {
        System.out.println("El tiempo restante del Casette es:" + this.tiempoCasete);
        return this.tiempoCasete;
    }

}
