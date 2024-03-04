package PracticeStreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import StreamAPi.Employee;

public class Test {

	public static void main(String[] args) {
		
		List<Employee>list=new ArrayList<>();
		list.add(new Employee(1,"Pravin","Pangari",25,"Male",50000,"Dev"));
		list.add(new Employee(2,"Nikhya","Kotul",27,"Male", 60000,"Dev"));
		list.add(new Employee(2,"Swap","Kotul",22,"Male", 70000,"Dev"));
		list.add(new Employee(4,"kishor","nashik",25,"Male", 80000,"Dev"));
		list.add(new Employee(5,"renuka","sangmner",20,"FeMale", 30000,"Comp"));
		list.add(new Employee(6,"moni","lingdev",25,"FeMale", 20000,"Comp"));
		list.add(new Employee(7,"rutuja","akole",18,"FeMale", 10000,"Entc"));
		//avg male Female
		Map<String, Double> ls=list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(ls);
		//getdeparmet sallary<=1000
		List<Employee>dep=list.stream().filter(i->i.getDepartment().equals("Entc")&&i.getSalary()>=1000).collect(Collectors.toList());
		System.out.println(dep);
		//maxsallary
		Optional<Employee>avg=list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(list);
		//Count
		Map<String,Long>count=list.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.counting()));
		System.out.println(count);
		
		 
		
		
}
}