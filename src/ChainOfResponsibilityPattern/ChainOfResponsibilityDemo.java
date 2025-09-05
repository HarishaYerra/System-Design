package ChainOfResponsibilityPattern;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        OrderHandler waiter = new Waiter();
        OrderHandler cashier = new Cashier();
        OrderHandler chef = new Chef();

        // Chain: Waiter -> Cashier -> Chef
        waiter.setHandler(cashier);
        cashier.setHandler(chef);

        // Send requests
        waiter.handleRequest("Take Order");
        waiter.handleRequest("Process Payment");
        waiter.handleRequest("Cook Pizza");
        waiter.handleRequest("Deliver Pizza"); // no handler
    }
}