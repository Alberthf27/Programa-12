package programa_12;

public class PROGRAMA_12 {

    public static void main(String[] args) {

        SimplePizzaFactory f = new SimplePizzaFactory();
        Pizzeria pizzeria = new Pizzeria(f);
                
        System.out.println("BIENVENIDOS A LA PIZZERIA");
                
        System.out.println("ORDEN: PIZZA DE QUESO");
        pizzeria.ordenarPizza("deQueso");
        
        System.out.println("ORDEN: PIZZA VEGETARIANA");
        pizzeria.ordenarPizza("vegetariana");
        
        System.out.println("ORDEN: PIZZA DE PEPERONI");
        pizzeria.ordenarPizza("dePeperoni");
        
        System.out.println("ORDEN: PIZZA DE ALMEJAS");
        pizzeria.ordenarPizza("deAlmejas");
    }
    
}
