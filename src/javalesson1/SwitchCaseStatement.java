package javalesson1;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String channel = "hulu";
switch (channel) {
case "netflix":
	System.out.println("launch netflix");
	break;
case "prime":
	System.out.println("launch prime");
	break;
case "youtube":
	System.out.println("launch youtube");
	break; 
case "HBO":
	System.out.println("launch HBO");
	break;

default:
	System.out.println("please find " + channel);
	break;
}
	}

}
