package classandObjects;

public class MethodAssignment {
	//1. subtraction of two nos:
	public int subtraction(int x, int y) {
		System.out.println("Difference between two nos: ");
		int z = x - y;
		return z;
	}
	//2. product of two Double nos:

	public double multiplication(double x, double y) {
		System.out.println("product of  two double nos: ");
		double z = x * y;
		return z;
	}

	//3. circumference and area of a circle
	//c=2pi*r  area = pi*r^2
	// where pi = 3.14 and radius is r

	public double circumference(double p, int r) {
		System.out.println("circumference of a circle is :");
		double c = 2 * p * r;
		return c;

	}

	public double area(double p, int r) {
		System.out.println("area of a circle is :");
		double a = p * r * r;
		return a;

	}
	//5. A person is eligible to vote if his/her age is greater than or equal to 18.

	public int voteEligibilty() {
		System.out.println("Checking Eligibility for vote :");
		int v = 20;
		return v;
	}

	//6. even or odd number:
	public int evenOdd() {
		System.out.println("checking even or odd number");
		int a = 27;
		return a;
	}

	//7. Define a method that will display grades according to the marks entered
	public int grade() {
		System.out.println("Getting grades of students");
		int i = 42;
		return i;
	}
	//8. WAP to print the factorial of a number by defining a method named 'Factorial'.
	public int factorial(int x) {
		int fact=1;
		for(int i=1; i<=x; i++) {
			fact = fact*i;
		}
		System.out.println("the factorial of " + x + " is :");	
		
		return fact;
	}
	
	
	
	public static void main(String[] args) {

		MethodAssignment ma = new MethodAssignment();

		int s1 = ma.subtraction(90, 10);
		System.out.println(s1);

		System.out.println("_______");

		double d1 = ma.multiplication(10.5, 2.0);
		System.out.println(d1);

		System.out.println("_______");

		double circum = ma.circumference(3.14, 3);
		System.out.println(circum);

		System.out.println("_______");

		double ar = ma.area(3.14, 5);
		System.out.println(ar);
		System.out.println("_______");

		int vote = ma.voteEligibilty();
		if (vote >= 18) {
			System.out.println("Eligible for vote");
		} else {
			System.out.println("Not eligible for vote");
		}
		System.out.println("_______");

		int eo = ma.evenOdd();
		if (eo % 2 == 0) {
			System.out.println("It is an even number");
		} else {
			System.out.println("It is an odd number");
		}

		System.out.println("_______");

		int grd = ma.grade();
		if (grd >= 91 && grd <= 100) {
			System.out.println("AA");
		} else if (grd >= 81 && grd <= 90) {
			System.out.println("AB");
		}

		else if (grd >= 71 && grd <= 80) {
			System.out.println("BB");
		}

		else if (grd >= 61 && grd <= 70) {
			System.out.println("BC");
		}

		else if (grd >= 51 && grd <= 60) {
			System.out.println("CD");

		} else if (grd >= 41 && grd <= 50) {
			System.out.println("DD");
		}

		else if (grd <= 40) {
			System.out.println("FAIL");

		}
		
		System.out.println("_______");
		
		int num = ma.factorial(6);
		
		  
		System.out.println(num);
		
		

	}
	

}
