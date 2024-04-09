package gorena.soft.dessignpatterns.estructurales.Bridge.implementaciones;

import gorena.soft.dessignpatterns.estructurales.Bridge.interfaces.IDevice;

public class Radio implements IDevice{
    private boolean prendido = false;
    private int volumen = 0;
    private int canal = 1;

    @Override
    public boolean estaFuncionando() {
        return prendido;
    }

    @Override
    public void prender() {
        this.prendido = true;
    }

    @Override
    public void apagar() {
        this.prendido = false;
    }

    @Override
    public int obtVolumenActual() {
       return this.volumen;
    }

    @Override
    public void setVolumen(int volumen) {
        if (volumen>100){
          this.volumen = 100;
        } else if (volumen<0){
          this.volumen = 0;
        } else {
          this.volumen = volumen;
        }
    }

    @Override
    public int obtCanalActual() {
        return this.canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void imprimeEstado() {
        System.out.println("----------------------------------");
        System.out.println("Soy una radio");
        System.out.println("Estoy habilitada "+this.prendido);
        System.out.println("El volumen actual es "+this.volumen);
        System.out.println("El canal actual es "+this.canal);
        System.out.println("------------------------------------");
        

    }
    
}
