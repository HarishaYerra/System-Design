package Strategy_Pattern;

public class PaymentContext {
	private PaymentStrategy strategy;
	
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy=strategy;
	}
	
	public void checkout(int amount) {
		if(strategy!=null) {
			strategy.pay(amount);
		}else {
			System.out.println("No payment method added");
		}
	}
}
