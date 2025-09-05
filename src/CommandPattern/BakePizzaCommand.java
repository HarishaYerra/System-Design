package CommandPattern;

public class BakePizzaCommand implements OrderCommand{
	private Chef chef;
	public BakePizzaCommand(Chef chef) {
		this.chef=chef;
	}
	@Override
	public void execute() {
		chef.bakePizza();
	}

}
