package gorena.soft.dessignpatterns.creacionales.Builder.objetos;

public class Auto {

    private int asientos;
    private Engine engine;
    private GpsNavigator gpsNavigator;
    private Transmision transmision;
    private TripComputer tripComputer;
    private CarType tipoAuto;
    private double nivelGasolina;

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

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public double getNivelGasolina() {
        return nivelGasolina;
    }

    public void setNivelGasolina(double nivelGasolina) {
        this.nivelGasolina = nivelGasolina;
    }

    public CarType getTipoAuto() {
        return tipoAuto;
    }

    public Auto(int asientos, Engine engine, GpsNavigator gpsNavigator, Transmision transmision,
            TripComputer tripComputer, CarType tipoAuto) {
        this.asientos = asientos;
        this.engine = engine;
        this.gpsNavigator = gpsNavigator;
        this.transmision = transmision;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setAuto(this);
        }
        this.tipoAuto = tipoAuto;
        System.out.println("Generando un automovil");
    }

}
