package javalesson1;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		do {
			x++;
			System.out.println(x);
			
		}
		while(x<=10);
		
System.out.println("_____________");
		
		int m = 25;
		do {
			
			System.out.println(m);
			m++;
		}
		while(m<=10);	
		
		System.out.println("_____________");
		
		int i = 5;
		do {
			i--;
			System.out.println(i);
			i--;
		}
		while(i>=1);
		
		System.out.println("_____________");	
		
		int l = 1;
		do {
			System.out.println(l);
			if(l==5) {
				System.out.println("hello");
				break;
			}
			l++;
		}
		while(l<=100);
	}

}
