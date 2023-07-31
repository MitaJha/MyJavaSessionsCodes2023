package StringConcept;

public class StringMethods {

	public static void main(String[] args) {

		String s = "this is my java code and i am so happy and i am so cool";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(8));
		System.out.println(s.charAt(37));
		System.out.println(s.indexOf("i"));

		// System.out.println(s.indexOf("i",3));
		System.out.println(s.indexOf("i", s.indexOf("i") + 1));// 2nd occurrence of i
		System.out.println("-------");
		System.out.println(s.indexOf("i", s.indexOf("i", s.indexOf("i") + 1) + 1));// 3rd occurrence of i
		
		System.out.println("-----------");
		
		// 4th occurrence of i
		
		System.out.println(s.indexOf("i", s.indexOf("i", s.indexOf("i", s.indexOf("i") + 1) + 1) + 1));
																										

		// finding all the index of "i" in the given string

		for (int x = 0; x <= s.length() - 1; x++) {
			if (s.charAt(x) == 'i') {
				System.out.print(x + " ");
			}
		}

	}

}
