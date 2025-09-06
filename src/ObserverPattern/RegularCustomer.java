package ObserverPattern;

public class RegularCustomer implements Observer{
	private String name;
	public RegularCustomer(String name) {
		this.name=name;
	}
	
	@Override
	public void update(String status) {
		System.out.println("Regulat Customer notified"+name+ ":"+ status);
	}
}
