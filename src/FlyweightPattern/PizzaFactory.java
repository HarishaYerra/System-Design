package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class PizzaFactory {
    private static final Map<String, Pizza> pizzaCache = new HashMap<>();

    public static Pizza getPizza(String type) {
        Pizza pizza = pizzaCache.get(type);

        if (pizza == null) {
            switch (type) {
                case "Margherita":
                    pizza = new MargheritaPizza();
                    break;
                case "Pepperoni":
                    pizza = new PepperoniPizza();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown pizza type: " + type);
            }
            pizzaCache.put(type, pizza);
        }
        return pizza;
    }
}
