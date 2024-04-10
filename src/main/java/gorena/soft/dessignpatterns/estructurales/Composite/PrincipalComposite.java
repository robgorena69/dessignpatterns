package gorena.soft.dessignpatterns.estructurales.Composite;

import java.util.ArrayList;
import java.util.List;

import gorena.soft.dessignpatterns.estructurales.Composite.Implementacion.Caja;
import gorena.soft.dessignpatterns.estructurales.Composite.Implementacion.Producto;

public class PrincipalComposite {

    public static void main(String[] args) {
        Producto cd1 = new Producto("LOTR soundtrack Fellowship", 50.5, 1);
        Producto cd2 = new Producto("LOTR soundtrack Two Towers", 150.2, 1);
        Producto cd3 = new Producto("LOTR", 60, 1);
        List<Producto> listProductos = new ArrayList<>();
        listProductos.add(cd1);
        listProductos.add(cd2);
        listProductos.add(cd3);

        Caja cajalotr = new Caja(listProductos, "Box LOTR");

        Producto cd4 = new Producto("Matrix OST", 190.15, 1);
        Composite contenedorPrincipaComposite = new Composite();
        contenedorPrincipaComposite.addItem(cajalotr);
        contenedorPrincipaComposite.addItem(cd4);
        Producto cdStarless = new Producto("Starless Bible Black", 25, 1);
        Producto cdLTIA = new Producto("Larks Tongues in Aspict", 15, 1);
        Producto cdRed = new Producto("Red", 60, 1);
        listProductos = new ArrayList<>();
        listProductos.add(cdRed);
        listProductos.add(cdLTIA);
        listProductos.add(cdStarless);
        Caja box70s = new Caja(listProductos, "Box 70s Crimson");
        contenedorPrincipaComposite.addItem(box70s);
        Producto cdDiscipline = new Producto("Discipline", 50, 1);
        Producto cdBeat = new Producto("Beat", 70, 1);
        Producto cdToapp = new Producto("Three of a Perfect Pair", 60, 1);
        listProductos = new ArrayList<>();
        listProductos.add(cdBeat);
        listProductos.add(cdDiscipline);
        listProductos.add(cdToapp);
        Caja box80s = new Caja(listProductos, "Box 80s Crimson");
        contenedorPrincipaComposite.addItem(box80s);
        Producto cdThrak = new Producto("THRAK", 60, 1);
        Producto cdPower = new Producto("Power to Believe", 60, 1);
        Producto cdConstr = new Producto("Construktion of Light", 60, 1);
        listProductos = new ArrayList<>();
        listProductos.add(cdPower);
        listProductos.add(cdThrak);
        listProductos.add(cdConstr);
        Caja box2000 = new Caja(listProductos, "Box 90s Crimson");
        contenedorPrincipaComposite.addItem(box2000);

        System.out.println("El valor total de la caja es " + contenedorPrincipaComposite.calculaItem());

    }
}
