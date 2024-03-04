package StreamAPi;

public class Employee {
	private int id;
	private String name;
	private String address;
	private int age;
	private String gender;
	private double salary;
	private String department;
	
	public Employee(int id, String name, String address, int age, String gender, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
