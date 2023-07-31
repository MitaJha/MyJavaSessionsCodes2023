package javalesson1;

public class DataType {


	public static void main(String[] args) {
		
		byte b=15;
		
		b=30;
		byte b1=38;
		System.out.println(b);
		System.out.println(b1);
		// TODO Auto-generated method stub
		
		short s = 1200;
		short s1 = 20000;
		
		int n = 10000000;
		int n1 = 1590000000;
		
		
		long l = 650000000000l;
		long l1 = (long)650000000;

		System.out.println(n);		 
		
		System.out.println(n1);
		
		System.out.println(s);
		
		System.out.println(l);
		System.out.println(s1);
		System.out.println(l1);
		
		
		float a = 16.710005f;
		float x = (float)15.000002;
		
		System.out.println(a-x);
		System.out.println(x);
		
		double d = -93.286000000005;
		
		System.out.println(d);
		
		System.out.println(n+l);
		
	     char c = 'a';
	     char c1 = 'B';  
	     char gender = 'f';
	     char result = 'p';
	     char answer = 'y';
	     char space = ' ';
	    
	     System.out.println(c);
	     System.out.println(c1);
	     
	     System.out.println(c+c1);
	     
	     System.out.println(result+c);
	     System.out.println(gender);
	     System.out.println(answer);
	     
	     System.out.println((int)c1);
	     System.out.println((byte)c1);
	     System.out.println((byte)space);
	     
	     boolean flag = true;
	     boolean flag1 = false;
	     
	     System.out.println(flag);
         System.out.println(flag1);
         
         //camel case
         
         byte totalScore = 97;
         System.out.println(totalScore);
         
         System.out.println(c);
	}

}
