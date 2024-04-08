package gorena.soft.dessignpatterns.creacionales.AbstractFactory.Metal;

import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.ITable;

public class MetalTable implements ITable {
    private int legs;
    private int cantidadPersonas;

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public int numberOfLegs() {
        System.out.println("Retornando la cantidad de patas de una mesa de metal");
        return this.legs;

    }

    @Override
    public int capacity() {
        System.out.println("Retornando la cantidad de personas que pueden sentarse en una mesa de metal");
        return this.cantidadPersonas;
    }

    @Override
    public boolean expandable() {
        return true;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public MetalTable() {
        this.cantidadPersonas = 24;
        this.legs = 60;
    }

}
