package ProxyPattern;

public class RealPizza implements Pizza {
	private String type;

    public RealPizza(String type) {
        this.type = type;
        makePizza();
    }

    private void makePizza() {
        System.out.println("Making " + type + " Pizza...");
    }

    @Override
    public void orderPizza() {
        System.out.println("Serving " + type + " Pizza to customer.");
    }
}
