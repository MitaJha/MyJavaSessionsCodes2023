package javalesson1;

import java.util.Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// deleting a number from an array:
		// removing no. 22
		
		int arr1[] ={1,4,5,2,3,22,31,2};
        int arr2[] = new int[arr1.length-1];
        int j=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=22){
                arr2[j]=arr1[i];
                j++;
            }
        }
       
        
        System.out.println("First Array :" + Arrays.toString(arr1));
        System.out.println("Second Array :" + Arrays.toString(arr2));

		
        
        System.out.println("------------------");
		
		String colorlist[] = {"Red", "Yellow", "Green", "Blue"};
		System.out.println(Arrays.toString(colorlist));
		
		System.out.println("------------------");
		System.out.println("------------------");
		
		for(String e:colorlist) {
			System.out.println(e);
		}
	}

}
