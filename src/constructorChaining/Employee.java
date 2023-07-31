package constructorChaining;
//constructor chaining is possible in java with the help of this keyword
// when we want to call a constructor inside another constructor (this)statement should be the first statement

public class Employee {
	
	String name;
	int age;
	double salary;
	
	public Employee() {
	this("Guggi", 14 );	
	}

	public Employee(String name, int age) {
		this.name = "Gargi";
		this.age = 10;


	}
	public Employee(String name, int age, double salary) {
		this.name ="Stuti";
		this.age = 11;
		this.salary = 20.0;
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
		
		

	}
	

}
