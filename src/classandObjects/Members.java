package classandObjects;

public class Members {

	// instance vars
	String name;
	int age;

	// data members of the class
	// vars -- class
	// methods/functions -- are used for business
	// logic/feature/implementation/actions

	// We can not create a method inside a method.
	// but can call a method from another method.
	// methods are independent or parallel to each other

	// Types of methods:

	// 1. no return and no input:
	// void - can not return anything -- no return keyword(Invalid).

	public void test() {
		System.out.println("This is test method");
		int i = 10;
		System.out.println(i);
	}

	// 2. No input but some return:

	public int addition() {

		System.out.println("sum of two numbers");
		int a = 15;
		int b = 25;
		int c = a + b;
		return c;
	}

	public String name() {
		System.out.println(" My name is:");
		String s = "Mita";
		String s1 = "Jha";
		String s2 = s + s1;
		return s2;
	}

	// 3. some input and some return

	public int product(int x, int y) {
		System.out.println("Product of x and y is");// x and y are the parameters
		int z = x * y;
		return z;

	}

	public static void main(String[] args) {

		Members m1 = new Members(); // creating the Object.

		m1.test(); // calling a method in main method.

		System.out.println("________");

		int add = m1.addition();

		System.out.println(add + 100);

		System.out.println("________");

		String myName = m1.name();

		System.out.println(myName);
		if (myName.equals("MitaJha")) {
			System.out.println("ok");
		} 
		else {
			System.out.println("bye");
		}

		System.out.println("________");

		int prod = m1.product(19, 2);

		// assigning values(args) for x and y for product method

		System.out.println(prod);

		System.out.println((prod + add));

	}

}
