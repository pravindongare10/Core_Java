package ComparablerPrac;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Employee emp=new Employee(2, "Pravin");
		Employee emp2=new Employee(1,"Rahul");
		
		Set<Employee> e=new TreeSet<Employee>();
		e.add(emp);
		e.add(emp2);
		
		e.forEach(em->{
			System.out.println(em.getEmpid());
			System.out.println(em.getEmpname());
		});
	}

}
