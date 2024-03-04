package StreamAPi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOf {

	public static void main(String[] args) {
		//sum of the number
		List<Integer>ls=Arrays.asList(1,2,3,4);
		Optional<Integer>sum=ls.stream().reduce((a,b)->a+b);
		System.out.println(sum);
	}
	
}
