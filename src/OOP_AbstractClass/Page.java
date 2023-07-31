package OOP_AbstractClass;

public abstract class Page {
	
		// no abstract methods -- 0% abstraction
		// all abstract methods -- 100% abstraction
		// partial abstraction -- 0 to 100% abstraction
	
	// can not create the Object of abstract class
		// can i create the constructor of abstract class??????
		// Ans: YESSSSSSSS
		//it will be called when yu create the object of child class
	
	public abstract void title();
	
	public abstract void url();
	
	public void defaultPageTimeOut() {
		System.out.println("page -- time out = 20 secs");
	}
	
	public void search() {
		
	}

	public static void displayFooters() {
		System.out.println("page -- displayFooters");
	}

	public final void displayLogo() {
		System.out.println("page -- logo");
	}


}
