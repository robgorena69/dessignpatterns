package gorena.soft.dessignpatterns.creacionales.AbstractFactory.Metal;

import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.IChair;
import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.IFurnitureFactory;
import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.ISofa;
import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.ITable;

public class MetalFactory extends IFurnitureFactory {

    @Override
    public IChair createChair() {
        return new MetalChair();

    }

    @Override
    public ISofa createSofa() {
        return new MetalSofa();

    }

    @Override
    public ITable createTable() {
        return new MetalTable();
    }

}
