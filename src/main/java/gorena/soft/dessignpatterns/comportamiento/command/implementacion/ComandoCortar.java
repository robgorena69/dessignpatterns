package gorena.soft.dessignpatterns.comportamiento.command.implementacion;

import gorena.soft.dessignpatterns.comportamiento.command.interfaz.Command;
import gorena.soft.dessignpatterns.comportamiento.command.interfaz.Editor;

public class ComandoCortar extends Command {

    public ComandoCortar(Editor editor) {
        super(editor);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean execute() {
        System.out.println("Se esta cortando el portapapeles");
        editor.setPortapapeles(editor.getMensaje());
        editor.setTexto(editor.getPortapapeles());
        return true;

    }

}
