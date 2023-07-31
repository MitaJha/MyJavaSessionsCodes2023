package classandObjects;

public class BrowserType {
// writing a function/method using switch case:
	// returning boolean(true/false).
	//method name is launchBrowser
	
	public boolean launchBrowser(String bowserName) {
		System.out.println("Launching the browser name..."+ bowserName);
		 boolean flag = true;
		 
		 switch (bowserName.trim().toLowerCase()) {
		 case "chrome":
			 System.out.println("Launch chrome......Pass");
			 break;
		 case "safari":
			 System.out.println("Launch safari.");
			 break;
		 case "edge":
			 System.out.println("Launch edge.");
			 break;
		 case "firefox":
			 System.out.println("Launch firefox.");
			 break;
		default:
			System.out.println("please pass the right browser...."+bowserName);
		 
		 flag = false;
		 
		}
		 return flag;
	}
		
	
	
		

	public static void main(String[] args) {
	
		 BrowserType bt = new  BrowserType();
		 boolean f = bt.launchBrowser("IE");
		 
		  if( f) {
			  System.out.println("Enter the url");
		  }
		
		
		
		
		
		
		
		
	}

}
