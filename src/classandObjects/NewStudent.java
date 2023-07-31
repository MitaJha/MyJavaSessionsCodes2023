package classandObjects;

public class NewStudent {
	
	String name;
	int marks;	
	
	//creating a (int) method getStudentMarks
	//passing String Parameter name;
	//returning in marks;
	
	
	public int getStudentMarks(String name) {
		System.out.println("Getting marks for"+" " + name);
		marks=-1;
		if(name.equals("Guggi")) {
			marks = 93;
		}
		else  if(name.equals("Gargi")){
				marks = 99;		
			}
			else if(name.equals("Kimaya")){
				marks =89;		
			}
		else if(name.equals("Diya")){
			marks = 75;		
		}
		else {
			System.out.println("student not found" +" "+ name);
		}
		return marks;
					
	}
	public int maxNum(int x , int y, int z) {
		//System.out.println("this is the max number");
		int a=800;
		if (x>y && x>z) {
			System.out.println("x is the max num");
		}
		else if (y>x && y>z) {
			System.out.println("y is the max num");
	}
		else if (z>y && z>x) {
			System.out.println("z is the max num");
		}
	
	return a;
}

	public static void main(String[] args) {
		
		 NewStudent s1 = new  NewStudent();
		 int m1 = s1.getStudentMarks("Gargi");
		 
		 System.out.println(m1);
		if(m1>=0) {
			System.out.println("Print the marksheet");
		}
		
		int max = s1.maxNum(800, 50, 60);
		System.out.println(max);
	}

}
