package javalesson1;

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//final constant values	

		final int days = 7;//we can't change the value of days 
		int weeklySalary = 100*days;
		System.out.println(weeklySalary);
		
		
		final String title = "Login Page";
		System.out.println("go to " + " "+ title);
		
		final double baseprice = 15.99;
		System.out.println("all items starts at"+ " " + baseprice);
		
		final int highestmark = 100;
		System.out.println("you can score upto" + " " + highestmark);
		 
		final double pi = 3.14;
		System.out.println("the value of pi is" +" " + pi);
				
	}

}
