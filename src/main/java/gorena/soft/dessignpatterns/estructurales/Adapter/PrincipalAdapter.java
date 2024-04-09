package gorena.soft.dessignpatterns.estructurales.Adapter;

public class PrincipalAdapter {
    
    public static void main(String[] args){
        CirculoHueco hueco = new CirculoHueco(7.0);
        Circulo circulo = new Circulo(9.0);
        if (hueco.quepa(circulo)){
            System.out.println("Circulo peg r5 llena el circulo con r5");
        } else {
            System.out.println("El circulo no entra");
        }

        CuadradoAdapter cuadradosmall = new CuadradoAdapter(new Cuadrado(4));
        CuadradoAdapter cuadradobig = new CuadradoAdapter(new Cuadrado(30));
        if (hueco.quepa(cuadradosmall.getCirculo())){
            System.out.println("Cuadrado small entra en el ciruclo");
        } else 
            System.out.println("Cuadrado pequeño no entra en el circulo");
        if (!hueco.quepa(cuadradobig.getCirculo())){ 
            System.out.println("Cuadrado grande no entra en el circulo");
        } else {
            System.out.println("Cuadrado grande entra en el");
        }
    }
}
