package constructorAssignment;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.getMake();
		car1.getModel();
		car1.getYear();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());		
		
		
		Car car2 = new Car("TATA", "Harrier", 2023);
		car2.getMake();
		car2.getModel();
		car2.getYear();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}

}
