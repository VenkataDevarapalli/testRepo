package Streams;

import java.util.List;

public class Employee {
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String namee) {
		this.name = namee;
	}
	public int getAge() {
		//add teow
		return age;
	}
	public void setAge(int agee) {
		this.age = agee;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salaryy) {
		this.salary = salaryy;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public List<Address> getAdrList() {
		return adrList;
	}

	/*
	 * @Override public int hashCode() { System.out.println("Hashcode"); final int
	 * prime = 31; int result = 1; result = prime * result + ((name == null) ? 0 :
	 * name.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { System.out.println("Equals-");
	 * if (this == obj) return true; if (obj == null) return false; if (getClass()
	 * != obj.getClass()) return false; Employee other = (Employee) obj; if (name ==
	 * null) { if (other.name != null) return false; } else if
	 * (!name.equals(other.name)) return false; return true; }
	 */
	public void setAdrList(List<Address> adrList) {
		this.adrList = adrList;
	}
	int age;
	int salary;
	String company;
	List<Address> adrList;
	
	public Employee(String name,int age,List<Address> adr,String company,int salary) {
		this.name=name;
		this.age=age;
		this.adrList=adr;
		this.company=company;
		this.salary=salary;
	}
	
	

}
