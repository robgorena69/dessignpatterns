package gorena.soft.dessignpatterns.creacionales.AbstractFactory;

import gorena.soft.dessignpatterns.creacionales.AbstractFactory.Metal.MetalFactory;
import gorena.soft.dessignpatterns.creacionales.AbstractFactory.implementations.Wooden.WoodenFurnitureFactory;
import gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces.IFurnitureFactory;

public class PrincipalFactory {

    public static void main(String[] args) {
        IFurnitureFactory factoryWooden = new WoodenFurnitureFactory();
        factoryWooden.creaLiving();
        IFurnitureFactory factoryMetal = new MetalFactory();
        factoryMetal.creaLiving();
    }
}
