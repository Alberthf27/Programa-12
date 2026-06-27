
package programa_12;

import java.util.ArrayList;


public class PizzaDePeperoni extends Pizza{

    public PizzaDePeperoni() {
        this.nombre  = "Pizza de peperoni";
        this.masa  = "Masa de corteza gruesa";
        this.salsa  = "Salsa roja";
        this.adicionales = new ArrayList<>(); 
        this.adicionales.add("Pepperoni en rodajas");
        this.adicionales.add("Queso parmesano gratinado");
        this.adicionales.add("Cebolla picada");
        
    }
    


    
}
