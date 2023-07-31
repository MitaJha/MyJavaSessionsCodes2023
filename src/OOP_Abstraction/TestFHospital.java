package OOP_Abstraction;

public class TestFHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardiologyServices();
		fh.dermatologyServices();
		fh.neurologyServices();
		fh.oncologyServices();
		fh.emergencyServices();
		fh.opticalServices();
		fh.orthoServices();
		fh.pedriaticServices();
		fh.physioServices();
		
		System.out.println(USMedical.min_fee);
		
		//cannot create the object of an interface
		//	USMedical us = new USMedical();
		System.out.println("--------");
		//top casting
		USMedical us = new FortisHospital();
		us.cardiologyServices();
		us.emergencyServices();
		us.opticalServices();
		fh.covidVaccine();
		
		//down casting is not allowed in interface. not even at compile time. 
	}

}
