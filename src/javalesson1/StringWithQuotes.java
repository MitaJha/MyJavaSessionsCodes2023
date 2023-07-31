package javalesson1;

public class StringWithQuotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "I love \"Java\" programming language.";
System.out.println(str);
		
String username = "admin";
String password = "admin123";
String url = "https://"+username+":"+password+"@abc.com/login.html";
		
		System.out.println(url);
		
//a[text()='guggi']
		
	String userName = "Guggi";
	String xpath = "//a[text()=\""+userName+"\"]";
	System.out.println(xpath);	
	
	
	String userName1 = "Gargi";
	String xpath1 = "//a[text()='"+userName1+"']";
	System.out.println(xpath1);	
	}

}
