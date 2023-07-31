package superKeyword;

public class BMW extends Car {
	int min_speed = 200;
	
	public void displaySpeed() {
		System.out.println(min_speed);
		System.out.println(super.min_speed);
//advantage of super keyword is that we can access all the parent property without creating the parent object.

	}
		public void speed() {
			System.out.println("BMW speed");
			super.speed();
		}
		public BMW() {
			//super();  			// we can't call 2 constructor at a time
			this(20);  				//this keyword is used to call constructor from same class and super keyword is for parent class constructor
			System.out.println("BMW default constructor");
		}
		public BMW(int i) {
			System.out.println("BMW default constructor "+i);
		}
	

}
