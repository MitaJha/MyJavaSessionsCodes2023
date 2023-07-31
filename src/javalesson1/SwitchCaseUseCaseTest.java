package javalesson1;

public class SwitchCaseUseCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//loan types: home, education, car, personal
		String loan = "homeloan";
		int salary = 10000;
		switch (loan) {
		case "homeloan":
			System.out.println("interest rate on homeloan is 12%");

			if (salary < 35000) {
				System.out.println(" Not applicable for home loan");
				break;
			}
			break;
		case "carloan":
			System.out.println("interest rate on carloan is 15%");
			break;
		case "personalloan":
			System.out.println("interest rate on personalloan is 10%");
			break;
		case "educationloan":
			System.out.println("interest rate on educationloan is 5%");
			break;
		default:
			System.out.println("Please contact to the bank to know about " + loan);
			break;
		}

	}
}
