package MementoPattern;

public class OrderMemento {
    private String state;

    public OrderMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
