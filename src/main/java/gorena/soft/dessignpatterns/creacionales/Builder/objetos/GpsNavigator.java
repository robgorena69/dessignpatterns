package gorena.soft.dessignpatterns.creacionales.Builder.objetos;

public class GpsNavigator {

    private String ruta;

    public GpsNavigator() {
        this.ruta = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GpsNavigator(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

}
