package ComparablerPrac;

public class Employee implements Comparable<Employee> {
	private int empid;
	private String empname;
	
	public Employee(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public String getEmpname() {
		return empname;
	}
	
	public int compareTo(Employee o) {
		//return this.empid-o.empid;
		return this.empname.compareTo(o.empname);
	}
}
