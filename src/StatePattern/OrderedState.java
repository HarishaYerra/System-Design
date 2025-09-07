package StatePattern;

public class OrderedState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Order placed. Waiting for preparation.");
    }
}
