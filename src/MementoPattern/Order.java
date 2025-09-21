package MementoPattern;

public class Order {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Order state changed to: " + state);
    }

    public String getState() {
        return state;
    }

    // Save current state into a Memento
    public OrderMemento saveStateToMemento() {
        return new OrderMemento(state);
    }

    // Restore state from Memento
    public void getStateFromMemento(OrderMemento memento) {
        state = memento.getState();
        System.out.println("Order restored to: " + state);
    }
}
