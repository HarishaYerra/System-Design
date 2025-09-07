package StatePattern;

public class PreparingState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Order is being prepared.");
    }
}
