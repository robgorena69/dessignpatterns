package gorena.soft.dessignpatterns.creacionales.Builder;

import gorena.soft.dessignpatterns.creacionales.Builder.objetos.CarType;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.Engine;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.GpsNavigator;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.Transmision;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.TripComputer;

public interface IBuilder {
    void setTipo(CarType type);

    void setAsientos(int asientos);

    void setMotor(Engine engine);

    void setTransmision(Transmision transmision);

    void setComputadoraNavegacion(TripComputer tripComputer);

    void setGPSNavigator(GpsNavigator gpsNavigator);
}
