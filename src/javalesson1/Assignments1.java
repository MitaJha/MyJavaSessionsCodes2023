package javalesson1;

public class Assignments1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 90;
		int b = 87;
		int c = 98;

		if (a > b && a > c) {
			System.out.println("a is the greatest number");
		}

		else if (b > a && b > c) {
			System.out.println("b is the greatest number");
		} else {
			System.out.println("c is the greatest number");
		}
		
		System.out.println("===================");
		
		
		for(int m=0; m<=9; m++) {
			for(int n=0; n<=9; n++) {
				
				System.out.print(m + "" + n + " ");
					
			}
			System.out.println();
			
		}
		
		System.out.println("===================");
		
		//Time Comlexity Example:
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5; j++){
				for(int k=0; k<=5; k++) {
					System.out.print(i+ "" +j+ ""+k+ " ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		// (1+n+n+n)(1+n+n+n)(1+n+n+n)  ==> (9n^2+6n+1)(3n+1)
		//==>  27n^3+18n^2+9n+1  ==>   27n^3+18n^2+9n
		//==>  9n(3n^2+2n+1)  ==>   9n(3n^2+2n)  ==>  9n^2(3n+2)
		//==>  9n^2*3n ==> 27n^3  ==> O(n^3)
		
		
		
		
		
		
		
		
		
		
	}

}
