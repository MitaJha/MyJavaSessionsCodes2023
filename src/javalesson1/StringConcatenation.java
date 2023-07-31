package javalesson1;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 100;
			int b = 200;
			
			float c = 15.55f;
			float d = 25.22f;
			
			char r = 'a';
			char r1 = 'b';
			 
			String x = "Hello";
			String y = "World";
			
			System.out.println(a+b);
			System.out.println(c+d);
			
			System.out.println(x+y);
			System.out.println(x+" "+y);
			System.out.println(a+b+x+y);
			System.out.println(x+y+a+b);
			System.out.println(a+b+x+y+c+d);
			
			System.out.println(x+y+(a+b));
			System.out.println(r+r1+x+y);
			System.out.println(x+y+r+r1);
			System.out.println(x+y+(r+r1));
			System.out.println(r1-r+x+" "+y);
			
			System.out.println("The value of a is:" +a);
			System.out.println("The value of b is:" +b);
			System.out.println("The sum of a and b is:" +(a+b));
			
			System.out.println(r*a);
			System.out.println(b*d);
			
			System.out.println(11/2);//both th nubers 11 and 2 are pure integers thats why it will return a integer 5.
			System.out.println(11.0/2);
			System.out.println(11/2.0);
		    System.out.println(11.0/2.0);
			
			//System.out.println(9/0);
			
		
		    System.out.println(0/9);
			//System.out.println(1/0);
			//System.out.println(0/2);
			
			System.out.println(12.5/0);//infinity
			System.out.println(12/0.0);//infinity
			System.out.println(9.0/0.0);//infinity
			
			System.out.println(0.0/0.0);//NaN
			System.out.println(0/0.0);//NaN
		
			System.out.println(0.0/0);//NaN
			
			//System.out.println(0);
			
			
			byte b1 = 15;
			byte b2 = 30;
			int b3 = (b1+b2);
			System.out.println(b3);
			
		    System.out.println(9%2);	
		    System.out.println(8%2);
		    System.out.println(7%4);
		    System.out.println(11%6);
		    
		    byte o = 012;
		    System.out.println(o);
		    System.out.println(0456312);
			
		
			
	}

}
