package javalesson1;

public class TestMyself2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int greatest = 87;
		 switch (greatest) {
		case 25:
			System.out.println("smallest is : 25");
			break;
		case 78:
			System.out.println("smaller than  : 87");
			break;
		case 87:	
			System.out.println("greatest is : 87");
			break;	

		default:
			break;
		}
		 System.out.println("___________");
		   
		 
		 
		 
		 
		//checking odd/even:
		 
		 System.out.println("___________");
		 int x = 78;
				
		 if(x%2==0) {
			 System.out.println("it is an even number.");			 
			 
		 }
		 else {
				 System.out.println("it is an odd number.");
			 }
		 
		 //positive/negative
		 
		 System.out.println("___________");
		 int i = -11;
		 if(i>=0) {
			 System.out.println("it is a positive no.");
		 }
		 
		 else {
			 System.out.println("it is a negative no.");
		 }
		
		 
		 //even numbers between 1 to 10 using fpr loop:
		     
		 System.out.println("___________");
		 for(int e=0;e<=10;e=e+2) {
			 System.out.println(e);
			 
		 }
		 System.out.println("___________");
		 
		 
		 // print 1-50 but print "hi" if the number is divisible by 5.
		 
		 for(int num=1; num<=50;num++) {
			 System.out.println(num);
			 if(num%5==0) {
				 System.out.println("Hi");
			 }
		 }
		 
		 System.out.println("___________");
		
		 
		 //even nos between 1 and 100 using %
		 
		 
		 for(int number=0;number<100;number++) {
			// System.out.println(number);
			 if(number%2!=0) {
				 System.out.println(number + " " +"odd");
			 }
				
			else {
				 System.out.println(number + " "+ "even");
				 }
			 }
	
		 
		 
		 
		 }
		 
		 
		 
		 
		 
		 }
		
		
		
		
		
	


