package OOP_AbstractClass;

/**
 * @author mitaj
 *
 */
public class LoginPage extends Page{
	
	@Override
	public void title() {
		
	}

	@Override
	public void url() {
		
	}
	@Override
	public void defaultPageTimeOut() {
		System.out.println("page -- time out = 5 secs");
	}
	 
	public void doLogin() {
		System.out.println("login to app");
	}
}
//Difference between interface and abstract class;
//interface supports 100% abstraction while Abstract class supports partial abstraction
//we cannot create constructor in interface but we can create constructor in abstract class 
//we don't use abstract keyword in interface but it is used in abstract class
//abstract class has normal variables too but interface variables are final and static
//a class can have more than one parent interface but can have one and only one parent abstract class