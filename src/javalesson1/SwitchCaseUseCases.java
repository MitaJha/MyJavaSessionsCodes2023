package javalesson1;

public class SwitchCaseUseCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alphabet = 'a';
		switch (alphabet) {
		case 'a':
			System.out.println("This is a vowel");
			break;
		case 'e':
			System.out.println("This is a vowel");
			break;
		case 'i':
			System.out.println("This is a vowel");
			break;
		case 'o':
			System.out.println("This is a vowel");
			break;
		case 'u':
			System.out.println("This is a vowel");
			break;
		default:
			System.out.println("This is a consonant");
			break;
		}

       //env - de/qa/stage/uat/prod
		
		System.out.println("===============================================");
		String envName = " QA b";
		switch (envName.trim().toLowerCase()) {
		case "qa":
			System.out.println("run it on QA");
			break;
		case "dev":
			System.out.println("run it on dev");
			break;
		case "stage":
			System.out.println("run it on stage");
			break;
		case "uat":
			System.out.println("run it on uat");
			break;
		case "prod":
			System.out.println("run it on prod");
			break;
		default:
			System.out.println("no env is found  " + envName);
			break;
		}

        //no of days	
		
		System.out.println("===============================================");
		String weekDays = "sun";
		switch (weekDays.trim().toLowerCase()) {
		case "mon":
			System.out.println("working hours on monday is 9am-5pm");
			break;
		case "tue":
			System.out.println("working hours on tuesday is 6am-2pm");
			break;
		case "wed":
			System.out.println("working hours on wed is 8am-4pm");
			break;
		case "thu":
			System.out.println("working hours on thursday is 7am-3pm");
			break;
		case "fri":
			System.out.println("working hourson friday is 10am-8pm");
			break;
		case "sat":
			System.out.println("working hours sat is 12pm-10pm");
			break;
		default:
			System.out.println("no work on " + weekDays);
			break;
		}
	}
}
