package OOPInheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.stop();
		b.autoParking();
		b.refuel();
		b.engine();
		BMW.billing();
		Car.billing();
		System.out.println("----------");
		
	Car c = new Car();
	c.start();
	c.stop();
	c.refuel();
	c.engine();
	c.test1();
	
	System.out.println("----------");
	//child class object can be referred by parent class ref variables
	//top casting or up casting 
	Car c1 = new BMW();
	c1.start();
	c1.stop();
	c1.refuel();
	c1.engine();
	System.out.println("----------");
	
	Vehicle v = new BMW();
	v.engine();
	
	//Down casting is possible during compile time but runtime it is not allowed
	//parent class object can be referred  by child class ref variable b down casting.
	
	//BMW b1 = (BMW) new Car();
	///b1.start();//give CCE (ClassCastingException error)
}
}