package OOP_Abstraction;

public interface USMedical extends WHO, UN{
	
	int min_fee = 10;
	//variable in interface is by default static and final
	
	//these are abstract method- no method body only method declaration
	//we don't write any business logic in abstract method
	
	//abstraction---hiding the implementation
	
	public void cardiologyServices();
	
	public void neurologyServices();
	
	public void opticalServices();
	
	public void ENTServices();
	
	public void emergencyServices();
	
	public void test(int i);
	
	public String get(int a);  //abstract method can also be overloaded
	
	public String get(int a, int b);
	
	//interface can not have any parent class, it only can have parent interface
	// a child class can have multiple parent interfaces but only and only one parent class
}
