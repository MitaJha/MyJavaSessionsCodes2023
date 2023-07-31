package constructorAssignment;

public class EmloyeeTest {
	public static void main(String[] args) {
	
		Employee emp = new Employee(1001, "John", 25.5);
		emp.getName();
		emp.getId();
		emp.getSalary();
		//emp.getNewSalary();
		
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getSalary());
		//System.out.println(emp.getNewSalary());
		
		double newSalary =  emp.getSalary() + emp.getSalary()*10/100;
		emp.setNewSalary(newSalary);
		emp.getNewSalary();
		
		System.out.println(emp.getNewSalary());
	}
	
	// Purpose of getter method is to return the value of instance variable passed as the parameters in setter method.	
	// A getter method cannot return void.
	//Purpose of setter method is to set the value of instance variable.
	//A setter method doesn't return any value it only set the value of instance variable.
	
}
