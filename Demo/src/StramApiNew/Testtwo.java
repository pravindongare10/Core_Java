package StramApiNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Testtwo {

	public static void main(String[] args) {
		
		List<Student> stu=new ArrayList<>();
		stu.add(new Student(1,"Pravin","Male","Mech",72));
		stu.add(new Student(2,"Nikhil","Male","civil",92));
		stu.add(new Student(3,"guddi","female","Entc", 62));
		stu.add(new Student(4,"chimu","female","Entc", 55));
		
		
		
		//count the number of students in each department of the organization by the help of jdk8
		Map<String,Long>dep=stu.stream().collect(Collectors.groupingBy(d->d.getDepartment(),Collectors.counting()));
		System.out.println(dep);
		
		//highest marks student list of the organization by the help of jdk8.
		Double max=stu.stream().map(m->m.getMarks()).max((v1,v2)->v1.compareTo(v2)).get();
		System.out.println(max);
		
	}

}
