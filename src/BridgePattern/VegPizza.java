package BridgePattern;

public class VegPizza extends Pizza {
	public VegPizza(PizzaSize size) {
		super(size);
	}
	@Override
	public void makePizza() {
		System.out.println("Makking Veg Pizza of");
		size.setSize();
	}

}
