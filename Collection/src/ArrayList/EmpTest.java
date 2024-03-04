package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("Pravin");
		
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("Nikhya");
		
		List<Employee>employee=new ArrayList<>();
		employee.add(emp1);
		employee.add(emp2);
		
		/*
		 * for(Employee emp:employee) { System.out.println(emp.getId());
		 * System.out.println(emp.getName()); }
		 */
		
	    Iterator<Employee>itr=employee.iterator();
		
	    while(itr.hasNext()) {
	    	Employee emp=itr.next();
	    	System.out.println(emp.getId());
	    	System.out.println(emp.getName());
	    }
	}

}
