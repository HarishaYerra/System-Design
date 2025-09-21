package TemplatePattern;

public abstract class OrderProcessTemplate {
	public final void processOrder() {
		selectItem();
		makePayment();
		deliverItem();
	}
	
	protected abstract void selectItem();
	protected abstract void makePayment();
	protected abstract void deliverItem();
}
