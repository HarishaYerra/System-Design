package BuilderPattern;

//Employee.java
public class Employee {
 // Required parameters
 private String name;
 private int id;

 // Optional parameters
 private String department;
 private double salary;

 // Private constructor (only Builder can create Employee)
 private Employee(EmployeeBuilder builder) {
     this.name = builder.name;
     this.id = builder.id;
     this.department = builder.department;
     this.salary = builder.salary;
 }

 @Override
 public String toString() {
     return "Employee [id=" + id + ", name=" + name +
            ", department=" + department + ", salary=" + salary + "]";
 }

 // Static nested Builder class
 public static class EmployeeBuilder {
     private String name;
     private int id;
     private String department;
     private double salary;

     // Constructor for required fields
     public EmployeeBuilder(String name, int id) {
         this.name = name;
         this.id = id;
     }

     // Setter-style methods for optional fields
     public EmployeeBuilder setDepartment(String department) {
         this.department = department;
         return this; // return builder for chaining
     }

     public EmployeeBuilder setSalary(double salary) {
         this.salary = salary;
         return this;
     }

     // Build method to create Employee
     public Employee build() {
         return new Employee(this);
     }
 }
}
