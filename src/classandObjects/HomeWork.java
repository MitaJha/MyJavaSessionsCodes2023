package classandObjects;

//import java.util.Arrays;

public class HomeWork {
	// WAF: using static Array in method:
	// get student subjectsList(String studentName)
	// return Array String

	public String[] getStudentSubjects(String studentName) {
		studentName = studentName.trim();
		System.out.println(studentName + " " + "subjects are: ");
		String subject[] = new String[3];

		if (studentName.equalsIgnoreCase("Guggi")) {
			subject[0] = "History";
			subject[1] = "Geography";
			subject[2] = "Economics";
		} else if (studentName.equalsIgnoreCase("Stuti")) {
			subject[0] = "Math";
			subject[1] = "Physics";
			subject[2] = "Chemistry";
		} else if (studentName.equalsIgnoreCase("Mona")) {
			subject[0] = "Accounts";
			subject[1] = "Statics";
			subject[2] = "Economics";
		} else if (studentName.equalsIgnoreCase("Diya")) {
			subject[0] = "Biology";
			subject[1] = "Physics";
			subject[2] = "Chemisty";
		} else {
			System.out.println("Student not found....SORRY");
		}
		return subject;
	}

	public static void main(String[] args) {

		HomeWork hm = new HomeWork();

		String[] sub = hm.getStudentSubjects("Guggi");
		
		
		for (String e : sub) {
		System.out.println(e);

	}
	}
}
