package gorena.soft.dessignpatterns.estructurales.Composite.Implementacion;

import gorena.soft.dessignpatterns.estructurales.Composite.Interface.Item;

public class Producto implements Item {

    private String nombreItem;
    private double precio;
    private int cantidad;

    public Producto(String nombreItem, double precio, int cantidad) {
        this.nombreItem = nombreItem;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public double calculaPrecio() {
        System.out.println(this.obtTipoItem());
        return this.precio * this.cantidad;

    }

    @Override
    public String obtTipoItem() {
        return "El item " + nombreItem + " es de tipo producto con el valor: " + this.precio;
    }

}
