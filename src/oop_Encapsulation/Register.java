package oop_Encapsulation;

public class Register {
	
	private String name;
	private int age;
	private String city;
	private long phoneNumber;
	private boolean isPerm;
	
	//creating a  constructor
		
	public Register(String name, int age, String city, long phoneNumber, boolean isPerm) {
		
		this.name = name;
		this.age = age;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.isPerm = isPerm;
	}
	
		
	public Register(String name, String city) {
		
		this.name = name;
		this.city = city;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isPerm() {
		return isPerm;
	}
	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	
	
	
	
	
	
	

}
