package Entities;

import Abstract.Entity;

public class Gamer implements Entity{
	
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String nationalityId;
	
	public Gamer() {
		
	}

	public Gamer(String firstName, String lastName, int yearOfBirth, String nationalityId) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.nationalityId = nationalityId;
	}

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

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	
	
	
}
