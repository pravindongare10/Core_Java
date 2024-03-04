package basicsalary;

import java.util.Scanner;

public class Salarry {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the employee id and salary");
		int id = sc.nextInt();
		double salary = sc.nextInt();
		
		double houserent = salary*0.10;
		double da = salary*0.30;
		double ptax = salary*0.05;
		
		double homesalary = (salary+houserent+da)-ptax;
		
		System.out.println("Employee id is "+id+" and Employee Home salary is "+homesalary);
	
	}

}
