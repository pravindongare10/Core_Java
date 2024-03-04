package StreamAPi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringVovelsOccarance {

	public static void main(String[] args) {
		 // print square >=32
		List<Integer> ll = Arrays.asList(10,32,1,4,2,32,55,66,44,2,3,7,8,44,64,7);
		List<Integer> squarelist = ll.stream().filter(i -> i >=32).map(e -> e *
		e).collect(Collectors.toCollection(ArrayList :: new));
		System.err.println("The square Greater than equal to 32 all elements: " + squarelist);
		
		
		// find duplicate nos and counting
		Map<Integer, Long> duplicatecount =
		ll.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		;
		duplicatecount.forEach((x, y) -> System.out.println("Key = " + x +" "+ "Value = " +
		y));
		
		// OR
		for(Map.Entry entry : duplicatecount.entrySet())
		{
		System.err.println(entry.getKey() +" - "+ entry.getValue());
		}
		
		System.out.println("Duplicate Numbers with Count: " + duplicatecount);
		List<String> strr =Arrays.asList("nilesh","kishor","sagar","deepak","sagar","nilesh","moksha","deepika",
		"kishor");
		Map<String, Long> frequencycount = strr.stream().map(e ->
		e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.err.println("The Frequency Cout is: " + frequencycount);
		
		
		// Vowel Count
		System.out.println("*********************count vowels **********************");
		String s1="i love my india";
		long vowelcount = s1.chars().filter(c -> (c == 'a' || c == 'e' || c == 'i' || c == 'o'
		|| c == 'u')).count();
		System.out.println("The Total Vowel Count is: " +vowelcount);
		// Printing All String in List in Upper case
		strr.stream().map(e -> e.toUpperCase()).forEach(System.err::println);
		
		
		
		// vowels count from given string
		String strs="Hello Pravin Dongare";
		long vowels = strs.chars().filter(c -> ('a' == c || 'e' == c || 'i' == c || 'o' == c
		|| 'u' == c)).count();
		System.err.println("All vowels From Given String Are: " + vowels);
		
		
		// Count each character from string
		Map<Character, Long> charcount = strs.chars().mapToObj(x ->(char)x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charcount);	
		       
	} 

}
