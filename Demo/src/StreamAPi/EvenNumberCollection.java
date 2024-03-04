


package StreamAPi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenNumberCollection {

	public static void main(String[] args) {
		/*
		 List<Integer> numbers = List.of(1, 4, 8, 40, 11, 22, 33, 99); 

		 List<Integer> evenNumbers = numbers.stream() .filter(n -> n % 2 == 0)
		  .collect(Collectors.toList()); evenNumbers.forEach(i->System.out.println(i));
		 */
		
	
		// charcount.forEach((k,v)->System.out.println(k+" - "+v));
		// find duplicate
		List<Integer> listint = Arrays.asList(5,3,4,4,6,7,6,5,3,2,1,9,8,7,1,9);
		Map<Integer, Long> duplicatecount1 =listint.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.err.println("All duplicate Number count is: " + duplicatecount1);
		duplicatecount1.forEach((k,v)->System.out.println(k+" - "+v));
		
		// charcount.forEach((k,v)->System.out.println(k+" - "+v));
		// find duplicate
		List<Integer> list = Arrays.asList(5,3,4,4,6,7,6,5,3,2,1,9,8,7,1,9);
		Map<Integer, Long> duplicat =list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.err.println("All duplicate Number count is: " + duplicat);
		
		duplicatecount1.forEach((k,v)->System.out.println(k+" - "+v));
				
				
				
						
	}

}
