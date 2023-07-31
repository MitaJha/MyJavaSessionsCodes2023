package javalesson1;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[] = new int[4];
		k[0] = 10;
		k[1] = 20;
		k[2] = 30;
		k[3] = 40;

		for (int x = 0; x < k.length; x++) {
			System.out.println(k[x]);
			if (x == 2) {
				System.out.println("stop");
				break;
			}
		}
		System.out.println("--------------------");

		System.out.println("--------------------");
		
		//for each loop:
		for(int e : k) {
			System.out.println(e);
		}
		System.out.println("--------------------");

		System.out.println("--------------------");

		char letter[] = new char[5];

		letter[0] = 'a';
		letter[1] = 'A';
		letter[2] = '1';
		letter[3] = '@';
		letter[4] = '0';

		for (char ch = 0; ch < letter.length; ch++) {
			System.out.println(letter[ch]);
		}
		System.out.println("--------------------");

		System.out.println("--------------------");

		double d[] = new double[4];
		d[0] = 12.50;
		d[1] = 20.99;
		d[2] = 50.57;
		d[3] = 32.88;
		System.out.println(Arrays.toString(d));
		
        System.out.println("--------------------");
		
		System.out.println("--------------------");
		
		//FOR EACH LOOP:
		
		for(double deci :d) {
			System.out.println(deci);
		}
		
		System.out.println("--------------------");

		System.out.println("--------------------");
		
		String name[] = new String[3];
		name[0] = "Guggi";
		name[1] = "Gargi";
		name[2] = "Anup";
		 
		for(String s : name) {
			
			System.out.println(s);
		}

	}
}

