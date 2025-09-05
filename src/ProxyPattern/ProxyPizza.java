package ProxyPattern;

public class ProxyPizza implements Pizza{
	private RealPizza realPizza;
    private String type;

    public ProxyPizza(String type) {
        this.type = type;
    }

    @Override
    public void orderPizza() {
        if (realPizza == null) {
            System.out.println("Proxy: Checking availability and payment...");
            realPizza = new RealPizza(type); // lazy initialization
        }
        realPizza.orderPizza();
    }
}
