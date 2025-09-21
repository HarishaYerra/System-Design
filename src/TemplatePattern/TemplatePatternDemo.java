package TemplatePattern;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        
        OrderProcessTemplate onlineOrder = new OnlineOrder();
        System.out.println("Online Order Process:");
        onlineOrder.processOrder();

        System.out.println("\nStore Order Process:");
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
