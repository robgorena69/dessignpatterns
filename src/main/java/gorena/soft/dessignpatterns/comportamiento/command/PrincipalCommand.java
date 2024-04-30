package gorena.soft.dessignpatterns.comportamiento.command;

import gorena.soft.dessignpatterns.comportamiento.command.implementacion.ComandoCopiar;
import gorena.soft.dessignpatterns.comportamiento.command.implementacion.ComandoCortar;
import gorena.soft.dessignpatterns.comportamiento.command.implementacion.ComandoPegar;
import gorena.soft.dessignpatterns.comportamiento.command.implementacion.HistorialComandos;
import gorena.soft.dessignpatterns.comportamiento.command.interfaz.Command;
import gorena.soft.dessignpatterns.comportamiento.command.interfaz.Editor;

public class PrincipalCommand {

    public static void main(String[] args) {
        HistorialComandos historialComandos = new HistorialComandos();
        Editor editor = new Editor();
        editor.setMensaje("copiando");

        historialComandos.push(new ComandoCopiar(editor));

        historialComandos.push(new ComandoPegar(editor));
        historialComandos.push(new ComandoCortar(editor));
        Command comando = historialComandos.pop();
        comando.execute();
        comando = historialComandos.pop();
        comando.execute();
        comando = historialComandos.pop();
        comando.execute();

    }
}
