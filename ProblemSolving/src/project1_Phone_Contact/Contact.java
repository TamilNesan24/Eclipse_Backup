package project1_Phone_Contact;

import java.util.Collections;

public class Contact 
{

	  private String name;
	  private String email;
	  private String address;
	  private String type;
	  public Contact() {
		  this.email = email;
			this.address = address;
			
	  }
	 public Contact(String email, String address) {
		this.email = email;
		this.address = address;
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

