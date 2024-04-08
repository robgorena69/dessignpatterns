package gorena.soft.dessignpatterns.creacionales.Builder.objetos;

public class ManualAuto {
    private int asientos;
    private Engine engine;
    private GpsNavigator gpsNavigator;
    private Transmision transmision;
    private TripComputer tripComputer;
    private CarType type;

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GpsNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public void setGpsNavigator(GpsNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public ManualAuto(int asientos, Engine engine, GpsNavigator gpsNavigator, Transmision transmision,
            TripComputer tripComputer, CarType type) {
        this.asientos = asientos;
        this.engine = engine;
        this.gpsNavigator = gpsNavigator;
        this.transmision = transmision;
        this.tripComputer = tripComputer;
        this.type = type;
        System.out.println("Generando el manual de un auto");
    }

    public String imprime() {
        String cSaltoLinea = "\n";
        StringBuffer cadena = new StringBuffer();
        cadena.append("El tipo de auto es: " + this.type + cSaltoLinea);
        cadena.append("La cantidad de asientos es " + this.getAsientos() + cSaltoLinea);
        cadena.append("El motor tiene el volumen:" + this.engine.getVolumen() + " y recorrio " + this.engine.getMillas()
                + " millas" + cSaltoLinea);
        if (this.tripComputer != null) {
            cadena.append("El automovil tiene computadora de viaje" + cSaltoLinea);
        }
        if (this.gpsNavigator != null) {
            cadena.append("El GPS es funcional");
        }
        return cadena.toString();
    }

}
