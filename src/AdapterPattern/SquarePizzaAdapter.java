package AdapterPattern;

public class SquarePizzaAdapter implements RoundPizza {
	private SquarePizza squarePizza;
	
	public SquarePizzaAdapter(SquarePizza squarePizza) {
		this.squarePizza=squarePizza;
	}
	
	@Override
	public void fitinRoundOven() {
		System.out.println("Adapting Square Pizza to fit in Round Pizza");
		squarePizza.fitinSquareOven();
	}
}
