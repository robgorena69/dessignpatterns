package gorena.soft.dessignpatterns.creacionales.AbstractFactory.implementations.Wooden;

import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.ITable;

public class WoodenTable implements ITable {
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
        System.out.println("Retornando la cantidad de patas de una mesa de madera");
        return this.legs;

    }

    @Override
    public int capacity() {
        System.out.println("Retornando la cantidad de personas que pueden sentarse en una mesa de madera");
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

    public WoodenTable() {
        this.cantidadPersonas = 12;
        this.legs = 8;
    }

}
