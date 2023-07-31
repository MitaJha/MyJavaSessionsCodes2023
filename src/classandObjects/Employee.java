package classandObjects;

public class Employee {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		Employee emp1 = new Employee();// emp1 is object reference
		emp1.name = "Amit";
		emp1.age = 27;
		emp1.city = "Noida";

		Employee emp2 = new Employee();
		emp2.name = "Shweta";
		emp2.age = 40;
		emp2.city = "Blr";

		Employee emp3 = new Employee();
		emp3.name = "Sunny";
		emp3.age = 39;
		emp3.city = "Pune";

		Employee emp4 = new Employee();
		emp4.name = "Arti";
		emp4.age = 33;
		emp4.city = "Chennai";

		System.out.println(emp1.name + " " + emp1.age + " " + emp1.city);
		System.out.println(emp2.name + " " + emp2.age + " " + emp2.city);
		System.out.println(emp3.name + " " + emp3.age + " " + emp3.city);
		System.out.println(emp4.name + " " + emp4.age + " " + emp4.city);

		emp1 = emp2;
		System.out.println("____________");
		System.out.println(emp1.name);
		System.out.println(emp2.name);
		System.out.println(emp3.name);
		System.out.println(emp4.name);

		emp2 = emp3;
		System.out.println("____________");
		System.out.println(emp1.name);
		System.out.println(emp2.name);
		System.out.println(emp3.name);
		System.out.println(emp4.name);

		emp3 = emp4;
		System.out.println("____________");
		System.out.println(emp1.name);
		System.out.println(emp2.name);
		System.out.println(emp3.name);
		System.out.println(emp4.name);

		emp4 = emp1;
		System.out.println("____________");
		System.out.println(emp1.name);
		System.out.println(emp2.name);
		System.out.println(emp3.name);
		System.out.println(emp4.name);

		emp1 = emp2;
		System.out.println("____________");
		System.out.println(emp1.name);
		System.out.println(emp2.name);
		System.out.println(emp3.name);
		System.out.println(emp4.name);

		// No ref object
		System.out.println("____________");
		new Employee().name = "Amit";
		new Employee().age = 35;
		new Employee().city = "Pune";

		System.out.println("____________");

		// just the ref name:

		Employee e1;
		e1 = new Employee();
		e1.name = "Sam";
		System.out.println(e1.name);

		System.out.println("____________");

		// null ref object

		Employee e2 = new Employee();
		e2 = null;
		e2.name = "Rina";
		System.out.println(e2.name);// Null Pointer Exception

	}

}
