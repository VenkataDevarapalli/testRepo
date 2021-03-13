package Streams;

public class Address {
	String city;
	public String getCity() {
		return city;
	}
	public void setCity(String cityyy) {
		this.city = cityyy;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincodeee) {
		this.pincode = pincodeee;
		//add more
		//added here
	}
	int pincode;
	
	public Address(String city,int pincodeee) {
		this.city=city;
		this.pincode=pincodeee;
	}
	

}
