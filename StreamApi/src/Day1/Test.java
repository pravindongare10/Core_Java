package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(111,"Pravin","male",27,2222.22,"Mech"));
		list.add(new Employee(222,"nikhil","male",26,4444.66,"Mech"));
		list.add(new Employee(333,"gudhhi","female", 21, 555.500,"IT"));
		list.add(new Employee(4444,"chimu","female",25, 70000.00,"IT"));
		
		
		//Average age of Male and Female employees in the organization.
		Map<String,Double> avg=list.stream().collect(Collectors.groupingBy(gen->gen.getGendar(),Collectors.averagingInt(av->av.getAge())));
		System.out.println(avg);
		
		//Print the names of all department in the organization.
		List<String> d=list.stream().map(i->i.getDep()).distinct().collect(Collectors.toList());
		d.forEach(dt->System.out.println(dt));
		
		
		  
		
		
		
		
		
	}
	
	
	
	

}
