package staticConcepts;

public class Employee1 {
	
	String name;// instance variable(access using Object)
	
	static int age ;//static variable(access using ClassName)
					//can access directly also.
	
	public void getEmail() {
		System.out.println("get email method");
	}
	
	public static void sendEmail() {
		System.out.println("send email method");
	}
	
	
	
	
	
	
	public static void main(String[] args) {

	Employee1 e = new Employee1();
	e.name  = "Gargi";
	System.out.println(e.name);	
	
	Employee1.age = 10;	
	//age = 20;
	
	System.out.println(Employee1.age);
	
	e.getEmail();
	
	Employee1.sendEmail();
	
	}

}
