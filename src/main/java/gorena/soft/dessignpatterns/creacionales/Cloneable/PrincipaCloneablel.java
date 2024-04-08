package gorena.soft.dessignpatterns.creacionales.Cloneable;

import java.time.LocalDate;

public class PrincipaCloneablel {

    public static void main(String[] args) {
        ClaseOriginal claseOriginal = new ClaseOriginal("Pedrito", LocalDate.of(1977, 7, 31), "Jefe");
        Clase claseClonada = claseOriginal.System.out
                .println("Clase orignal datos:" + claseOriginal.toString() + " " + claseOriginal.calcularEdad());
    }
}
