package StringConcept;

import exceptionHandling.MyExceptions;

public class StringReverseConcept {

	public static String reverseString(String str) {

		// 1. null check-- it should be the 1st check always

		if (str == null) {
			System.out.println("Null values are not allowed");
			throw new MyExceptions("String cannot be null");
		}

		int len = str.length();
		String rev = "";

		// 2. length check le==1
		if (len == 1) {
			return str;
		}

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		return rev;

	}

//	


	public static void main(String[] args) {

		// Selenium - reverse(muineleS
		// T----T
		// te-----et
		// 123----321
		// null---nothing

		// String s = "Selenium";

		System.out.println(reverseString("Selenium"));
		System.out.println(reverseString("test"));
		System.out.println(reverseString("T"));

		System.out.println(reverseString("123"));
		// System.out.println(reverseString(null));

		System.out.println(reverseString("Testing Selenium Cypress"));
		System.out.println(reverseString("1234321"));
	
		//checking Plaindrome Number:
		
		String revString = reverseString("1274321");
		if(revString.equals("1234321")) {
			System.out.println("it is a palindrome number");
			
		}
		else {
				System.out.println("it is not a palindrome number");

			}
		}
	
	
	}


