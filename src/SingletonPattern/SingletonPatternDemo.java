package SingletonPattern;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		//Get the single instance
		Singleton obj1=Singleton.getInstance();
		obj1.showMessage();
		
		//Try creating another instance
		Singleton obj2=Singleton.getInstance();
		obj2.showMessage();
		
		//check if both are same
		System.out.println("obj1==obj2?"+(obj1==obj2));
	}
}
