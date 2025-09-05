package FlyweightPattern;

public class FlyweightPatternDemo {
	 public static void main(String[] args) {
	        Pizza pizza1 = PizzaFactory.getPizza("Margherita");
	        pizza1.serve(1);

	        Pizza pizza2 = PizzaFactory.getPizza("Margherita");
	        pizza2.serve(2);

	        Pizza pizza3 = PizzaFactory.getPizza("Pepperoni");
	        pizza3.serve(3);

	        Pizza pizza4 = PizzaFactory.getPizza("Pepperoni");
	        pizza4.serve(4);
	    }
}
