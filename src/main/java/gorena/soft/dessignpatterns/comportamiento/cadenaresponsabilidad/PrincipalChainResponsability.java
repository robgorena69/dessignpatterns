package gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad;

import gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad.implementacion.Autentificacion;
import gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad.implementacion.Autorizacion;
import gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad.implementacion.Servidor;
import gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad.interfaz.OperacionesUsuario;

public class PrincipalChainResponsability {

    public static void main(String[] args) {
        Autentificacion autentificacion = new Autentificacion();
        System.out.println(autentificacion.validaOperacion("JEYSON", "SANCHEZ"));
        // EN CADENA
        OperacionesUsuario operaciones = OperacionesUsuario.enlaza(new Autentificacion(), new Autorizacion(),
                new Servidor());

        System.out.println(operaciones.validaOperacion("JEYSON", "SANCHEZ"));
        Servidor servidor = new Servidor();
        System.out.println(servidor.validaOperacion("ROBERTO", "GORENA"));

        OperacionesUsuario operaciones2 = OperacionesUsuario.enlaza(new Servidor(), new Autorizacion());
        System.out.println(operaciones2.validaOperacion("ROBERTO", "GORENA"));

        OperacionesUsuario operaciones3 = OperacionesUsuario.enlaza(new Servidor(), new Autentificacion());
        System.out.println(operaciones3.validaOperacion("ROBERTO", "GORENA"));

    }
}