package FlyweightPattern;

public class PepperoniPizza implements Pizza{
private final String type;
	
	public PepperoniPizza() {
		this.type="Margherita";
		System.out.println("Creating Pepperoni Pizza");
	}
	
	public void serve(int tableNumber) {
		System.out.println("Serving "+ type +" Pizza to table"+tableNumber);
	}
}
