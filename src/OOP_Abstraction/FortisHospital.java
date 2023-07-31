package OOP_Abstraction;

public class FortisHospital extends Medicals implements USMedical, UKMedical, IndianMedical{
	
	
	@Override
	public void cardiologyServices() {
		System.out.println("FH cardiologyServices");
	}
	@Override
	public void neurologyServices() {
		System.out.println("FH neurologyServices");

	}
	@Override
	public void opticalServices() {
		System.out.println("FH opticalServices");

	}
	@Override
	public void gynicServices() {
		System.out.println("FH gynicServices");

	}
	@Override
	public void orthoServices() {
		System.out.println("FH orthoServices");

	}
	@Override
	public void physioServices() {
		System.out.println("FH physioServices");

	}
	@Override
	public void oncologyServices() {
		System.out.println("FH oncologyServices");

	}
	@Override
	public void dermatologyServices() {
		System.out.println("FH dermatologyServices");

	}
	@Override
	public void pedriaticServices() {
		System.out.println("FH pedriaticServices");

	}
	@Override
	public void ENTServices() {
		System.out.println("FH ENTServices");

	}	
	
	//individual methods
	public void medicalTraining() {
		System.out.println("FH Medical training");
	}
	public void medicalInsurance() {
		System.out.println("FH Medical insurance");
	}
	@Override
	public void emergencyServices() {
		System.out.println("FH emergencyServices");

	}
	@Override
	public void test(int i) {
		
	}
	@Override
	public String get(int a) {
		return null;
	}
	@Override
	public String get(int a, int b) {
		return null;
	}
	@Override
	public void covidVaccine() {

		System.out.println("FH--------covidVaccine");
	}
	@Override
	public void medicalNews() {
		System.out.println("FH--------medicalNews");

		
	}
}

