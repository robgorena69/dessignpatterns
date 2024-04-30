package gorena.soft.dessignpatterns.comportamiento.command.interfaz;

public abstract class Command {

    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    protected void backup() {
        backup = editor.getMensaje();
    }

    public void undo() {
        editor.setMensaje(backup);
    }

    public abstract boolean execute();
}
