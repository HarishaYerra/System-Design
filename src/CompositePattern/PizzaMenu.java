package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class PizzaMenu implements MenuComponent{
	private String menuName;
	private List<MenuComponent> items =new ArrayList<>();
	
	public PizzaMenu(String menuName) {
		this.menuName=menuName;
	}
	public void addItem(MenuComponent item) {
		items.add(item);
	}
	public void deleteItem(MenuComponent item) {
		items.remove(item);
	}
	
	@Override
	public void showDetails() {
		System.out.println("\n"+ menuName + " contains:");
		for(MenuComponent item: items) {
			item.showDetails();
		}
	}
}
