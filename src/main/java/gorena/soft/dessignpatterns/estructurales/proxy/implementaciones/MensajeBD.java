package gorena.soft.dessignpatterns.estructurales.proxy.implementaciones;

import gorena.soft.dessignpatterns.estructurales.proxy.interfaz.EnvioMensajes;

public class MensajeBD implements EnvioMensajes {

    Mensajes mensajes = new Mensajes();

    @Override
    public String obteniendoMensajes(String receptor) {
        //
        String mensajefinal;
        System.out.println("se llama a la BBDD para que haga el registro de la llamada");
        mensajefinal = mensajes.obteniendoMensajes(receptor);
        System.out.println(mensajefinal);
        System.out.println("Despues de enviar el mensaje");
        return mensajefinal;
    }

    @Override
    public void definiendoDestinatario(String destinatario) {
        System.out.println("Log antes de enviar el destinatario");
        mensajes.definiendoDestinatario("dentro del proxy:" + destinatario);

    }

    @Override
    public void definiendoPais(String pais) {
        mensajes.definiendoPais("dentro del proxy:" + pais);
        System.out.println("despues de definir el pais");
    }

}
