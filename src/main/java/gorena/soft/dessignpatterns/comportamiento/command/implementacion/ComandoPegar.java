package gorena.soft.dessignpatterns.comportamiento.command.implementacion;

import gorena.soft.dessignpatterns.comportamiento.command.interfaz.Command;
import gorena.soft.dessignpatterns.comportamiento.command.interfaz.Editor;

public class ComandoPegar extends Command {

    public ComandoPegar(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        System.out.println("se esta pegando del portapaples");
        backup();
        editor.setMensaje(editor.getPortapapeles());
        return true;

    }

}
