package ChainOfResponsibilityPattern;

public class Waiter extends OrderHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Take Order")) {
            System.out.println("Waiter takes the order.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
