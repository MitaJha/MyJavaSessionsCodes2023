package staticConcepts;

import classandObjects.BrowserType;

public class Abc {
	

	public static void main(String[] args) {

		Employee1.main(args);// calling another main method from different class
		
		BrowserType.main(args);//calling main method from different class from different package
								//importing the package in this case
	}

}
