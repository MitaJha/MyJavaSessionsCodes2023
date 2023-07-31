package OOPInheritance;

public class Car extends Vehicle{
	public void start() {
		System.out.println(" Car-------- start");
	}
	public void stop() {
		System.out.println(" Car-------- stop");
	}
	public void refuel() {
		System.out.println(" Car--------refuel");
	}

	// a static method can't be overridden but can be inherited
	//by using child class name we can inherit 
	public static void billing() {
		System.out.println("car ------billing"); 
	}

	//a private method can't be overridden	
	private void testing() {
			System.out.println("Car ----testing");
		}
	// calling private method using encapsulation(calling private method to public method of same class
	
	public void test1() {
		testing();
	}
	
	//can't be overridden
	//final will prevent a method  overriding 
	public final void power() {
		System.out.println("car----- power");
	}
}
