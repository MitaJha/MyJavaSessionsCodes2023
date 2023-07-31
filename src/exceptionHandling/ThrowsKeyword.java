package exceptionHandling;

public class ThrowsKeyword {
	//TrowsKeyword doesn't handle the exception, it throws/pass the exception to other method who is calling the particular method with the exception 

	public void m1() {
		System.out.println("m1 method");
		
		try {
			m2();
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
			
		}
		
	}

	public void m2()  throws ArithmeticException {
		System.out.println("m2 method");
		m3();
	}
	
	

	public void m3() throws ArithmeticException {
		System.out.println("m3 method");
		int i = 9/0;
	}
	
	
	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		 System.out.println("HELLO");
}
}