package exceptionHandling;

public class Student {

	public static int getStudentMarks(String name) {
		System.out.println("getting marks for/; " + name);

		if (name.equals("guggi")) {
			try {
			int i = 9/3;
			System.exit(0);
			return 55;
			}
			catch(ArithmeticException e) {
				System.out.println("AE is coming");
				return 80;
			}
			finally {
				return 100;
			}
			}else if (name.equals("gargi")) {
			return 98;
		} else {
			System.out.println("student not found");
			return -1;
		}
	}

	public static void main(String[] args) {
		int s = getStudentMarks("guggi");
		System.out.println(s);
	}
}