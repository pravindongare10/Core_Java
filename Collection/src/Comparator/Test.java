package Comparator;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		Set<Student>slist=null;
		Student stu1=new Student(2,"Pravin",26);
		Student stu2=new Student(3,"Rahul",28);
		Student stu3=new Student(1,"Rahul",24);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Option\n"
		+"1.rollnosort\n"
		+"2.namesort\n"
		+"3.agesort");
		int ch=sc.nextInt();
		  switch(ch)
		  {
		   case 1: 
			   Comparator<Student>st1=(o,o1)->o.getRollno()-o1.getRollno();
			   slist=new TreeSet<>(st1);
			   System.out.println("Sortrollno1");
		           break;
		   case 2: 
			   Comparator<Student>st2=(o,o1)->o.getName().compareTo(o1.getName());
			   slist=new TreeSet<>(st2);
		           break;
		   case 3: 
			   Comparator<Student>st3=(o,o1)->o.getAge()-o1.getAge();
			   slist=new TreeSet<>(st3);
		           break;
		  }
		  
		 slist.add(stu1);
		 slist.add(stu2);
		 slist.add(stu3);
		
			/*
			 * for(Student stu:slist) { System.out.println(stu.getRollno());
			 * System.out.println(stu.getName()); System.out.println(stu.getAge()); }
			 */
		 
		 slist.forEach((Stu)->{
			System.out.println(Stu.getRollno()); 
			System.out.println(Stu.getName());
			System.out.println(Stu.getAge());
		 });
	}
}
