package CompositePattern;

//CompositePatternDemo.java
public class CompositePatternDemo {
 public static void main(String[] args) {
     // Leaf nodes
     PizzaItem margherita = new PizzaItem("Margherita", 200);
     PizzaItem pepperoni = new PizzaItem("Pepperoni", 300);
     PizzaItem vegDelight = new PizzaItem("Veg Delight", 250);

     // Composite - Veg Combo
     PizzaMenu vegCombo = new PizzaMenu("Veg Combo");
     vegCombo.addItem(margherita);
     vegCombo.addItem(vegDelight);

     // Composite - Full Menu
     PizzaMenu fullMenu = new PizzaMenu("Full Menu");
     fullMenu.addItem(vegCombo);
     fullMenu.addItem(pepperoni);

     // Client treats individual and group uniformly
     fullMenu.showDetails();
 }
}
