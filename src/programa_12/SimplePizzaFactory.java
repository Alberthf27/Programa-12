package programa_12;

public  class SimplePizzaFactory {

    public Pizza crearPizza(String type) {
        Pizza pizza = null;
        if (type.equals("deQueso")) {
            pizza = new PizzaDeQueso();
            return pizza;
        } else if (type.equals("dePeperoni")) {
            pizza = new PizzaDePeperoni();
            return pizza;
        } else if (type.equals("vegetariana")) {
            pizza = new PizzaDePeperoni();
            return pizza;
        } else if (type.equals("deAlmejas")) {
            pizza = new PizzaDeAlmejas();
            return pizza;
        }
        
        return pizza;
    }
}
