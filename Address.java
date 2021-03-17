package Streams;

public class Address {
	String city;
int age;
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
		this.pincode = pincodeppp;
		//added here
	}
	int pincode;
	

	public Address(String city,int pincodeee) {
		this.city=city;
		this.pincode=pincodeee;

	}
	

}
