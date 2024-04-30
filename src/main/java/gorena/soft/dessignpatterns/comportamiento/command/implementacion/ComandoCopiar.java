package gorena.soft.dessignpatterns.comportamiento.command.implementacion;

import gorena.soft.dessignpatterns.comportamiento.command.interfaz.Command;
import gorena.soft.dessignpatterns.comportamiento.command.interfaz.Editor;

public class ComandoCopiar extends Command {

    public ComandoCopiar(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        System.out.println("se esta copiando el portapapeles");
        editor.setPortapapeles(editor.getMensaje());
        return false;
    }

}
