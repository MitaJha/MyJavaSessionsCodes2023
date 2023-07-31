package javalesson1;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		// CricInfo
		
		Object player[] = new Object[5];
		
		player[0] = "Dhoni";
		player[1] = 35;
		player[2] = "Ind";		
		player[3] = 15000;
		player[4] = 110.56;
				
		System.out.println(player[3]);
		System.out.println(player[0]);
		System.out.println("--------------------");
		
		System.out.println(Arrays.toString(player));
		System.out.println("--------------------"); 
		
        Object player1[] = new Object[5];
		
		player1[0] = "kohli";
		player1[1] = 30;
		
		System.out.println(player1[0]);
		System.out.println(player1[3]);
		
		System.out.println("--------------------");
		
		System.out.println(Arrays.toString(player1));
		
	}

}
