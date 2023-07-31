package methodCallingConcept;

public class User {
	
	public void sendEmail() {
		System.out.println("Sending email");
		test(50);
	}
	public static void getEmail(User u) {
		System.out.println("Getting email");
		u.sendEmail();
		User.readEmail(u);
		u.test(30);
	}
	public static void readEmail(User u2) {
		System.out.println("Reading email");
		u2.sendEmail();
	}	
	
	public  void  test(int i) {
	System.out.println(i);
	
	}
	

	public static void main(String[] args) {

		User u1 = new User();
		User.getEmail(u1);  //calling by reference
		u1.test(20);   //call by value
		
	}

}
