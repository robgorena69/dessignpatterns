package gorena.soft.dessignpatterns.creacionales.AbstractFactory.implementations.Wooden;

import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.IChair;
import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.IFurnitureFactory;
import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.ISofa;
import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.ITable;

public class WoodenFurnitureFactory extends IFurnitureFactory {

    @Override
    public IChair createChair() {
        return new WoodenChair();
    }

    @Override
    public ISofa createSofa() {
        return new WoodenSofa();
    }

    @Override
    public ITable createTable() {
        return new WoodenTable();
    }

}
