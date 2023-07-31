package javalesson1;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WHILE LOOP:

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			// break;//break the entire loop
		}
		System.out.println("-----------");

		int x = 10;
		while (x >= 0) {
			System.out.println(x);
			x--;
		}
		System.out.println("-----------");

		// even nos between 0-50
		int even = 0;
		while (even <= 50) {
			System.out.println(even);
			even = even + 2;

		}

		System.out.println("-----------");
		int odd = 1;
		while (odd <= 20) {
			System.out.println(odd);
			odd = odd + 2;
			// System.out.println("Hello");
		}
		System.out.println("===============");
		// FOR LOOP:

		for (int m = 1; m <= 10; m++) {
			System.out.println(m);
			m = m + 3;
		}

		for (int n = 10; n >= 1; n--) {
			System.out.println(n);

		}
		System.out.println("===============");
		
		// table of 5

		int s1 = 1;
		while (s1 <= 100) {
			if (s1 % 5 == 0) {
				System.out.println(s1);
			}
			s1++;
		}

		System.out.println("===============");
		int count = 8;
		for (count = 1; count <= 100; count++) {
			if (count % 8 == 0) {
				System.out.println(count);

			}
		}

		System.out.println("===============");

		for (int p = 1; p <= 10; p++) {
			System.out.println("HELLO WORLD");

		}
		System.out.println("===============");
		
		// ASCII table from A-Z
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c + " " + (int) c);

		}

		System.out.println("-----------");
		
		// ASCII table from a-z
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.println(c1 + " " + (int) c1);

		}

		System.out.println("-----------");
		
		// ASCII table from 0-9
		for (char c2 = '0'; c2 <= '9'; c2++) {
			System.out.println(c2 + " " + (int) c2);

		}

		System.out.println("-----------");

		for (double d = 1.0; d <= 10.0; d++) {

			System.out.println(d);

		}
		
		//printing nos from 1-10 and break once multiple of 7
		
		System.out.println("-----------");
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			if (k % 7 == 0) {
				System.out.println("bye, see you tomorrow.");
				break;
			}
			k++;

		}

		System.out.println("-----------");
		int k1 = 1;
		for (; k1 <= 10; k1++) {
			System.out.println(k1);
			if (k1 % 6 == 0) {
				System.out.println("bye, see you tomorrow.");
				break;
			}

		}

		System.out.println("-----------");

		for (int b = 1; b < 10; b++) {
			System.out.println("I am Batman" + " " + b++);
		}

	}
}
