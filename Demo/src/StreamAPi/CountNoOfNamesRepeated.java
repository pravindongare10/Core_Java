package StreamAPi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNoOfNamesRepeated {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(46,444,55,66,44,33);
		List<Integer>ls=list.stream().filter(i-> i%2==0).collect(Collectors.toList());
		ls.forEach(i->System.out.println(i));
		
		
		// Count No Of Names Repeated
		System.out.println("**********Count No Of Names Repeated *******************");
		List<String> namelist=Arrays.asList("nilesh","kishor","sagar","nilesh","deepak","kishor","nilesh","akshay",
		"sagar","kishor","nilesh");
		Map<String, Long> namecount =namelist.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.err.println("All Name Counting is: " + namecount);
		
		
		
		
		
	}

}
