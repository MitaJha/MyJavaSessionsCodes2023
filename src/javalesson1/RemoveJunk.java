package javalesson1;

public class RemoveJunk {

	public static void main(String[] args) {

		//Regular Expression [^a-zA-z0-9]...^ indicated not
		
		String s = "%@#%^&@** Naveen &&&%$#@@% Automation&%#@@#@@#$%$$$$ Labs";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		String s1 = "&&& Hello #### World";
		s1 = s1.replaceAll("[^a-zA-Z ]", "");
		System.out.println(s1);
	}

}
