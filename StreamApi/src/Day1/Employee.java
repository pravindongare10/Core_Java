package Day1;

public class Employee {
	
	private int id;
	private String name;
	private String gendar;
	private int age;
	private double salary;
	private String dep;
	
	public Employee (int id,String name,String gendar,int age,double salary,String dep) {
		this.id=id;
		this.name=name;
		this.gendar=gendar;
		this.age=age;
		this.salary=salary;
		this.dep=dep;
	}
	
	public String getDep() {
		return dep;
	}
	public int getId() {
		return id;	
	}
	
	public String getName() {
		return name;
	}
	
	public String getGendar() {
		return gendar;
		
	}
	public int getAge() {
		return age;
		
	}
	public double getSalary() {
		return salary;	
	}

}
