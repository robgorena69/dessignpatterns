package gorena.soft.dessignpatterns.estructurales.Bridge.implementaciones;

import gorena.soft.dessignpatterns.estructurales.Bridge.interfaces.IDevice;
import gorena.soft.dessignpatterns.estructurales.Bridge.interfaces.IRemote;

public class BasicRemote implements IRemote{

    protected IDevice device;

    public BasicRemote() {
    }

    public BasicRemote(IDevice device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remoto: prender dispositivo");
        if (this.device.estaFuncionando()){
            this.device.apagar();
        } else {
            this.device.prender();
        }
    }

    @Override
    public void volumenBajar() {
        System.out.println("Remoto: bajar volumen");
        this.device.setVolumen(this.device.obtVolumenActual()-10);
    }

    @Override
    public void volumenSubir() {
        System.out.println("Remoto: subir volumen");
        this.device.setVolumen(this.device.obtVolumenActual()+10);
    }

    @Override
    public void canalSubir() {
        System.out.println("Remoto: subir canal");
        this.device.setCanal(this.device.obtCanalActual()+1);
    }

    @Override
    public void canalBajar() {
        System.out.println("Remoto: bajar canal");
        this.device.setCanal(this.device.obtCanalActual()-1);
    }
    
}
