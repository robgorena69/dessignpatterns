package gorena.soft.dessignpatterns.estructurales.Decorator.decoradores;

import gorena.soft.dessignpatterns.estructurales.Decorator.interfaz.Mensaje;

public class MensajeBaseDecorator implements Mensaje {
    private Mensaje wrapper;

    public MensajeBaseDecorator(Mensaje wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void enviarMensaje() {
        this.wrapper.enviarMensaje();
    }

    @Override
    public String obtenerMensaje() {
        return this.wrapper.obtenerMensaje();
    }

    @Override
    public void setearMensaje(String mensaje) {
        this.wrapper.setearMensaje(mensaje);
    }
}
