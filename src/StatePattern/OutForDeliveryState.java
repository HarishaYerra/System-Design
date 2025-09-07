package StatePattern;

public class OutForDeliveryState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Order is out for delivery.");
    }
}