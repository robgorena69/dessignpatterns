package gorena.soft.dessignpatterns.creacionales.Builder.objetos;

public class Engine {

    private final double volumen;
    private double millas;
    private boolean encendido;

    public Engine(double volumen, double millas) {
        this.volumen = volumen;
        this.millas = millas;
    }

    public void encendido() {
        this.encendido = true;
    }

    public void apagado() {
        this.encendido = false;
    }

    public void ir(double millas) {
        if (encendido) {
            this.millas += millas;
        } else {
            System.out.println("No puedo partir,primero debes encender el motor");
        }
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getMillas() {
        return millas;
    }

}
