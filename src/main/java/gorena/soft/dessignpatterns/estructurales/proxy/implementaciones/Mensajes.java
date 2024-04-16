package gorena.soft.dessignpatterns.estructurales.proxy.implementaciones;

import gorena.soft.dessignpatterns.estructurales.proxy.interfaz.EnvioMensajes;

public class Mensajes implements EnvioMensajes {
    private String pais;
    private String destinatario;

    @Override
    public String obteniendoMensajes(String mensaje) {
        return "Se responde el mensaje  " + mensaje + " hacie el destinatario " + this.destinatario + " del pais "
                + this.pais;
    }

    @Override
    public void definiendoDestinatario(String destinatario) {
        System.out.println("definiendo destinatario sin proxy");
        this.destinatario = destinatario;
    }

    @Override
    public void definiendoPais(String pais) {
        System.out.println("definiendo pais sin proxy");
        ;
        this.pais = pais;
    }

}
