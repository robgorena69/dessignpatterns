package gorena.soft.dessignpatterns.comportamiento.cadenaresponsabilidad.interfaz;

public abstract class OperacionesUsuario {

    private OperacionesUsuario siguiente;

    // se encadenan las peticiones
    public static OperacionesUsuario enlaza(OperacionesUsuario primero, OperacionesUsuario... cadena) {
        OperacionesUsuario cabeza = primero;
        for (OperacionesUsuario siguienteCadena : cadena) {
            cabeza.siguiente = siguienteCadena;
            cabeza = siguienteCadena;
        }
        return primero;
    }

    public abstract boolean validaOperacion(String usuario, String password);

    public boolean verificaSiguiente(String usuario, String password) {
        if (siguiente == null)
            return true;
        return siguiente.validaOperacion(usuario, password);
    }

}
