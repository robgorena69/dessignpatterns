package gorena.soft.dessignpatterns.estructurales.Bridge.interfaces;

public interface IDevice {

    boolean estaFuncionando();

    void prender();
    void apagar();
    int  obtVolumenActual();
    void setVolumen(int volumen);
    int  obtCanalActual();
    void setCanal(int canal);
    void imprimeEstado();

    
}
