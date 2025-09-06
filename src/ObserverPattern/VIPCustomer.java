package ObserverPattern;

public class VIPCustomer implements Observer{
	
	private String name;

	public VIPCustomer(String name) {
		this.name=name;
	}
	
	@Override
	public void update(String status) {
		System.out.println("VIPCustomer Notified"+name+":"+status);
	}
}
