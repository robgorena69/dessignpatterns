package gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad.implementacion;

import gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad.interfaz.OperacionesUsuario;

public class Autorizacion extends OperacionesUsuario {

    @Override
    public boolean validaOperacion(String usuario, String password) {
        if (usuario.equals("JEYSON")) {
            System.out.println("El usuario Jeyson tiene el rol correcto");
            return super.verificaSiguiente(usuario, password);
        } else {
            System.out.println("El usuario " + usuario + "no tiene acceso al rol que correspo");
            return false;
        }
    }

}
