package Streams;

public class Address {
	String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.city = city;
		//added here
	}
	int pincode;
	
	public Address(String city,int pincode) {
		this.city=city;
		this.pincode=pincode;
	}
	

}
