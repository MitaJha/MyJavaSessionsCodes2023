package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("ABC");
		try {
			int i = 4/0;			
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		finally {
			System.out.println("I'm in finally block");
		}
		
	}

}
