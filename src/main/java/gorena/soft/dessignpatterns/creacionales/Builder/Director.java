package gorena.soft.dessignpatterns.creacionales.Builder;

import gorena.soft.dessignpatterns.creacionales.Builder.objetos.CarType;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.Engine;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.GpsNavigator;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.Transmision;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.TripComputer;

public class Director {

    public void construyeAutoDeportivo(IBuilder builder) {
        builder.setTipo(CarType.SPORT_CAR);
        builder.setAsientos(2);
        builder.setMotor(new Engine(3, 0));
        builder.setTransmision(Transmision.SEMI_AUTOMATIC);
        builder.setComputadoraNavegacion(new TripComputer());
        builder.setGPSNavigator(new GpsNavigator());
    }

    public void construyeAutoCitadino(IBuilder builder) {
        builder.setTipo(CarType.CITY_CAR);
        builder.setAsientos(5);
        builder.setMotor(new Engine(1.2, 0));
        builder.setTransmision(Transmision.MANUAL);
        builder.setComputadoraNavegacion(new TripComputer());
        builder.setGPSNavigator(new GpsNavigator());
    }

    public void construyeSUV(IBuilder builder) {
        builder.setTipo(CarType.SUV);
        builder.setAsientos(4);
        builder.setMotor(new Engine(2.5, 0));
        builder.setTransmision(Transmision.MANUAL);
    }
}
