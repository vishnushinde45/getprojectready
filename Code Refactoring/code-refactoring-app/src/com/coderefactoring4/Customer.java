package com.coderefactoring4;

//Demonstrate how to extract a class, and move methods and fields
//Classes with too many responsibilities must me split
//1. Look for a set of data that goes together
//2. Create a new class with a name that describes that data
//3. Move all the fields and methods 
//4. Decide how to provide access to the new class

public class Customer {
	
	private String firstName = "";
	private String lastName = "";
	
	private Address address = null;
	
	private Birthday birthDay = null;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Customer(String firstName, String lastName, String street,
			String city, String state, int postalCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address(street, city, state, postalCode);
	}
	
	public Customer(String firstName, String lastName, Address address,
			Birthday birthDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.birthDay = birthDay;
	}
	public static void main(String[] args){
		
		Customer sallySmith = new Customer("Sally", "Smith", "123 Main St", "Perry", "Iowa", 50220);
		
		
		System.out.println("Customer Name: " + sallySmith.getFirstName() + " " + sallySmith.getLastName());
		System.out.println("Address: " + sallySmith.address.getStreet() + " " + sallySmith.address.getCity() +
				" " + sallySmith.address.getState() + " " + sallySmith.address.getPostalCode());
		
		Address markJonesAddress = new Address("123 Main St", "Perry", "Iowa", 50220);
		
		Birthday markJonesBirthday = new Birthday(12,21,1974);
		
		Customer markJones = new Customer("Mark", "Jones", markJonesAddress, markJonesBirthday);
		
		
		System.out.println(markJones.birthDay);
		
		System.out.println(markJones.birthDay.getBirthDate());
		
		System.out.println(markJones.address);
		
	}

}

class Address{
	
	private String street = "";
	private String city = "";
	private String state = "";
	private int postalCode = 0;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	public Address(String street, String city, String state, int postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	
	public String toString(){
		
		return getStreet() + " " + getCity() + " " + getState() + " " + getPostalCode();
		
	}
	
}



class Birthday{

	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public Birthday(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String getBirthDate(){
		
		return getDay() + " / " + getMonth() + " / " + getYear();
		
	}
	
	public String toString(){
		
		return getDay() + " / " + getMonth() + " / " + getYear();
		
	}
	
}
