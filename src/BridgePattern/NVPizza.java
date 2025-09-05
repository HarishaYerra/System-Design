package BridgePattern;

public class NVPizza extends Pizza{
	public NVPizza(PizzaSize size) {
		super(size);
	}
	
	@Override
	public void makePizza() {
		System.out.println("Making Non Veg Pizza");
		size.setSize();
	}
}
