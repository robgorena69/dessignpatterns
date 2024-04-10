package gorena.soft.dessignpatterns.estructurales.Composite.Implementacion;

import java.util.ArrayList;
import java.util.List;

import gorena.soft.dessignpatterns.estructurales.Composite.Interface.Item;

public class Caja implements Item {

    private List<Producto> productos = new ArrayList<>();
    private String descripcionBox;
    private double resultadoFinal = 0;

    public Caja(List<Producto> productos, String descripcionBox) {
        this.productos = productos;
        this.descripcionBox = descripcionBox;
    }

    @Override
    public double calculaPrecio() {
        System.out.println("-----------------------------------------------");
        System.out.println("haciendo los calculos para el Box " + descripcionBox);
        productos.forEach(producto -> {
            resultadoFinal += producto.calculaPrecio();
        });
        return resultadoFinal;
    }

    @Override
    public String obtTipoItem() {
        return "El tipo de Item es caja";
    }

}
