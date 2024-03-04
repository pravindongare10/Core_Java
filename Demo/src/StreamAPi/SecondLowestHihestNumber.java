package StreamAPi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHihestNumber {

	public static void main(String[] args) {
		
		List<Integer>secH=Arrays.asList(1,5,6,3,8,43,44,55,4);
		int smax=secH.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(smax);
		
		
		
		List<Integer>secM=Arrays.asList(1,5,6,3,8,43,44,55,4);
		int smin=secM.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(smin);
	}

}
