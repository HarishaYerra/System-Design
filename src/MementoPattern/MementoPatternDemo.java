package MementoPattern;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Order order = new Order();
        OrderHistory history = new OrderHistory();

        order.setState("Ordered");
        history.add(order.saveStateToMemento());

        order.setState("Preparing");
        history.add(order.saveStateToMemento());

        order.setState("Out for Delivery");
        history.add(order.saveStateToMemento());

        order.setState("Delivered");

        // Undo - restore previous states
        order.getStateFromMemento(history.get(2));
        order.getStateFromMemento(history.get(0));
    }
}
