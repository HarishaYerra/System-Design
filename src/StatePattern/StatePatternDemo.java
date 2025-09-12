package StatePattern;

//StatePatternDemo
public class StatePatternDemo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.setState(new OrderedState());
        order.processOrder();

        order.setState(new PreparingState());
        order.processOrder();

        order.setState(new OutForDeliveryState());
        order.processOrder();

        order.setState(new DeliveredState());
        order.processOrder();
        
        
    }
}
