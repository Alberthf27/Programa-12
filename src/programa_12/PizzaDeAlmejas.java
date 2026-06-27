package programa_12;

import java.util.ArrayList;

public class PizzaDeAlmejas extends Pizza {
    
    public PizzaDeAlmejas() {
        this.nombre = "Pizza de almejas";
        this.masa = "Masa de corteza delgada";
        this.salsa = "Salsa blanca de ajo";
        this.adicionales = new ArrayList<>(); 
        this.adicionales.add("Almejas");
        this.adicionales.add("Queso parmesano");
    }


}


