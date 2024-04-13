package gorena.soft.dessignpatterns.estructurales.Decorator.decoradores;

import java.util.Base64;

import gorena.soft.dessignpatterns.estructurales.Decorator.interfaz.Mensaje;

public class EncryotarMensajeDecorator extends MensajeBaseDecorator {

    public EncryotarMensajeDecorator(Mensaje mensaje) {
        super(mensaje);
        this.setearMensaje(mensaje.obtenerMensaje());
    }

    private String encode(String data) {
        System.out.println("El mensaje sin decodificar es " + data);

        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        System.out.println("El mensaje despues de decodificar es:" + new String(result));
        return new String(result);
    }

    @Override
    public String obtenerMensaje() {
        return this.decode(super.obtenerMensaje());
    }

    @Override
    public void setearMensaje(String mensaje) {
        System.out.println("Encriptando mensaje");
        super.setearMensaje(this.encode(mensaje));
    }
}
