package javalesson1;

import java.util.ArrayList;

public class ArrayListTraversing {

	public static void main(String[] args) {
		
		ArrayList<Integer> score = new ArrayList<Integer>();
		
		score.add(100);
		score.add(200);
		score.add(300);
		score.add(400);
		score.add(500);
		
		System.out.println(score);
		
		
		System.out.println("-------------");
		
		for(Integer e : score) {
			System.out.println(e);
		}
		
		System.out.println("-------------");
		
		for(int i=0; i<score.size(); i++) {
			System.out.println(score.get(i));
			
			if(score.get(i).equals (300)) {
				System.out.println("stop");
			break;
			}
		}
		
		

	}

}
