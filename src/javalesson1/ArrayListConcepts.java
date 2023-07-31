package javalesson1;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList is a default class in Java.
		//It is a dynamic array.
		//load factor= physical capacity/2
		
		//Create the object of ArrayList;
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add("Guggi");
		ar.add("Gargi");
		ar.add(95.55);
		ar.add(97.55);
		ar.add('f');
		ar.add(13);
		ar.add(10);
		ar.add(true);
		System.out.println(ar);	
		System.out.println("=================");
		
		for(Object details : ar) {
			System.out.println(details);
		}
		
		ar.add(600);
		ar.add(700);		
		//System.out.println(ar.size());
		
		
		
		//System.out.println(ar.get(1));
		//System.out.println(ar.get(7));
		//System.out.println(ar.get(10));
		
		System.out.println("=================");
		ArrayList<Integer> marksheet = new ArrayList<Integer>();
		marksheet.add(97);
		marksheet.add(100);
		marksheet.add(99);
		System.out.println(marksheet);
	}

}
