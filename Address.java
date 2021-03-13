package Streams;

public class Address {
	String city;
	public String getCity() {
		return city;
	}
	public void setCity(String citypp) {
		this.city = citypp;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincoddd) {
		this.pincode = pincodepp;
		//added here
	}
	int pincode;
	
	public Address(String city,int pincodepp) {
		this.city=city;
		this.pincode=pincodepp;
	}
	

}
