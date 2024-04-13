package gorena.soft.dessignpatterns.estructurales.Facade.implementaciones;

import gorena.soft.dessignpatterns.estructurales.Facade.interfaz.Dispositivo;

public class Vinilo implements Dispositivo {
    private int tiempoLP = 0;

    @Override
    public void reproducir() {
        this.tiempoLP = tiempoLP + 15;
        System.out.println("Reproduciendo el Vinilo");
    }

    @Override
    public void detener() {
        this.tiempoLP = 0;
        System.out.println("Deteniendo el Vinilo");
    }

    @Override
    public void pausa() {
        this.tiempoLP = this.tiempoLP - 1;
        System.out.println("Pausando el Vinilo");
    }

    @Override
    public int tiempoRestante() {
        System.out.println("El tiempo restante del Vinilo es:" + this.tiempoLP);
        return this.tiempoLP;
    }

}
