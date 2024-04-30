package gorena.soft.dessignpatterns.comportamiento.command.implementacion;

import java.util.Stack;

import gorena.soft.dessignpatterns.comportamiento.command.interfaz.Command;

public class HistorialComandos {
    private Stack<Command> historial = new Stack<>();

    public void push(Command c) {
        historial.push(c);
    }

    public Command pop() {
        return historial.pop();
    }

    public boolean estaVacio() {
        return historial.isEmpty();
    }
}
