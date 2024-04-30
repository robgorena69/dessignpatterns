package gorena.soft.dessignpatterns.comportamiento.command.interfaz;

public class Editor {
    private String texto;
    private String mensaje;
    private String portapapeles;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getPortapapeles() {
        return portapapeles;
    }

    public void setPortapapeles(String portapapeles) {
        this.portapapeles = portapapeles;
    }

}
