package gorena.soft.dessignpatterns.estructurales.Adapter;

public class CuadradoAdapter  {

    private Cuadrado cuadrado;

    public CuadradoAdapter(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
        //TODO Auto-generated constructor stub
    }

    public Circulo getCirculo() {
        double resultado;
        resultado = Math.sqrt(Math.pow(cuadrado.getLado()/2, 2)*2);
        return new Circulo(resultado);
    }    
    
}
