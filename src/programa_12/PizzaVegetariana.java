package programa_12;

import java.util.ArrayList;

public class PizzaVegetariana extends Pizza {

    public PizzaVegetariana() {
        this.nombre = "Pizza Vegetariana";
        this.masa = "Masa de corteza regular ";
        this.salsa = "Salsa roja de pizza";
        this.adicionales = new ArrayList<>(); 
        this.adicionales.add("Mozzarela triturada");
        this.adicionales.add("Parmesano triturado");
        this.adicionales.add("Cebolla picada");
        this.adicionales.add("Champiñones picados");
        this.adicionales.add("Pimentón picado");
        this.adicionales.add("Aceitunas picadas");
    }

}
