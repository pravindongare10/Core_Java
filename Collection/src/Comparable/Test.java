package Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Student stu1=new Student(2,"Pravin",26);
		Student stu2=new Student(3,"Rahul",28);
		Student stu3=new Student(1,"Anil",24);
		
		Set<Student>slist=new TreeSet<>();
		slist.add(stu1);
		slist.add(stu2);
		slist.add(stu3);
		
		for(Student stu:slist) {
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getAge());
		}
		
	}
}
