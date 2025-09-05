package abstractfactorypattern;

public class MacCheckbox implements Checkbox {
	
	@Override
	public void paint() {
		System.out.println("Rendering a Mac CheckBox");
	}
}
