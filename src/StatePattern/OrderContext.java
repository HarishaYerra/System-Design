package StatePattern;


public class OrderContext {
    private OrderState state;

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        if (state != null) {
            state.handleRequest();
        } else {
            System.out.println("No state assigned to order!");
        }
    }
}

