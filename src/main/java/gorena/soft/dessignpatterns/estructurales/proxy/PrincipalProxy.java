package gorena.soft.dessignpatterns.estructurales.proxy;

import gorena.soft.dessignpatterns.estructurales.proxy.implementaciones.MensajeBD;
import gorena.soft.dessignpatterns.estructurales.proxy.implementaciones.Mensajes;

public class PrincipalProxy {

    public static void main(String[] args) {
        Mensajes mensaje = new Mensajes();
        MensajeBD mensajeBD = new MensajeBD();
        System.out.println("sin proxy");
        mensaje.definiendoDestinatario("Juanito");
        mensaje.definiendoPais("591");
        System.out.println(mensaje.obteniendoMensajes("JMJ"));
        mensajeBD.definiendoDestinatario("Jhon");
        mensajeBD.definiendoPais("684");
        System.out.println(mensajeBD.obteniendoMensajes("AKIRA"));

    }

}
