package gorena.soft.dessignpatterns.creacionales.Singleton;

public final class Clase {
    
    private String valor;
    private static Clase instancia;

    private Clase(String valor) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.valor = valor;
    }
    
    public static Clase getInstance(String valor){
        if (instancia!=null){
            return instancia;
        } else {
            instancia = new Clase(valor);
            return instancia;
        }
    }

    public String getValor() {
        return valor;
    }
    
}
