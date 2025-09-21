package MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
    private List<OrderMemento> history = new ArrayList<>();

    public void add(OrderMemento state) {
        history.add(state);
    }

    public OrderMemento get(int index) {
        return history.get(index);
    }
}
