package BuilderPattern.copy;

public class BuilderPatternDemo {
	 public static void main(String[] args) {
	        // Create Employee with only required fields
	        Employee emp1 = new Employee.EmployeeBuilder("Alice", 101).build();

	        // Create Employee with all fields
	        Employee emp2 = new Employee.EmployeeBuilder("Bob", 102)
	                            .setDepartment("IT")
	                            .setSalary(60000)
	                            .build();

	        System.out.println(emp1);
	        System.out.println(emp2);
	    }
}
