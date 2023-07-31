package constructorAssignment;

public class Rectangle {
	private double length;
	private double width;
	 public Rectangle()
	 
	 //default constructor
	   {
	      length = 0.0;
	      width  = 0.0;
	   }
	 //constructor with params
	 
	 public Rectangle(double l, double w)
	   {
	      length = l;
	      width  = w;
	   }
	 
	 public void set(double l, double w)
	   {
	      length = l;
	      width  = w;
	   }
	 
	 public double getArea()
	   {
	      return length * width;
	   }
}
// The purpose of the default constructor is to initialize the attributes of the object with their default values.
//Default constructor has 0 argument while parameterized constructor has one or more than one arguments.
//Yes a constructor can be private.If the constructor is private , no one can create object of the class.
// A constructor cannot call a method from another class.