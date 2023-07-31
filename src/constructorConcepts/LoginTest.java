package constructorConcepts;

public class LoginTest {
	
	public static void main(String[] args) {

		// we can create n number of objects for n number of users for login
		
		LoginPage lp = new LoginPage("guggi@gmail.com", "guggi@123");
		lp.doLogin();
		
		
		LoginPage lp1 = new LoginPage("gargi@gmail.com", "gargi@123");
		lp1.doLogin();

}
}