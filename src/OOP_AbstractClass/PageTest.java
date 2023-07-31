package OOP_AbstractClass;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.doLogin();
		lp.defaultPageTimeOut();
		lp.displayLogo();
		LoginPage.displayFooters();
		
		System.out.println("-------");
		//top casting
		Page p =  new LoginPage();
		p.defaultPageTimeOut();
		p.displayLogo();
		p.title();
		p.url();
		//p.doLogin();//cannot call this method because its individual method 
	}

}
