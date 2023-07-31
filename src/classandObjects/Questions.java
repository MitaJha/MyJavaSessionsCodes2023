package classandObjects;

public class Questions {
	//9. WAP to check the prime number:
	
//		public static boolean isPrimeNumber(int primenum) {
//			//the lowest prime number is 2
//			if(primenum<=1) {
//				return false;			
//			}
//			for(int pn = 2; pn<primenum; pn++) {
//				if (primenum % pn == 0) {
//					return false;
//					
//				}
//			}
//				return true;
//		}
		// checking palindrome number 
		//A palindrome number is a number that remains the same when digits are reversed. 
				
		public static void isPalindromeNumber(int palindrome) {
			int r = 0;
			int sum = 0;
			int t;
			t = palindrome;
			while(palindrome>=0) {
				r= palindrome%10;//get the remainder
				sum =(sum*10)+r;
				palindrome=palindrome/10;				
			}
			if(t==sum) {
				System.out.println("palindrome number");
				
			}
			else{
				System.out.println("not a palindrome number");
				
			}
			
			
			
			
		}

	public static void main(String[] args) {
//		System.out.println(" 13 is a prime number " + isPrimeNumber(13));
//		System.out.println(" 19 is a prime number " + isPrimeNumber(19));
//		System.out.println(isPrimeNumber(21));
//		System.out.println(isPrimeNumber(37));
//		System.out.println(isPrimeNumber(97));
//		System.out.println(isPrimeNumber(91));

		isPalindromeNumber(1613161);
	}

}
