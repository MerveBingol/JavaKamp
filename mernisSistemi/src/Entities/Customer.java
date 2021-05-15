package Entities;

import Absract.Entity;

public class Customer implements Entity {
	
	private int ›d;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String nationalityId;
	
	
	public Customer() {
		
	}


	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		this();
		›d = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}


	public int get›d() {
		return ›d;
	}


	public void set›d(int id) {
		›d = id;
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


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
	
	
	
	

}
