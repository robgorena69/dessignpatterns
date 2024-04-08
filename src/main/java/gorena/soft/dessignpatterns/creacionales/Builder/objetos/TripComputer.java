package gorena.soft.dessignpatterns.creacionales.Builder.objetos;

public class TripComputer {
    private Auto auto;

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void muestraNivelGasolina() {
        System.out.println("El nivel de gasolina es " + auto.getNivelGasolina());
    }

    public void muestraEstado() {
        if (this.auto.getEngine().isEncendido()) {
            System.out.println("El auto esta encendido");
        } else {
            System.out.println("El auto no esta encendido");
        }
    }

}
