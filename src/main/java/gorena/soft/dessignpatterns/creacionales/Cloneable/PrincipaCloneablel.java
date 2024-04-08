package gorena.soft.dessignpatterns.creacionales.Cloneable;

import java.time.LocalDate;

public class PrincipaCloneablel {

    public static void main(String[] args) throws CloneNotSupportedException {
        ClaseOriginal claseOriginal = new ClaseOriginal("Pedrito", LocalDate.of(1977, 7, 31), "Jefe");
        ClaseOriginal claseClonada = claseOriginal.clone();
        ClaseOriginal claseClonada2 = claseOriginal.clone();

        claseClonada.setFecha(LocalDate.of(2000, 7, 10));

        claseClonada2.setFecha(LocalDate.of(1980, 1, 30));
        claseClonada2.setCargo("Tecnico");
        System.out.println("Clase orignal datos:" + claseOriginal.toString() + " " + claseOriginal.calcularEdad());
        System.out.println("Clase clonada datos" + claseClonada.toString() + " " + claseClonada.calcularEdad());
        System.out.println("Clase clonada datos" + claseClonada2.toString() + " " + claseClonada2.calcularEdad());
    }

}
