 package StreamAPi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleOne {

	public static void main(String[] args) {
		List<Employee> l= new ArrayList<>();
		l.add(new Employee(101,"Nilesh","pune",30,"Male",90000,"dev"));
		l.add(new Employee(102,"Kishor","satara",23,"Male",45000,"jdev"));
		l.add(new Employee(103,"Rudra","maval",31,"Male",55000,"anlyst"));
		l.add(new Employee(104,"Tushar","junnar",21,"Male",75000,"Tester"));
		l.add(new Employee(105,"Aasha","thane",27,"Female",60000,"dev"));
		l.add(new Employee(106,"Kavya","mumbai",35,"Female",33000,"HR"));
		l.add(new Employee(107,"Dipak","nagpur",29,"Male",67000,"jdev"));
		l.add(new Employee(108,"Ram","Dadar",26,"Male",53000,"HR"));
		System.out.println(l);
		// Find Average Age of Male And Female employee
		Map<String , Double> AvgAge = l.stream().collect(Collectors.groupingBy(e -> e.getGender(),
		Collectors.averagingInt(e -> e.getAge())));
		System.err.println(AvgAge);
		
		// Count Department
		Map<String, Long> DeptCount =l.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(DeptCount);
		
		// print the name of all department in the organization
		l.stream().map(d -> d.getDepartment()).distinct().forEach(e -> System.err.println(e));
		
		// how many male and Female employees are there in the organization
		Map<String , Long> mf = l.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(mf);
		
		//Get the details of highest paid employee in the organization
		Optional<Employee> highestPaidSalary =l.stream().collect(Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary())));
		System.err.println(highestPaidSalary);
		
		
		// count the number of employee in each department
		Map<String, Long> employeecountDept = l.stream().collect(Collectors.groupingBy(e ->e.getDepartment(), Collectors.counting()));
		
		Set<Map.Entry<String, Long>> entrySet = employeecountDept.entrySet();
		
		for(Map.Entry<String, Long> entry : entrySet)
		{
		System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		//OR
		
		System.err.println("**********************Another Way************************");
		for(Map.Entry entry: employeecountDept.entrySet())
		{
		System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		
		// what is the average salary of each department
		Map<String, Double> AvgSalaryOfEachDept =l.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),
		Collectors.averagingDouble(e -> e.getSalary())));
		Set<Map.Entry<String, Double>> avgsaldept = AvgSalaryOfEachDept.entrySet();
		
		for(Map.Entry<String, Double> entry : avgsaldept)
		{
		System.err.println(entry.getKey() +" - "+ entry.getValue());
		}
		
		
		
		//OR
		for(Map.Entry entry:AvgSalaryOfEachDept.entrySet())
		{
		System.out.println(entry.getKey() +" - "+ entry.getValue());
		}
		
		
		
		
		
		// Get the Details of youngest male employee in the HR devlopment department
		Optional<Employee> youngestEmployee = l.stream().filter(e -> e.getGender() == "Male"
		&& e.getDepartment() == "HR").min(Comparator.comparingInt(e->e.getAge()));
		System.err.println(youngestEmployee.get());
		// how many male and female employee are there in devloper team
		Map<String, Long> malefemaledeveloper = l.stream().filter(e -> e.getDepartment() ==
		"dev").collect(Collectors.groupingBy(e -> e.getName(),Collectors.counting()));
		System.out.println(malefemaledeveloper);
		// what is average Salary of male and female Employee
		Map<String, Double> avgsal = l.stream().collect(Collectors.groupingBy(e ->
		e.getGender(), Collectors.averagingDouble(e -> e.getSalary())));
		System.err.println(avgsal);
		// List down the names of all employees in each department
		Map<String, List<Employee>> departmentwiseEmp =
		l.stream().collect(Collectors.groupingBy(e -> e.getDepartment()));
		Set<Map.Entry<String, List<Employee>>> entry1 = departmentwiseEmp.entrySet();
		for(Map.Entry<String, List<Employee>> allentry : entry1)
		{
		System.out.println(allentry.getKey() + " - " + allentry.getValue());
		}
		// for(Map.Entry entry:departmentwiseEmp.entrySet())
		// {
		// System.err.println(entry.getKey());
		// List<String> list =(List<String>) entry.getValue();
		// list.forEach(System.out::println);
		// }
		//
		// System.err.println(departmentwiseEmp);
		for(Map.Entry entry:departmentwiseEmp.entrySet()) {
		System.out.println("**********************************************");
		System.out.println(entry.getKey());
		System.out.println("**********************************************");
		List<Employee> list=(List<Employee>) entry.getValue();
		list.forEach(System.out::println);
		}
		System.out.println("**********************************************");
		System.out.println(departmentwiseEmp);
		
		
		// what is the average salary and total salary of whole organization
		DoubleSummaryStatistics employeeSalStatistics =
		l.stream().collect(Collectors.summarizingDouble(e -> e.getSalary()));
		System.err.println("Average Salary: " + employeeSalStatistics.getAverage());
		System.out.println("Employee Total Salary: " + employeeSalStatistics.getSum());
		
		
		// OR same result as above
		Double avgSal = l.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.err.println("Average Salary: " + avgSal);
		Double avgSal1 = l.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("Sum of AllSalary: " + avgSal1);
		
		
		// who is the oldest employee in the organization ? what is his age and which department
		//he belongs to ?
		Optional<Employee> OldestEmployee =
		Optional.of(l.stream().max(Comparator.comparing(Employee :: getAge)).get());
		System.err.println("Oldest Employee in the Organization: " + OldestEmployee.get());
		// OR
		
		
		Optional<Employee> OldestEmployeeWrapper = l.stream().max(Comparator.comparing(e ->
		e.getAge()));
		System.out.println("Oldest Employee in the Organization: " +
		OldestEmployeeWrapper.get());
		
		System.out.println("****************************************************************");
		
		Map<String, Employee> byDepartment = l.stream().collect(Collectors.groupingBy(e ->
		e.getDepartment(),
		Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(e ->
		e.getSalary())), Optional :: get)));
		System.err.println(byDepartment);
		
		System.out.println("*****************************************************************");
		Map<String, List<Employee>> dept = l.stream().collect(Collectors.groupingBy(e ->
		e.getDepartment()));
		System.out.println(dept);
		System.out.println("**********************************************");
		
		
		// find second highest Salary
		Employee secondhighestSalary1 = l.stream().sorted((a, b) -> (int)a.getSalary() -
		(int)b.getSalary()).skip(6).findFirst().get();
		System.out.println("The Second highest Salary is: " + secondhighestSalary1);
		Employee secondhighestSalary2 = l.stream().sorted(Comparator.comparingDouble(Employee
		:: getSalary).reversed()).skip(1).findFirst().get();
		System.err.println("The Second highest Salary is: " + secondhighestSalary2);
		
		// Getting Gender Count of Male and Female
		Map<String, Long> age = l.stream().collect(Collectors.groupingBy(x -> x.getGender(),
		Collectors.counting()));
		System.out.println(age);
		System.out.println("*******************sorted by Id**********************");
		List<Employee> emp = l.stream().sorted(Comparator.comparingInt(e ->
		e.getId())).collect(Collectors.toList());
		emp.forEach(System.err::println);
		
		
		System.out.println("*********************sorted By Name********************");
		List<Employee> empName = l.stream().sorted(Comparator.comparing(e ->
		e.getName())).collect(Collectors.toList());
		empName.forEach(System.out::println);
		
		System.out.println("**************sorted By salary********************");
		// Sorting salary Using Comparator
		l.stream().sorted(Comparator.comparingDouble(e -> e.getSalary())).forEach(e ->
		System.err.println(e));
		
		
		System.out.println("*****************************************************************");
		l.stream().sorted(Comparator.comparingDouble(e ->
		e.getSalary())).forEach(System.err::println);
		// Max and Min Salary
		Optional<Employee> maxSal =
		l.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.getSalary())));
		System.out.println("Max Salaried Employee is: " + maxSal.get());
		Optional<Employee> minSal =
		l.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.getSalary())));
		System.out.println("Min Salaried Employee is: " + minSal.get());
		
		
		System.err.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		//Counting Empty String
		List<String> str = Arrays.asList("abc","","bcd","","defg","","jg","","mno","");
		long emptycount = str.stream().filter(s -> s.isEmpty()).count();
		System.err.println("The Empty String Count is: " + emptycount);
		
		
		//count string whose length is more than three
		str.stream().filter(s -> s.length() > 3).forEach(x -> System.out.println(x));
		//OR
		
		long lengthcount = str.stream().filter(s -> s.length() > 3).count();
		System.out.println("string whose length is more than three: " + lengthcount);
		//count string which is start with 'a'
		
		
		long countstartletter = str.stream().filter(s -> s.startsWith("a")).count();
		System.err.println("String which is start with 'a': " + countstartletter);
		
		
		// remove all empty string from list
		List<String> removeString = str.stream().filter(s ->
		!s.isEmpty()).collect(Collectors.toList());
		System.out.println("After remove all empty string from list: " + removeString);
		
		
		//create list with string more than 2 char
		List<String> morethan2char = str.stream().filter(s -> s.length() >
		2).collect(Collectors.toCollection(ArrayList::new));
		System.err.println("list with string more than 2 char: " + morethan2char);
		
		
		//convert string upper case and join with comma
		String toUpper = str.stream().filter(s -> !s.isEmpty()).map(s ->
		s.toUpperCase()).collect(Collectors.joining(","));
		System.out.println("string upper case and join with comma: " + toUpper);
		
		
		// create list of square of all distinct numbers
		List<Integer> itr = Arrays.asList(10,25,1,5,6,8,10,6,95,87,2,2,4,1,6,55,66,54,87);
		List<Integer> square = itr.stream().map(i -> i *
		i).distinct().collect(Collectors.toCollection(ArrayList::new));
		System.err.println("list of square of all distinct numbers: " + square);
		
		
		// reverse order print no with distinct
		List<Integer> reverseOrder =
		itr.stream().sorted(Collections.reverseOrder()).distinct().collect(Collectors.toList(
		));
		System.out.println("reverse order print no with distinct: " + reverseOrder);
		
		
		// num start with '1'
		List<String> numstartwith1 = itr.stream().map(e -> e + "").filter(e ->
		e.startsWith("1")).collect(Collectors.toList());
		System.err.println("num start with '1': " + numstartwith1);
		
		
		// duplicate number count in list with each no.
		Map<Integer, Long> counteachNo = itr.stream().map(e ->
		e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(counteachNo);
		
		
		
		
		// removeduplicate.forEach(System.err::println);
		// IntSummaryStatistics
		IntSummaryStatistics stat = itr.stream().mapToInt(n -> n).summaryStatistics();
		System.out.println("Maximum is: "+stat.getMax());
		System.err.println("Minimum is: "+stat.getMin());
		System.out.println("Count is: "+stat.getCount());
		System.err.println("Average is: "+stat.getAverage());
		System.out.println("Sum is: "+stat.getSum());
		System.err.println("Class is: "+stat.getClass());
		// OR
		Integer stat1 = itr.stream().max((e1, e2) -> e1.compareTo(e2)).get();
		System.out.println("Maximum is: "+stat1);
		Integer stat2 = itr.stream().min((e1, e2) -> e1.compareTo(e2)).get();
		System.out.println("Minimum is: "+stat2);
		
		
		System.out.println("*****************************************************************");
		// sort as a name wise and convert to uppercase
		List<String> name =
		Arrays.asList("nilesh","kishor","sagar","deepak","girish","ajay","sandip","vishal","bhushan");
		List<String> nameUpper = name.stream().sorted().map(e ->
		e.toUpperCase()).collect(Collectors.toList());
		
		// nameUpper.forEach(System.err::println);
		System.err.println("Name in Upper Case: " + nameUpper);
		// OR
		List<String> nameUpper1 =
		name.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Name in Upper Case: " + nameUpper1);
		
		
		// Find max from list itr
		Integer maxnum = itr.stream().max((n, o) -> n.compareTo(o)).get();
		System.out.println("The Maximum No from list itr is: " + maxnum);
		
		
	
	}

}
