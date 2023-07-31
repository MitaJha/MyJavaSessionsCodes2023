package javalesson1;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int i[] = {10,20,30,40,50,60,70,80,90,100};//length is 10
	int l = i.length;
	System.out.println(l);
	System.out.println(i[3]); //value of i[3] = 40         
			
	System.out.println("--------------------");
	
	int a[] = new int[4];
	a[0] = 10;
	a[1] = 20;
	
	System.out.println(a[3]); 
 
	System.out.println("--------------------");
	
	String s[] = new String[5];
	s[0] = "abc";
	s[1] = "xyz";
	
	System.out.println(s[4]);
	System.out.println(s[3]);
	System.out.println((Arrays.toString(s)));
	
	System.out.println("--------------------");
	 double d[] = {12.33, 15.55 ,14.80};
	 char c[] = {'a', 'e', 'i', 'o', 'u'};
	 String str[] = {"Guggi", "Gargi", "Sakshu", "Nanhi"};
	 Object emp[] = {"Amit", 35, 90.5, 'm', true};
	
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(emp));
		
		
		System.out.println("--------------------");
		
		for(String e : str) {
			System.out.println(e);			
		}
		System.out.println("--------------------");
		
		for(Object employee : emp) {
			System.out.println(employee);
		}
	}

}
