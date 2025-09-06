package Strategy_Pattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876"));
        context.checkout(500);

        // Pay with UPI
        context.setPaymentStrategy(new UPIPayment("harisha@upi"));
        context.checkout(300);
    }
}

