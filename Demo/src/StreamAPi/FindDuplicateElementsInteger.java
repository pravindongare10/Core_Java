package StreamAPi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsInteger {
   public static void main(String[] args) {
	 //find duplicate elements integer
	 		List<Integer> list =
	 		Arrays.asList(1,55,1,22,54,65,2,8,9,7,5,8,9,6,4,7,55,66,7,546,4,85,652);
	 		Set<Integer> b = list.stream().filter(x -> Collections.frequency(list, x) >
	 		1).collect(Collectors.toSet());
	 		System.err.println("Using Set Duplicate Integers Are: " + b);
	 		
   }
}
