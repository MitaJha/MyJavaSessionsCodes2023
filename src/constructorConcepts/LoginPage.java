package constructorConcepts;

public class LoginPage { 

	String userName;
	String password;
	
	
	public LoginPage(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}

	public void doLogin() {//to test the login feature we need to make a different class loginTest 
		System.out.println("login to app");
		System.out.println("entering username: " + userName);
		System.out.println("entering password: " + password);
		System.out.println("user is logged in");
	}
	
	public void resetPwd() {
		System.out.println("reset my pwd" );
	}

	

}
