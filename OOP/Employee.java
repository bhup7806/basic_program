package InputOutput.OOP;

import java.io.Serializable;

import rays.com.employee;

public class Employee implements Serializable  {
	private int id =0;
	private String firstname;
	private String lastname;
	private String address;
	private transient String tempvalue;
	
	
	public Employee() {}
	public Employee(int id,String firstname,String lastname,String address,String tempvalue) {
	this.id= id;
	this.firstname= firstname;
	this.firstname= lastname;
	this.address=address;
	this.tempvalue=tempvalue;	
	}
	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getAddress() {
		return address;
	}
	public String getTempvalue() {
		return tempvalue;
	}

}
