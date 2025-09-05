package ChainOfResponsibilityPattern;

public class Cashier extends OrderHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Process Payment")) {
            System.out.println("Cashier processes the payment.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
