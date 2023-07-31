package javalesson1;

import java.util.Arrays;

public class ArrayTravesing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[] = new int[5];

		i[0] = 05;
		i[1] = 15;
		i[2] = 25;
		i[3] = 35;
		i[4] = 45;

		System.out.println(Arrays.toString(i));
		System.out.println("--------------------");

		System.out.println("--------------------");

		String s[] = new String[4];
		s[0] = "Gargi";
		s[1] = "Guggi";
		s[2] = "Nanhi";
		s[3] = "Sakshu";

		System.out.println(Arrays.toString(s));

		System.out.println("--------------------");

		System.out.println("--------------------");

		for (String name : s) {
			System.out.println(name);
			if (name.equals("Guggi")) {
				break;
			}
		}

		System.out.println("--------------------");

		System.out.println("--------------------");

		Object emp[] = new Object[5];
		emp[0] = "Mark";
		emp[1] = 30;
		emp[2] = 80.50;
		emp[3] = 'm';
		emp[4] = true;

		System.out.println(Arrays.toString(emp));
		System.out.println("--------------------");

		
		System.out.println("--------------------");
		
		 int count = 0;
		 for(Object e : emp) {
			 System.out.println(count + "=" + e);
			 count++;
		 }
		 
		 System.out.println("--------------------");

			
		 System.out.println("--------------------");
		 
		for(int n = emp.length-1; n>=0;  n--) {
			System.out.println(emp[n]);
		}
		 
			
			
		 
		 
		 

	}

}
