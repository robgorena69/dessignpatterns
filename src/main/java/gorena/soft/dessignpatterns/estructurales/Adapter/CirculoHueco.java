package gorena.soft.dessignpatterns.estructurales.Adapter;

public class CirculoHueco {
    private double radio;

    public CirculoHueco(double radio) {
        this.radio = radio;
    }

    
    public boolean quepa(Circulo circulo){
        return this.radio>=circulo.getRadio();
    }
}
