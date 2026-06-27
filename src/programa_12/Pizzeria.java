
package programa_12;
import java.io.*;

import java.util.ArrayList;
public class Pizzeria {

    SimplePizzaFactory factory;

    public Pizzeria(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza ordenarPizza(String type) {
        Pizza pizza = factory.crearPizza(type);
        System.out.println(pizza.toString());

        for (int i = 0; i < pizza.adicionales.size(); i++) {
            System.out.println(pizza.adicionales.get(i));
        }

        pizza.preparar();
        pizza.cortar();
        pizza.hornear();
        pizza.envolver();

        return pizza;

    }
}
