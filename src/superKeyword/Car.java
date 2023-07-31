package superKeyword;

public class Car {
	int min_speed = 100;
	
	public void speed() {
		System.out.println("car speed");
	}
	
	public Car() {
		System.out.println("car default constructor");
	}
	public Car(int i) {
		System.out.println("car default constructor "+i);
	}
}
