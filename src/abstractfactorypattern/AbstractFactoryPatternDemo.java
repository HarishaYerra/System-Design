package abstractfactorypattern;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		GUIFactory factory= FactoryProducer.getFactory("Windows");
		Button button = factory.createButton();
		Checkbox checkbox=factory.createCheckbox();
		button.paint();
		checkbox.paint();
		
		System.out.println("----------------------------");
		
		factory= FactoryProducer.getFactory("Mac");
		button = factory.createButton();
		checkbox=factory.createCheckbox();
		button.paint();
		checkbox.paint();
	}
}
