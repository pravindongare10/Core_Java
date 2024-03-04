package StreamAPi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMinMax {

	public static void main(String[] args) {
		List<Integer>ls=Arrays.asList(2,3,4,5,6,7,8);
		  
		Optional<Integer>max=ls.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::valueOf)));
		System.out.println(max);
		
		Optional<Integer>maxx=ls.stream().max((v1,v2)->v1.compareTo(v2));
		System.out.println(maxx);
		
		int maxxx=ls.stream().sorted(Collections.reverseOrder()).distinct().findFirst().get();
		System.out.println(maxxx);
		
		Optional<Integer>min=ls.stream().collect(Collectors.minBy(Comparator.comparing(Integer::valueOf)));
		System.out.println(min);
		
		Optional<Integer>minn=ls.stream().min((v1,v2)->v1.compareTo(v2));
		System.out.println(minn);
		
		int minnn=ls.stream().sorted().distinct().findFirst().get();
		System.out.println(minnn);
	}

}
