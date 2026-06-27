package programa_12;

import java.util.ArrayList;

public class Pizza {

    String nombre;
    String masa;
    String salsa;
    ArrayList<Object> adicionales = null;

    public String getNombre() {
        return nombre;
    }

    void preparar() {
        System.out.println("Preparando " + this.getNombre());
    }

    void hornear() {
        System.out.println("Horneando " + this.getNombre());
    }

    void cortar() {
        System.out.println("Cortando " + this.getNombre());
    }

    void envolver() {
        System.out.println("Envolviendo " + this.getNombre());
    }

    @Override
    public String toString() {
        return "----" + nombre + "----" + "\n"
                + masa + "\n"
                + salsa + "\n";

    }

}
