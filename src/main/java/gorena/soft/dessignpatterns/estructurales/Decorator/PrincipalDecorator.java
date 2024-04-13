package gorena.soft.dessignpatterns.estructurales.Decorator;

import gorena.soft.dessignpatterns.estructurales.Decorator.decoradores.AdicionarDestinatarioDecorator;
import gorena.soft.dessignpatterns.estructurales.Decorator.decoradores.EncryotarMensajeDecorator;
import gorena.soft.dessignpatterns.estructurales.Decorator.decoradores.MensajeSinDecorator;

public class PrincipalDecorator {

    public static void main(String[] args) {
        String mensajeEnviar = "Black Sabbath Rule";

        System.out.println("-Input --------------------");
        MensajeSinDecorator mensaje = new MensajeSinDecorator(mensajeEnviar);
        mensaje.enviarMensaje();
        System.out.println("El mensaje recibido es :" + mensaje.obtenerMensaje());
        AdicionarDestinatarioDecorator adicionarDestinatarioDecorator = new AdicionarDestinatarioDecorator(mensaje);
        adicionarDestinatarioDecorator.setearDestinatario("Ozzy");
        System.out.println("Envio destinatario:" + adicionarDestinatarioDecorator.obtenerMensaje());
        EncryotarMensajeDecorator encryotarMensajeDecorator = new EncryotarMensajeDecorator(
                adicionarDestinatarioDecorator);
        System.out.println("Codificando mensaje");
        System.out.println(encryotarMensajeDecorator.obtenerMensaje());

    }
}
