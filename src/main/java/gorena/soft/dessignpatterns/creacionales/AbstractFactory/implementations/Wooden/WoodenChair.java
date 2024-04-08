package gorena.soft.dessignpatterns.creacionales.AbstractFactory.implementations.Wooden;

import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.IChair;

public class WoodenChair implements IChair {

    @Override
    public boolean isReclinable() {
        System.out.println("Una silla de madera no es reclinable");
        return false;
    }

    @Override
    public void sentarse() {
        System.out.println("Sentandome desde una silla de Madera");
    }

    public WoodenChair() {

    }
}
