package gorena.soft.dessignpatterns.estructurales.Decorator.decoradores;

import gorena.soft.dessignpatterns.estructurales.Decorator.interfaz.Mensaje;

public class MensajeSinDecorator implements Mensaje {

    private String mensaje;

    public MensajeSinDecorator(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Se esta enviando el mensaje " + this.mensaje);
    }

    @Override
    public String obtenerMensaje() {
        System.out.println("El mensaje obtenido es:" + this.mensaje);
        return this.mensaje;
    }

    @Override
    public void setearMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
