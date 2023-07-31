package StringConcept;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {

		String s = "Hello";// Literals
		String s1 = new String("Hello");// Object

		// both values of s and s1 will be stored in heap but literal will be stored in
		// SCP(String constant pool)
		// duplicate values are not allowed in SCP

		System.out.println(s == s1);// output will be false because one is literal and other is object (location is
									// not same)

		String s2 = "Hello";
		System.out.println(s == s2);// true-same value and same location SCP

		s2 = "hi"; /// new literal "hi" will be created in SCP
		System.out.println(s == s2); // not it will be false (values are different)

		String str = new String("World");
		str.intern(); //it will create same object in SCP with value "world"
		System.out.println("-------");
		String top = "guggi";
		String top1 = "guggi";
		String top2 = new String("guggi");
		top = null;
		top1 = null;
		
		String top3 = "guggi";
		System.out.println(top==top1);
		//System.out.println(top.equals(top1));//NPE
		System.out.println(top3==top2);
		System.out.println(top3.equals(top2));
		
		String z = "testing";
		z.concat("automation");//will create new object in SCP 
		System.out.println(z);//testing
		//Strings are immutable(we cannot edit the existing value always create a new value
		
		// we can use StringBuffer and StringBuilder to make changes or edit the Strings.
		
		StringBuilder sb = new StringBuilder("naveen");
		sb.append("automation");
		System.out.println(sb);
		System.out.println("-------");

		
		String line = "Welcome To The World Of Java";
		
		//line = line.replace(" ", "");
		
		System.out.println(line.trim());
		System.out.println(line.toUpperCase());
		System.out.println(line.toLowerCase());
		
		System.out.println(line.substring(11));//showing result from 11th index
		System.out.println(line.substring(0, 7));
		System.out.println(line.substring(line.indexOf("To")+3));
		
		//contains: returns boolean 
		System.out.println(line.contains("Java"));//true
		System.out.println(line.contains("Python"));//false
		if(line.contains("Java")){
			System.out.println("PASS");
		
			//split:
			String lang ="JAV_PYTHON_RUBY_JAVASCRIPT";
			 String lg[] = lang.split("_");
			System.out.println(lg[0]);
			System.out.println(Arrays.toString(lg));
			
			String t = "xXtestingXxXSeleniumXXxXAutomationxXxCypress";
			String tp[] =  t.split("xX");
			System.out.println(tp[0]);
			System.out.println(tp[1]);
			System.out.println(tp[2]);
			System.out.println(tp[3]);
			System.out.println(tp[4]);
			//System.out.println(tp[5]);			
			
			
			String empData = "Mita;Automation;Blr;India;SDET;120.55";
			String emp[]= empData.split(";");
			for(String e: emp) {
				System.out.println(e);
			}
			//we cannot split if we are separating data by using pipe(|)
			//for this we need to escape the character by using two \\
			
			String empData1 = "Puja|QA|Delhi|India|Testing|15.55";
			String emp1[]= empData1.split("\\|");
			System.out.println( emp1[0]);
			for(String e: emp1) {
				System.out.println(e);
			}
			String x = "I Love \"Java\"and I am Happy";
			System.out.println(x);
			
			}
			//Assume that a string consists of 3 words, print out the middle one.
			String words = "Welcome To Java";
			System.out.println(words.substring(8, 10));
		
			String ss = "this is my java code and i am so happy and i am so cool";
			String part[] = ss.split(" ");
			for(String e : part) {
				System.out.println(e);
			}
			
			// get only numeric part from this String:

			String str1 = "your transaction id is: 12345 and reference id is: 34567";
			String num = str1.replaceAll("[^0-9]" ,"");
			System.out.println(num);
			
			
			
	}

}
