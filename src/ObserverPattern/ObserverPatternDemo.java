package ObserverPattern;

public class ObserverPatternDemo {
	public static void main(String args[]) {
		Order order=new Order();
		Observer cust1=new RegularCustomer("Alice");
		//Observer cust2=new RegularCustomer("Harisha");
		
		order.addObserver(cust1);
		//.order.addObserver(cust2);
		
		order.setStatus("Being Prepared");
        order.setStatus("Out for Delivery");
        order.setStatus("Delivered");
	}
}
