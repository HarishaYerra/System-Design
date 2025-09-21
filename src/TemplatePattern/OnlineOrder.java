package TemplatePattern;

public class OnlineOrder extends OrderProcessTemplate {

    @Override
    protected void selectItem() {
        System.out.println("Customer selects item from website.");
    }

    @Override
    protected void makePayment() {
        System.out.println("Payment made online via credit card.");
    }

    @Override
    protected void deliverItem() {
        System.out.println("Item delivered to customer address.");
    }
}
