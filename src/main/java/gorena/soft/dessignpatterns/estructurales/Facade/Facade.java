package gorena.soft.dessignpatterns.estructurales.Facade;

import gorena.soft.dessignpatterns.estructurales.Facade.implementaciones.CompactDisc;
import gorena.soft.dessignpatterns.estructurales.Facade.implementaciones.Tape;
import gorena.soft.dessignpatterns.estructurales.Facade.implementaciones.Vinilo;
import gorena.soft.dessignpatterns.estructurales.Facade.interfaz.Dispositivo;

public class Facade {

    public static Dispositivo inicializarDispositivo(String tipoDispositivo) {
        switch (tipoDispositivo) {
            case "CD":
                return new CompactDisc(false, false, "ELP");
            case "Vinilo":
                return new Vinilo();
            case "Casete":
                return new Tape();
            default:
                return null;
        }

    }

}
