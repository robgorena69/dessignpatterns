package gorena.soft.dessignpatterns.estructurales.Bridge.implementaciones;

import gorena.soft.dessignpatterns.estructurales.Bridge.interfaces.IDevice;

public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote(IDevice device){
        super.device = device;
    }

    public void mute(){
        System.out.println("Se mutea el dispositivo");
        this.device.setVolumen(0);
    }
    
}
