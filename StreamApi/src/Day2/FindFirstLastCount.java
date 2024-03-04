package Day2;

import java.util.Arrays;
import java.util.List;

public class FindFirstLastCount {

	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(2,5,7,6,5);
		
		long count=ls.stream().count();
		
		int first =ls.stream().findFirst().get();
		System.out.println(first);
		
		int last=ls.stream().skip(count-1).findFirst().get();
		System.out.println(last);

	}

}
