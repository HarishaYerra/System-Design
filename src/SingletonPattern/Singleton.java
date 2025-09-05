package SingletonPattern;

public class Singleton {
	//Step1:private static instance of the class
	private static Singleton singleInstance=null;
	//step2:private constructor so that no othe class can instansiate
	private Singleton() {
		System.out.println("Singleton instance created");
	}
		
	////step3:public method to provide global access point
	public static Singleton getInstance() {
		if(singleInstance==null) {
			singleInstance=new Singleton();
		}
		return singleInstance;
	}
	public void showMessage() {
		System.out.println("Hello from Singleton!");
	}
}
