package FlyweightPattern;

public class MargheritaPizza implements Pizza{
	
	private final String type;
	
	public MargheritaPizza() {
		this.type="Margherita";
		System.out.println("Creating Margherita Pizza");
	}
	
	public void serve(int tableNumber) {
		System.out.println("Serving "+ type +" Pizza to table"+tableNumber);
	}

}
