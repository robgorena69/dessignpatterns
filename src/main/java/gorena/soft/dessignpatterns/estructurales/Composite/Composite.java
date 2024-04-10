package gorena.soft.dessignpatterns.estructurales.Composite;

import java.util.ArrayList;
import java.util.List;

import gorena.soft.dessignpatterns.estructurales.Composite.Interface.Item;

public class Composite {
    private double precioTotal;
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(int idItem) {
        this.items.remove(0);
    }

    public double calculaItem() {
        System.out.println("---------------------------------------------------------");
        precioTotal = 0;
        items.forEach(item -> {
            precioTotal += item.calculaPrecio();
        });
        return precioTotal;
    }

}
