package oop_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Guggi");
		e1.setAge(14);
		e1.setSalary(15.55);
		//e1.getAmount(100);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getAmount(100));
		
		System.out.println("-----------");
		Employee e2 = new Employee();
		e2.setName(("sam"));
		e2.setAge(24);
		e2.setSalary(17.55);
		//e1.getAmount(100);
		
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		System.out.println(e2.getSalary());
		System.out.println(e2.getAmount(75));
		
		
	}

}
