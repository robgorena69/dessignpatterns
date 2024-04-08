package gorena.soft.dessignpatterns.estructurales.Adapter;

public class CuadradoAdapter extends Circulo {

    private Cuadrado cuadrado;

    public CuadradoAdapter(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
        //TODO Auto-generated constructor stub
    }

 
    public Cuadrado getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(Cuadrado cuadrado) {
        
    }

    @Override
    public double getRadio() {
        double resultado;
        resultado = Math.sqrt(Math.pow(cuadrado.getLado()/2, 2)*2);
        return resultado;
    }    
    
}
