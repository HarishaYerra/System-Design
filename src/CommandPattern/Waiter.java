package CommandPattern;

public class Waiter {
	private OrderCommand command;
	
	public void setCommand(OrderCommand command) {
		this.command=command;
	}
	
	public void executeCommand() {
		if(command!=null) {
			command.execute();
		}
	}
}
