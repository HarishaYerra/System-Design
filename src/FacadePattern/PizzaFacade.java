package FacadePattern;

public class PizzaFacade {
	private DoughMaker doughMaker;
	private SauceMaker sauceMaker;
	private ToppingsMaker toppingsMaker;
	private Oven oven;
	
	public PizzaFacade() {
		this.doughMaker=new DoughMaker();
		this.sauceMaker=new SauceMaker();
		this.toppingsMaker=new ToppingsMaker();
		this.oven=new Oven();
	}
	
	public void orderPizza() {
		System.out.println("\nOrdering Pizza...");
		doughMaker.Dough();
		sauceMaker.Sauce();
		toppingsMaker.Toppings();
		oven.Bake();
		
		System.out.println("Pizza is ready!!!...");
		
	}
}
