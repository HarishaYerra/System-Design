package ChainOfResponsibilityPattern;

public abstract class OrderHandler {
    protected OrderHandler nextHandler;

    public void setHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}