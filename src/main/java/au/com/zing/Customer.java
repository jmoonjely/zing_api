package au.com.zing;

import org.mule.el.datetime.DateTime;

// Class for holding the customer object

public class Customer {
	public Customer(){}
	public Customer(String id, String firstName, String lastName, String streetAddress, String city, String state,
			String postCode, DateTime updatedTime) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.postCode = postCode;
		this.updatedTime = updatedTime;
	}
	public Customer(String id, String firstName, String lastName, String streetAddress, String city, String state,
			String postCode ) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.postCode = postCode;
		 
	}
	private String id;
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String postCode;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", streetAddress="
				+ streetAddress + ", city=" + city + ", state=" + state + ", postCode=" + postCode + ", updatedtime="
				+ updatedTime + "]";
	}
	private DateTime updatedTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public DateTime getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedtime(DateTime updatedTime) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+updatedTime);
		this.updatedTime = updatedTime;
	}
	
	 
}
