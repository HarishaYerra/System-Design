package ProxyPattern;

public class ProxyPatternDemo {
	public static void main(String[] args) {
        Pizza pizza1 = new ProxyPizza("Margherita");
        pizza1.orderPizza(); // First time: proxy + real creation
        System.out.println();

        Pizza pizza2 = new ProxyPizza("Margherita");
        pizza2.orderPizza(); // Again proxy, creates new real object if needed

        Pizza pizza3 = new ProxyPizza("Pepperoni");
        pizza3.orderPizza();
	}
}
