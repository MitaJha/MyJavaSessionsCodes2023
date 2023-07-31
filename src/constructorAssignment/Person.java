package constructorAssignment;

public class Person {
	String name;
	int age;
	char gender;
	double height;
	
		public Person(String name, int age, char gender, double height) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		}
		
		
		public void personInfo() {
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			System.out.println(height);
		}
	
//constructor plays an important role to initialize class variable. It also restrict unnecessary object creation.  
//constructor has no return type and it carry the class name but method name should be same as class name and it always has a return type.
//JAva has more than one constructor with different type and orders of  parameters. it means constructor can also be overloaded	
//A constructor can call other methods or constructors within the same class.	
		
		
}
