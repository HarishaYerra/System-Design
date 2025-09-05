package ChainOfResponsibilityPattern;

public class Chef extends OrderHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Cook Pizza")) {
            System.out.println("Chef cooks the pizza.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}