package BridgePattern;

public abstract class Pizza {
	protected  PizzaSize size;
	
	protected Pizza(PizzaSize size) {
		this.size=size;
	}
	
	public abstract void makePizza();
}
