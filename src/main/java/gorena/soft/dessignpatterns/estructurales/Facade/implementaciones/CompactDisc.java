package gorena.soft.dessignpatterns.estructurales.Facade.implementaciones;

import gorena.soft.dessignpatterns.estructurales.Facade.interfaz.Dispositivo;

public class CompactDisc implements Dispositivo {

    private int tiempoCD = 0;
    private boolean booklet;
    private boolean jewelcase;
    private String artista;

    public CompactDisc(boolean booklet, boolean jewelcase, String artista) {
        this.booklet = booklet;
        this.jewelcase = jewelcase;
        this.artista = artista;
    }

    public CompactDisc() {
    }

    @Override
    public void reproducir() {
        this.tiempoCD = tiempoCD + 10;
        System.out.println("Reproduciendo el CD");
    }

    @Override
    public void detener() {
        this.tiempoCD = 0;
        System.out.println("Deteniendo el CD");
    }

    @Override
    public void pausa() {
        this.tiempoCD = this.tiempoCD - 1;
        System.out.println("Pausando el CD");
    }

    @Override
    public int tiempoRestante() {
        System.out.println("El tiempo restante del CD es:" + this.tiempoCD);
        return this.tiempoCD;
    }

    public boolean isBooklet() {
        return booklet;
    }

    public void setBooklet(boolean booklet) {
        this.booklet = booklet;
    }

    public int getTiempoCD() {
        return tiempoCD;
    }

    public void setTiempoCD(int tiempoCD) {
        this.tiempoCD = tiempoCD;
    }

    public boolean isJewelcase() {
        return jewelcase;
    }

    public void setJewelcase(boolean jewelcase) {
        this.jewelcase = jewelcase;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

}
