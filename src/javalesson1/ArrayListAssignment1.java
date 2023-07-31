package javalesson1;

import java.util.ArrayList;

public class ArrayListAssignment1 {

	public static void main(String[] args) {
		
ArrayList<String> namelist = new ArrayList<String>();
		
		namelist.add("Guggi");
		namelist.add("Stuti");
		namelist.add("Diya");
		namelist.add("Kaashu");
		namelist.add("Riya");
		
		for(int i = 0; i<namelist.size(); i++) {
			System.out.println("Element at index"+" "+i +" "+"is"+ " " + namelist.get(i));
		}
		
		//System.out.println(namelist);	
		String searchName = "Stuti";
		for(String name : namelist) {
			if(name.equals(searchName)) {
				System.out.println("Found" + " " + searchName);
				break;
				
				
			}
		}
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(93);
		marks.add(76);
		marks.add(83);
		marks.add(99);
		marks.add(59);
		
		Integer searchmks = 83;
		for(Integer mks : marks) {
			if(mks.equals(searchmks)) {
				System.out.println(searchmks);
				break;
				
			}
		}
	
	
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Pink");
		colors.add("White");
		colors.add("Orange");
		colors.add("Blue");
		colors.add("Black");
	
	ArrayList<String> portion = new ArrayList<String>(colors.subList(1, 3));
	System.out.println(portion);
	
	
	
	
	
	
	
	
	
	}

}
