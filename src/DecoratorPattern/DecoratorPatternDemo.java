package DecoratorPattern;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Pizza pizza= new MargheritaPizza();
		
		pizza=new CheeseDecorator(pizza);
		pizza= new OlivesDecorator(pizza);
		
		System.out.println("Order : "+pizza.getDescription());
		System.out.println("Total Cost : "+pizza.getCost());
	}
}
