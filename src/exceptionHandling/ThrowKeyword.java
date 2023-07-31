package exceptionHandling;

public class ThrowKeyword {
	//throw keyword is used to create custom Exceptions which are not present in the inbuilt exceptions by java.
	
	public static void main(String[] args) {
		 //int i = 3/0;
		String channel = null;
		if(channel==null){
			try {
				throw new Exception("NoChannelFound");
			}
			catch(Exception e) {
				System.out.println( "please go to the correct channel");
				e.printStackTrace();
			}
			System.out.println("Hello");
		}
}
}