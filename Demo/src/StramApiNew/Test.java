  package StramApiNew;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import StreamAPi.Employee;

public class Test {

	public static void main(String[] args) {
		
		List<Employee>list=new ArrayList<>();  
		
		list.add(new Employee(1,"Pravin","Pangari",25,"Male", 50000,"Dev"));
		list.add(new Employee(2,"Nikhya","Kotul",27,"Male", 60000,"Dev"));
		list.add(new Employee(2,"Swap","Kotul",22,"Male", 70000,"Dev"));
		list.add(new Employee(4,"kishor","nashik",25,"Male", 80000,"Dev"));
		list.add(new Employee(5,"renuka","sangmner",20,"FeMale", 30000,"Comp"));
		list.add(new Employee(6,"monika","otur",25,"FeMale", 20000,"Comp"));
		list.add(new Employee(7,"rutuja","akole",18,"FeMale", 10000,"Entc"));
		
		// Find Average Age of Male And Female employee
		Map<String,Double>avg=list.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingInt(e->e.getAge())));
		System.out.println(avg); 
		
		//Find Departmet
		List <Employee> dep=list.stream().filter(e->e.getDepartment().equals("Entc")&& e.getSalary()>=10000).collect(Collectors.toList());
		dep.forEach(d->System.out.println(d.getDepartment()));
		
		//max sallary
		 Optional<Employee> sal=list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		 System.out.println(sal.get().getSalary());
		 
		 
		//Get the details of highest paid employee in the organization
			Optional<Employee> highestPaidSalary =list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.getSalary())));
			System.err.println(highestPaidSalary.get().getSalary());
		    
		 
		// Count Department
		 Map<String,Long>Count=list.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));
	
		System.out.println(Count);
		
		
		// print the name of all department in the organization 
		list.stream().map(d->d.getDepartment()).distinct().forEach(d->System.out.println(d));
		
		// how many male and Female employees are there in the organization
		Map<String , Long> mf = list.stream().collect(Collectors.groupingBy(e->e.getGender(), Collectors.counting()));
		System.out.println(mf);		
		
	}  

}
