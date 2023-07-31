package constructorAssignment;

public class CallingConstructor {

	public static void main(String[] args) {

		CreatingConstructor cc = new CreatingConstructor("mita", 40, 25.0,"Atl");
		cc.getName();
		cc.getAge();
		cc.getSalary();
		cc.getCity();
		System.out.println("name is  "+ cc.getName());
		System.out.println("age is  "+ cc.getAge());
		System.out.println("salary is  "+ cc.getSalary());
		System.out.println("city is  "+ cc.getCity());

		
		
	}

}
