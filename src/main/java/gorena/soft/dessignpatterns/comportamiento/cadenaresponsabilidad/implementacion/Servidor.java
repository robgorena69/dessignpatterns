package gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad.implementacion;

import gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad.interfaz.OperacionesUsuario;

public class Servidor extends OperacionesUsuario {

    @Override
    public boolean validaOperacion(String usuario, String password) {
        if (usuario.equals("JEYSON") || usuario.equals("ROBERTO")) {
            System.out.println("El usuario " + usuario + "se encuentra en el servidor");
            return super.verificaSiguiente(usuario, password);
        } else {
            System.out.println("El usuario " + usuario + "no se encuentra en el servidor");
            return false;
        }
    }

}
