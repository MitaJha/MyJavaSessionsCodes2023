package exceptionHandling;

public class Employee {

	String name;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		System.out.println("A");
		
		try {
		Employee e = new Employee();
			e = null;
			System.out.println(e.name);
		
			//int i = 9/0;
		
		System.out.println("Hello");
		System.out.println("Hi");
		System.out.println("GM");
		}
//		catch(Exception e) {
//			System.out.println("exception is coming");
//			e.printStackTrace();
//		}
		catch(Throwable e) {
			System.out.println("exception is coming");
			e.printStackTrace();
		}
//		catch(NullPointerException e ){
//			System.out.println("NPE is coming");
//			e.printStackTrace();
//		}
//		catch(ArithmeticException e ){
//			System.out.println("AE is coming");
//			e.printStackTrace();
//			
//		}


		System.out.println("Bye");

	}

}
