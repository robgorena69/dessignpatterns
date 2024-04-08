package gorena.soft.dessignpatterns.creacionales.AbstractFactory.Metal;

import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.ISofa;

public class MetalSofa implements ISofa {
    private int legsQuantity;

    @Override
    public boolean tienePosaVasos() {
        System.out.println("Un sofa de metal no tiene posavasos");
        return false;
    }

    @Override
    public int cantidadPatitas() {
        System.out.println("Respondiendeo desde el sofa de metal");
        return this.legsQuantity;
    }

    @Override
    public void sentarse() {
        System.out.println("Sentandome desde un sofa de metal");
    }

    public int getLegsQuantity() {
        return legsQuantity;
    }

    public void setLegsQuantity(int cantidadPatitas) {
        this.legsQuantity = cantidadPatitas;
    }

    public MetalSofa() {
        this.legsQuantity = 20;
    }

}
