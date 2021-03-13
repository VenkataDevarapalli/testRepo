package Streams;

import java.util.ArrayList;
import java.util.List;

public class ConstructData {

	public static List<Employee> getList() {
		Address homeAdrr = new Address("rajahmundry", 533105);
		Address offAdr = new Address("bangalore", 560083);
		List<Address> vAdd = new ArrayList<Address>();
		vAdd.add(homeAdr);
		vAdd.add(offAdr);
		Employee emp1 = new Employee("venkat", 40, vAdd, "oracle", 10000);

		Address hAdr = new Address("bandar", 369012);
		Address oAdr = new Address("hyderabad", 700120);
		List<Address> sAdd = new ArrayList<Address>();
		sAdd.add(hAdr);
		sAdd.add(oAdr);
		Employee emp2 = new Employee("menon", 30, sAdd, "jpmc", 10000);

		Address thAdr = new Address("jaipur", 200080);
		Address toAdr = new Address("bangalore", 560083);
		List<Address> tAdd = new ArrayList<Address>();
		tAdd.add(thAdr);
		tAdd.add(toAdr);
		Employee emp3 = new Employee("rohit sharma", 23, vAdd, "oracle", 50000);
		
		Address th1Adr = new Address("eluru", 200080);
		Address to1Adr = new Address("bangalore", 560083);
		List<Address> t1Add = new ArrayList<Address>();
		t1Add.add(th1Adr);
		t1Add.add(to1Adr);
		Employee emp4 = new Employee("ramesh", 45, t1Add, "oracle", 60000);
		
		Address homeAdr5 = new Address("rajahmundry", 533105);
		Address offAdr5 = new Address("bangalore", 560083);
		List<Address> vAdd5 = new ArrayList<Address>();
		vAdd.add(homeAdr5);
		vAdd.add(offAdr5);
		Employee emp5 = new Employee("venkat", 40, vAdd5, "oracle", 10000);

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		return list;

	}

}
