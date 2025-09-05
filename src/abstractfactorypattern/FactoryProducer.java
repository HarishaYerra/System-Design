package abstractfactorypattern;

public class FactoryProducer {
	public static GUIFactory getFactory(String type) {
		if("Windows".equalsIgnoreCase(type)) {
			return new WindowsFactory();
		}
		else if("Mac".equalsIgnoreCase(type)) {
			return new MacFactory();
		}
		return null;
	}
}
