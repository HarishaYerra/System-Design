package PrototypePattern;

public class Employee implements Prototype{
		private int id ;
		private String name;
		private String dept;
		public Employee(int id, String name, String dept) {
			super();
			this.id = id;
			this.name = name;
			this.dept = dept;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
		}
		
		@Override
		public Prototype clone() {
			return new Employee(id,name,dept);
		}
}
