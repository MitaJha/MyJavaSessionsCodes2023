package javalesson1;

public class PalindromeString {

	public static void main(String[] args) {

		String s = "MadaM";
		
		//using loop
		//String is immutable class so we can't use .reverse here
		int length = s.length();
		System.out.println(length);
		String reverse = "";
		
		for(int i=length-1; i>=0; i--) {
			reverse = reverse + s.charAt(i);
			
		}
		System.out.println(reverse);
		
		//using StringBuffer class:
		//StringBuffer is a mutable class and it has reverse method.
		String s1 = "AutomatioN";
		
		StringBuffer sf  = new StringBuffer(s1);
		System.out.println(sf.reverse());
		
		
	}

}
