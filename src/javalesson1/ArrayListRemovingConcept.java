package javalesson1;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListRemovingConcept {

	public static void main(String[] args) {
		
		ArrayList<String> namelist = new ArrayList<String>();
		
		namelist.add("Guggi");
		namelist.add("Stuti");
		namelist.add("Diya");
		namelist.add("Kaashu");
		namelist.add("Riya");
		
		//System.out.println(namelist);
		//namelist.add(2, "Sakshu");
		//namelist.add("Pari");
		//System.out.println(namelist);
        namelist.remove(4);
		namelist.remove(0);
		System.out.println(namelist);
		//namelist.add(7, "Maya");//IOB
	
	ArrayList<Integer> num = new ArrayList<Integer>();
	num.add(12);
	num.add(3);
	num.add(4);
	num.add(15);
	num.add(40);
	System.out.println(num);
	
	num.remove(4);//by default removing by index
	System.out.println(num);
	
	num.remove((Object)4);//removing by value
	System.out.println(num);
	System.out.println("-----------------------");
	
	//ArrayList LITERALS:
	ArrayList<String> studentList = new ArrayList<String>(Arrays.asList("Ram", "Tom", "Puja", "Ritu"));
	System.out.println( studentList);
	System.out.println(studentList.size());
	System.out.println(studentList.get(1));
	studentList.remove(3);
	
	System.out.println("-----------------------");
	
	for(String e :  studentList) {
		System.out.println(e);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
