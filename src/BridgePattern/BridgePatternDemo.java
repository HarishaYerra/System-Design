package BridgePattern;

public class BridgePatternDemo {
	public static void main(String args[]) {
		Pizza smallVeg=new VegPizza(new SmallSize());
		smallVeg.makePizza();
		
		Pizza largeVeg=new NVPizza(new LargeSize());
		largeVeg.makePizza();
	}
}
