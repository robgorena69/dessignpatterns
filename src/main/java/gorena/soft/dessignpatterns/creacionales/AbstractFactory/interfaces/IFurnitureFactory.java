package gorena.soft.dessignpatterns.creacionales.AbstractFactory.interfaces;

public abstract class IFurnitureFactory {

    public abstract IChair createChair();

    public abstract ISofa createSofa();

    public abstract ITable createTable();

    public void creaLiving() {
        IChair silla = createChair();
        ISofa sofa = createSofa();
        ITable mesa = createTable();
        System.out.println("Es reclinable?:" + silla.isReclinable());
        silla.sentarse();
        System.out.println("Tiene " + sofa.cantidadPatitas());
        sofa.tienePosaVasos();
        System.out.println("Es para " + mesa.capacity());
        mesa.expandable();
        System.out.println("Tiene " + mesa.numberOfLegs() + " patitas");
        // mesa.numberOfLegs();
    }
}
