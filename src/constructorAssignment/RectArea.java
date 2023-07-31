package constructorAssignment;

public class RectArea {
	
	public static void main(String[] args) {
     
		//creating object of constructor and calling the getArea method
		
		Rectangle rectangle1 = new Rectangle();
		
		rectangle1.getArea();
		
		System.out.println("Area of Rectangle is "
                + rectangle1.getArea());
		
		System.out.println("-------------");
		
		 Rectangle rectangle2 = new Rectangle(10.0, 9.0);
		 
		 rectangle2.getArea();
		 
		 System.out.println("Area of Rectangle is "
                 + rectangle2.getArea());
}
}