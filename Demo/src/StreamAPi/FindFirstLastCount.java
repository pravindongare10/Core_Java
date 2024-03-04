package StreamAPi;

import java.util.Arrays;
import java.util.List;

public class FindFirstLastCount {
 public static void main(String[] args) {
     List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     
     // Count of elements
	  long count = integerList.stream().count();
	  System.out.println("Count of Elements: " + count);
	  
	  // Find the first element
	  Integer firstElement = integerList.stream().findFirst().get();
	  System.out.println("First Element: " + firstElement);

	  // Find the last element
	  Integer lastElement = integerList.stream().skip(count-1).findFirst().get();
	  System.out.println("Last Element: " + lastElement);

	
}	

}
