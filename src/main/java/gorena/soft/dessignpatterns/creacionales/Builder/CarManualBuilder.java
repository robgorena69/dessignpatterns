package gorena.soft.dessignpatterns.creacionales.Builder;

import gorena.soft.dessignpatterns.creacionales.Builder.objetos.CarType;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.Engine;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.GpsNavigator;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.ManualAuto;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.Transmision;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.TripComputer;

public class CarManualBuilder implements IBuilder {

    // Se asignan los Objetos de Valor
    private CarType type;
    private int asientos;
    private Engine engine;
    private Transmision transmision;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    @Override
    public void setTipo(CarType type) {
        this.type = type;
    }

    @Override
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public void setMotor(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    @Override
    public void setComputadoraNavegacion(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GpsNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public ManualAuto getManual() {
        return new ManualAuto(asientos, engine, gpsNavigator, transmision, tripComputer, type);
    }
}
