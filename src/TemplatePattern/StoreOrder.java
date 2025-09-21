package TemplatePattern;

public class StoreOrder extends OrderProcessTemplate {

    @Override
    protected void selectItem() {
        System.out.println("Customer selects item from store.");
    }

    @Override
    protected void makePayment() {
        System.out.println("Customer pays cash at counter.");
    }

    @Override
    protected void deliverItem() {
        System.out.println("Customer takes item home directly.");
    }
}
