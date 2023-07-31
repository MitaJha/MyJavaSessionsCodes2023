package classandObjects;

public class Student {
	
	String name;
	int roll;
	String std;
	String sub;
	double percentage;
	
	public static void main(String[] args) {
	
	Student s1= new Student();
	s1.name = "ST";
	s1.roll = 23;
	s1.std = "IX";
	s1.percentage = 78.88;
	
	System.out.println(s1.name);
	System.out.println(s1.roll);
	System.out.println(s1.std);
	System.out.println(s1.percentage);
	
	System.out.println("_____________");
	
	Student s2= new Student();
	s2.name = "Riya";
	s2.roll = 17;
	s2.std = "IV";
	s2.percentage = 85.23;
	
	System.out.println(s2.name);
	System.out.println(s2.roll);
	System.out.println(s2.std);
	System.out.println(s2.percentage);
	
	System.out.println("_____________");
		
	Student s3= new Student();
	s3.name = "Gargi";
	s3.roll = 7;
	s3.std = "IV";
	s3.percentage = 98.11;
	
	System.out.println(s3.name);
	System.out.println(s3.roll);
	System.out.println(s3.std);
	System.out.println(s3.percentage);
	
	System.out.println("_____________");	
	}
	
	}


