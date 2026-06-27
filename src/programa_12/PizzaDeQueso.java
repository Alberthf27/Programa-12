
package programa_12;

import java.util.ArrayList;

public class PizzaDeQueso extends  Pizza{

    public PizzaDeQueso() {
        this.nombre = "Pizza de queso";
        this.masa = "Sasa de croteza delgada";
        this.salsa = "Salsa de tomate";
        this.adicionales = new ArrayList<>(); 
        this.adicionales.add("Queso Mozzarella Fresca");
        this.adicionales.add("Queso parmesano");
    }

}
