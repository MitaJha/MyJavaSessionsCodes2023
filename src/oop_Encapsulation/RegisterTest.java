package oop_Encapsulation;

public class RegisterTest {

	public static void main(String[] args) {

		Register reg = new Register("Anu", 24,"Delhi", 9898456798l, true);
		
		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getCity());
		System.out.println(reg.getPhoneNumber());
		System.out.println(reg.isPerm());
		
		
		reg.setCity("Pune");
		System.out.println(reg.getCity());
		System.out.println("---------------------");
		
        Register reg1 = new Register("Mona", "Blr");
		
		System.out.println(reg1.getName());
		System.out.println(reg1.getAge());
		System.out.println(reg1.getCity());
		System.out.println(reg1.getPhoneNumber());
		System.out.println(reg1.isPerm());
		
		
		//update
		reg1.setAge(30);
		reg1.setPhoneNumber(9800734620l);
		reg1.setPerm(true);
		
		System.out.println("---------------------");

		
		System.out.println(reg1.getName());
		System.out.println(reg1.getAge());
		System.out.println(reg1.getCity());
		System.out.println(reg1.getPhoneNumber());
		System.out.println(reg1.isPerm());
	}

}
