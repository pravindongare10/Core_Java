package StramApiNew;

public class Student {

	private int rollno;
	private String name;
	private String Gender;
	private String Department;
	private double Marks;
	
	public Student(int rollno, String name, String gender, String department, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		Gender = gender;
		Department = department;
		Marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return Gender;
	}

	public String getDepartment() {
		return Department;
	}

	public double getMarks() {
		return Marks;
	}
	
	

}
