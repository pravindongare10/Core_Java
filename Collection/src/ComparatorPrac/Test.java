package ComparatorPrac;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(2, "Pravin");
        Employee e2 = new Employee(1, "Rahul");

        Set<Employee> emp = null;

        Scanner cc = new Scanner(System.in);

        System.out.println("Select Option :\n" + "1. empId sort\n" + "2. empName sort");

        int ch = cc.nextInt();

        switch (ch) {
            case 1:
                Comparator<Employee> st1 = Comparator.comparing(Employee::getEmpid);
                emp = new TreeSet<>(st1);
                break;
            case 2:
                Comparator<Employee> st2 = Comparator.comparing(Employee::getEmpname);
                emp = new TreeSet<>(st2);
                break;
        }

        emp.add(e1);
        emp.add(e2);

        // Print the sorted set
        for (Employee employee : emp) {
            System.out.println(employee.getEmpid() + " " + employee.getEmpname());
        }
	
	}

}
