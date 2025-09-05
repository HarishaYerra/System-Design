package CompositePattern;

public class PizzaItem implements MenuComponent{

	private String name;
	private double price;
	public PizzaItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public void showDetails() {
		System.out.println("Pizza : " + name + " | price:" + price);
	}
	
	
}
