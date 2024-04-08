package gorena.soft.dessignpatterns.creacionales.Builder;

import gorena.soft.dessignpatterns.creacionales.Builder.objetos.Auto;
import gorena.soft.dessignpatterns.creacionales.Builder.objetos.ManualAuto;

public class PrincipalBuilder {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.construyeAutoDeportivo(carBuilder);
        director.construyeAutoDeportivo(carManualBuilder);
        Auto autodeportivo = carBuilder.getResultado();
        autodeportivo.getEngine().encendido();
        autodeportivo.getEngine().ir(500);
        ManualAuto manualAuto = carManualBuilder.getManual();
        System.out.println("Auto 1:" + autodeportivo.getTipoAuto());
        System.out.println(manualAuto.imprime());

        carBuilder = new CarBuilder();
        carManualBuilder = new CarManualBuilder();
        director.construyeAutoCitadino(carBuilder);
        director.construyeAutoCitadino(carManualBuilder);
        Auto autociudad = carBuilder.getResultado();
        System.out.println("Auto 2:" + autociudad.getTipoAuto());
        ManualAuto manualAutoCiudad = carManualBuilder.getManual();
        System.out.println(manualAutoCiudad.imprime());

        carManualBuilder = new CarManualBuilder();
        carBuilder = new CarBuilder();
        director.construyeSUV(carBuilder);
        director.construyeSUV(carManualBuilder);
        Auto autoSuv = carBuilder.getResultado();
        ManualAuto manualSuv = carManualBuilder.getManual();
        System.out.println("Auto 3:" + autoSuv.getTipoAuto());
        System.out.println(manualSuv.imprime());

    }

}
