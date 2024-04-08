package gorena.soft.dessignpatterns.creacionales.AbstractFactory.Metal;

import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.IChair;

public class MetalChair implements IChair {

    @Override
    public boolean isReclinable() {
        System.out.println("Una silla de metal  es reclinable");
        return true;
    }

    @Override
    public void sentarse() {
        System.out.println("Sentandome desde una silla de Metal");
    }

}
