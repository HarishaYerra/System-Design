package PrototypePattern;

public class PrototypePatternDemo {
	public static void main(String args[]) {
		Employee emp1=new Employee(1,"Harisha","HR");
		
		//clone emp1 to emp2
		Employee emp2= (Employee) emp1.clone();
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println("emp1==emp2?" +(emp1==emp2));
	}
}
