package gorena.soft.dessignpatterns.creacionales.Singleton;

public class PrincipalSingleton {

    public static void main(String[] args){
        Clase clase1;
        Clase clase2;
        Clase clase3;
        
        clase1 = Clase.getInstance("Roberto");
        clase2 = Clase.getInstance("Gorena");
        clase3 = Clase.getInstance("Fernandez");

        System.out.println(clase1.getValor());
        System.out.println(clase2.getValor());
        System.out.println(clase3.getValor());
        
        

    }
    
    
}
