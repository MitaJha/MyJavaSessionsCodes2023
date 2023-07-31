package javalesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayListMethods {

	public static void main(String[] args) {
		
       ArrayList<Object> student = new ArrayList<Object>(Arrays.asList("Sam", 23, "XI", "Commerce", "DAV", 'm'));
		
		//System.out.println(student);
		System.out.println("-----------------------");
		
		//Reversing the order:
		
		Collections.reverse(student);
		
		for(Object e : student) {
			System.out.println(e);
		}
		
		System.out.println("-----------------------");
		
		for( int i = student.size()-1; i>=0; i--) {
			System.out.println(student.get(i));
		}
		System.out.println("-----------------------");
		
		ArrayList<String> monthList = new ArrayList<String>();
		
		monthList.add("Jan");
		monthList.add("Feb");
		monthList.add("Mar");
		monthList.add("Apr");
		monthList.add("May");
		monthList.add("Jun");
		monthList.add("Jul");
		System.out.println(monthList.size());
		
		monthList.add(0, "Month:");
		monthList.add("Aug");
		monthList.set(0,  "Dec");//replace the value of given index
		System.out.println(monthList);
		
		//for(String e : monthList) {
		
		
		
		//System.out.println(e);
	//	}
		
		//monthList.remove(6);
		//Collections.reverse(monthList);
		System.out.println(monthList);
		
		
//		monthList.trimToSize();
//		
//		Collections.swap (monthList, 2, 3);
//		System.out.println(monthList);
//		System.out.println("______________________________");
//
//		monthList.clear();
//		System.out.println(monthList);
//		
		System.out.println("______________________________");
		
		List<Object> ls = Collections.emptyList();
		System.out.println(ls.size());
		
		Collections.sort(monthList);
		System.out.println(monthList);
		
		ArrayList<Integer> numbers = new ArrayList(Arrays.asList(43, 55, 23, 16,01, 05, 92,38));
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		
		numbers.add(numbers.size()/2, 100);// adding an element in the middle of the array.
		System.out.println(numbers);
		
	
	
	
	}

}
