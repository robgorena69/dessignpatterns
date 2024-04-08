package gorena.soft.dessignpatterns.estructurales.Adapter;

public class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    public double anchoCuadrado(){
        return lado*2;
    }

    public int getLado() {
        return lado;
    }
    
}
