package Streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
hi sushma
public class Main {

	public static void main(String args[]) {
		//map,allmatch,anymatch,filter.flatmap,reduce,collect,count,distinct,sorted,skip,intStream,max,min
		//pending toArray and of()
		//collectors.groupby max  and min done average
		//collectors .groupby min  and summing statstics
		//heloe madndm
		List<Employee> empList=ConstructData.getList();
		Map<String, Optional<Employee>> result=empList.stream().collect(Collectors.groupingBy(
				Employee::getCompany, Collectors.reducing((e, e1)->getEmpwithMaxLenght(e,e1))));
		result.forEach((k,v)->System.out.println(k+" "+v.get().getName()));
		Map<String,String> mp = new HashMap<>();
		mp.merge(key, value, remappingFunction)
		
	
	}
	public static Employee getEmpwithMaxLenght(Employee e,Employee e1) {
		return e.getName().length()>e1.getName().length()?e:e1;
	}

}
