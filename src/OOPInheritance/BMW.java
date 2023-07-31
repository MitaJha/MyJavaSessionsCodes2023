package OOPInheritance;

public class BMW extends Car {
	
		//method overriding: RunTime Polymorphism
		//when we have a method in parent class and the same method in child class with:
		//the same name
		//the same number of parameters
		//the same sequence/order of the parameters
		//the same return type
	
	@Override
	public void start() {
		System.out.println("BMW------start");
	}
	
	//individual
	public void autoParking() {
		System.out.println("BMW-------- auto parking");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW-------- turbo-engine");
	}
	
	// this method is not overriding.
	//static method can not be overridden.
	// this is called method hiding.
	//when you try to have the same static method in both parent and child class it is called method hiding.
	public static void billing() {
		System.out.println("BMW ------billing"); 
	}
	
	//not overridden method , it is an individual method
	//it is not method hiding because it is not a static method
	private void testing() {
		System.out.println("BMW ----testing");
	}
}
