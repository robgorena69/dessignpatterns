package gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad.implementacion;

import gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad.interfaz.OperacionesUsuario;

public class Autentificacion extends OperacionesUsuario {

    @Override
    public boolean validaOperacion(String usuario, String password) {
        if ((usuario.equals("JEYSON")) && (password.equals("SANCHEZ"))) {
            System.out.println("Usuario valido");
            return super.verificaSiguiente(usuario, password);
        } else {
            System.out.println("Usuario no valido");
            return false;
        }
    }
}
