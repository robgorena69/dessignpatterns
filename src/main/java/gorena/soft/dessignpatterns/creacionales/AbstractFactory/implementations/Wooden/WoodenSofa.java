package gorena.soft.dessignpatterns.creacionales.AbstractFactory.implementations.Wooden;

import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.ISofa;

public class WoodenSofa implements ISofa {

    private int cantidadPatitas;

    @Override
    public boolean tienePosaVasos() {
        System.out.println("Un sofa de madera no tiene posavasos");
        return false;
    }

    @Override
    public int cantidadPatitas() {
        System.out.println("Respondiendeo desde el sofa de madera");
        return this.cantidadPatitas;
    }

    @Override
    public void sentarse() {
        System.out.println("Sentandome desde un sofa de madera");
    }

    public int getCantidadPatitas() {
        return cantidadPatitas;
    }

    public void setCantidadPatitas(int cantidadPatitas) {
        this.cantidadPatitas = cantidadPatitas;
    }

    public WoodenSofa() {
        this.cantidadPatitas = 18;
    }

}
