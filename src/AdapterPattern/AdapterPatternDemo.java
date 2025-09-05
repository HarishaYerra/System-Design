package AdapterPattern;

public class AdapterPatternDemo {
public static void main(String[] args) {
	RoundPizza pizza= new SquarePizzaAdapter(new SquarePizza());
	pizza.fitinRoundOven();
}
}
