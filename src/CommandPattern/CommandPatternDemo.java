package CommandPattern;

public class CommandPatternDemo {
	public static void main(String args[]) {
		Chef chef=new Chef();
		
		OrderCommand bakeCommand=new BakePizzaCommand(chef);
		OrderCommand deliverCommand=new DeliverPizzaCommand(chef);
		
		Waiter waiter=new Waiter();
		
		waiter.setCommand(bakeCommand);
        waiter.executeCommand();

        waiter.setCommand(deliverCommand);
        waiter.executeCommand();
	}
}
