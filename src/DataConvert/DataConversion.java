package DataConvert;

public class DataConversion {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);//10020
		
		//String to int 
		//using wrapper class
		//int--->Integer
		
		
	int i =	Integer.parseInt(x);//converting "100"to 100
	System.out.println(i+20);
	
//		String test = "100A";
//		int j =	Integer.parseInt(test);//NumberFormatException
//		System.out.println(j);
		
		//String to double
		String s = "14.55";
	double d =	Double.parseDouble(s);
		
		System.out.println(d-3.0);
		
		//String to char
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MAX_VALUE);


		//String to boolean
		String headless = "true";
		if(Boolean.parseBoolean(headless)) {
			System.out.println(headless);
		}
		
		//int to Srting
		int m = 50;
		System.out.println(m+5);
		String m1 = String.valueOf(m);
		System.out.println(m1+25);
		
		//double to String
		double n = 23.99;
		String n1 = String.valueOf(n);
		System.out.println(n1+100);
		
		
		
		
		
	}

}
