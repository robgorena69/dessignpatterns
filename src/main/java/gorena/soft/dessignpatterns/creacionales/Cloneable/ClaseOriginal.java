package gorena.soft.dessignpatterns.creacionales.Cloneable;

import java.time.LocalDate;
import java.time.Period;

public class ClaseOriginal implements Cloneable {

    private String nombre;
    private LocalDate fecha;
    private String cargo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ClaseOriginal(String nombre, LocalDate fecha, String cargo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.cargo = cargo;
    }

    public int calcularEdad() {
        return Period.between(LocalDate.now(), fecha).getYears();
    }

    @Override
    public String toString() {
        return "Hola soy " + nombre + ", y tengo el  cargo=" + cargo + "]";
    }

    @Override
    public ClaseOriginal clone() throws CloneNotSupportedException {
        return (ClaseOriginal)super.clone();
    }

}
