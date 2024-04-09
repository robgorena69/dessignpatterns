package gorena.soft.dessignpatterns.estructurales.Bridge;

import gorena.soft.dessignpatterns.estructurales.Bridge.implementaciones.AdvancedRemote;
import gorena.soft.dessignpatterns.estructurales.Bridge.implementaciones.BasicRemote;
import gorena.soft.dessignpatterns.estructurales.Bridge.implementaciones.Radio;
import gorena.soft.dessignpatterns.estructurales.Bridge.implementaciones.Tv;
import gorena.soft.dessignpatterns.estructurales.Bridge.interfaces.IDevice;

public class PrincipalBridge {
    
    public static void main(String[] args){
        testDispositivo(new Radio());
        testDispositivo(new Tv());
    }

    public static void testDispositivo(IDevice device){
        System.out.println("pruebas con un remoto sencillo");
        BasicRemote remotoBasico = new BasicRemote(device);
        remotoBasico.power();
        remotoBasico.volumenSubir();
        remotoBasico.canalSubir();

        device.imprimeEstado();
        
        System.out.println("Pruebas con un remoto avanzado");
        AdvancedRemote remotoAvanzado = new AdvancedRemote(device);
        //remotoAvanzado.power();
        remotoAvanzado.volumenSubir();
        remotoAvanzado.volumenSubir();
        remotoAvanzado.mute();
        device.imprimeEstado();

    }
}
