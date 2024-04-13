package gorena.soft.dessignpatterns.estructurales.Decorator.decoradores;

import gorena.soft.dessignpatterns.estructurales.Decorator.interfaz.Mensaje;

public class AdicionarDestinatarioDecorator extends MensajeBaseDecorator {

    private String destinatario;

    public AdicionarDestinatarioDecorator(Mensaje wrapper) {
        super(wrapper);
    }

    public void setearDestinatario(String destinataorio) {
        this.destinatario = destinataorio;
        System.out.println("Seteando mensaje destinatario");
        this.setearMensaje(this.destinatario + " " + super.obtenerMensaje());
    }

    @Override
    public void setearMensaje(String mensaje) {
        System.out.println("Seteando mensaje destinatario");
        super.setearMensaje(mensaje);
    }

    @Override
    public String obtenerMensaje() {
        return super.obtenerMensaje();
    };

}
