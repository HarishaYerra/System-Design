package CommandPattern;

public class DeliverPizzaCommand implements OrderCommand {
	Chef chef;
	
	public DeliverPizzaCommand(Chef chef) {
		this.chef=chef;
	}
	
	@Override
	public void execute() {
		chef.deliverPizza();
	}
}
