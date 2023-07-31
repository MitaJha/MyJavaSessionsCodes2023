package exceptionHandling;

public class TestException {

	public static void main(String[] args) {

		//int i[] = new int[2];
		//i[2] = 10; //AIOB(unchecked Exception)
		
//Throwing the exception deliberately
		
		String browser ="ff";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome ");
		}
		else {
			System.out.println("browser not found");
			throw new MyExceptions("this browser is not found");
		//this custom exceptions are used in negative conditions
		}
		System.out.println("enter the url");
	}
	

}
