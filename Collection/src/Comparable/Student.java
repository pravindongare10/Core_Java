package Comparable;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(Student o) {
		//return this.rollno-o.rollno;
		return this.name.compareTo(o.name);
	}
	
}
